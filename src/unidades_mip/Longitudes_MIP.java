package unidades_mip;
/**
 *
 * @author daw117
 */
public class Longitudes_MIP extends UnidadesApp_MIP{

    public static double kmsAMillas(double kilometros) {
        millas = kilometros * 0.621371;
        return millas;
    }

    public static double millasAKm(double millas) {
        kilometros = millas / 1.609344;
        return kilometros;
    }

    public static double millasAPulgadas(double millas) {
        pulgadas = millas * 63360;
        return pulgadas;
    }

    public static double pulgadasAMillas(double pulgadas) {
        millas = pulgadas / 63360;
        return millas;
    }

}