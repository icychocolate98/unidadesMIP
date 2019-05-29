// Clase Principal UnidadesAPP_MIP - Pablo
package unidades_mip;

import java.util.Scanner;

/**
 *
 * @author daw116
 */
public class UnidadesApp_MIP {

    Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int op = 0;

        do {
            op = mostrarMenuPrincipal();
            switch (op) {

                case 1:
                    //menuTransformarLongitud();
                    break;
                case 2:
                    //menuTransformarPotencia();
                    break;
                case 3:
                    //menuTransformarTemperatura();
                    break;
                case 4:
                    break;
            }

        } while (op !=4);
    }

    public static int mostrarMenuPrincipal() {
        int op = 0;
        final int SALIR = 4;

        System.out.println("1.-Transformar Longitud");
        System.out.println("2.-Transformar Potencia");
        System.out.println("3.-Transformar Temperatura");
        System.out.println("4.- SALIR");
        return op;
    }
}

