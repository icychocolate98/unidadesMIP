package unidades_mip;
/**
 *
 * @author daw117
 */
public class Potencia_MIP extends UnidadesApp_MIP{
    
    public static double kwACv(double kw) {
        cv = kw * 1.34102;
        return cv;
    }

    public static double cvAKw(double cv) {
        kw = cv / 1.341;
        return kw;
    }

    
}
