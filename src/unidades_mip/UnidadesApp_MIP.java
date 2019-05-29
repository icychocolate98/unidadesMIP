// Clase Principal UnidadesAPP_MIP - Pablo
package unidades_mip;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author daw116
 */
public class UnidadesApp_MIP {

    private static Scanner leer = new Scanner(System.in);
    //ATRIBUTOS UNIDADES
    static double kilometros = 0.0;
    static double millas = 0.0;
    static double pulgadas = 0.0;
    //Unidades potencia
    static double kw = 0.0;
    static double cv = 0.0;
    static double ftlb = 0.0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat df = new DecimalFormat("#.00");
        int op = 0;

        do {
            op = mostrarMenuPrincipal();
            switch (op) {

                case 1:
                    menuTransformarLongitud();
                    System.out.println("Introduzca una opcion.");
                    int opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("Introduzca los km");
                            kilometros = leer.nextInt();
                            millas = Longitudes_MIP.kmsAMillas(kilometros);
                            System.out.println(kilometros + " kilometros son: " + df.format(millas) + " millas");
                            break;
                        case 2:
                            System.out.println("Introduzca las millas");
                            millas = leer.nextInt();
                            kilometros = Longitudes_MIP.millasAKm(millas);
                            System.out.println(millas + " millas son: " + df.format(kilometros) + " kilometros");
                            break;
                        case 3:
                            System.out.println("Introduzca las millas");
                            millas = leer.nextInt();
                            pulgadas = Longitudes_MIP.millasAPulgadas(millas);
                            System.out.println(millas + " millas son: " + df.format(pulgadas) + " pulgadas");
                            break;
                        case 4:
                            System.out.println("Introduzca las pulgadas");
                            pulgadas = leer.nextInt();
                            millas = Longitudes_MIP.pulgadasAMillas(pulgadas);
                            System.out.println(pulgadas + " pulgadas son: " + df.format(millas) + " millas");
                            break;
                        case 5:
                            mostrarMenuPrincipal();
                            break;

                    }
                case 2:
                    menuTransformarPotencia();
                    System.out.println("Introduzca una opcion.");
                    opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("Introduzca los Kw");
                            kw = leer.nextInt();
                            cv = Longitudes_MIP.kwACv(kw);
                            System.out.println(kw + " kw son: " + df.format(cv) + " cv");
                            break;
                        case 2:
                            System.out.println("Introduzca los cv");
                            cv = leer.nextInt();
                            kw = Longitudes_MIP.cvAKw(cv);
                            System.out.println(cv + " cv son: " + df.format(kw) + " kw");
                            break;
                        case 3:
                            System.out.println("Introduzca los kw");
                            kw = leer.nextInt();
                            ftlb = Longitudes_MIP.kwAFtlb(kw);
                            System.out.println(kw + " kw son: " + df.format(ftlb) + " ftlb");
                            break;
                        case 4:
                            System.out.println("Introduzca los ftlb");
                            ftlb = leer.nextInt();
                            kw = Longitudes_MIP.ftlbAKw(ftlb);
                            System.out.println(ftlb + " ftlb son: " + df.format(kw) + " kw");
                            break;
                        case 5:
                            mostrarMenuPrincipal();
                            break;

                    }
                    break;
                case 3:
                    //menuTransformarTemperatura();
                    break;
                case 4:
                    break;
            }

        } while (op != 4);
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

    public static int menuTransformarLongitud() {
        System.out.println("1.-Transformar Kms a Millas");
        System.out.println("2.-Transformar Millas a Kms");
        System.out.println("3.-Transformar Millas a pulgadas");
        System.out.println("4.-Transformar Pulgadas a Millas");
        System.out.println("5.-Volver al menú anterior");

    }

    public static int menuTransformarPotencia() {
        System.out.println("1.-Transformar KW a CV");
        System.out.println("2.-Transformar CV a KW");
        System.out.println("3.-Transformar KW a Ft/Lb");
        System.out.println("4.-Transformar Ft/Lb a KW");
        System.out.println("5.-Volver a menú anterior");

    }
}
