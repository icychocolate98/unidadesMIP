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

    public static double kwAFtlb(double kw) {
        ftlb = kw * 737.562149;
        return ftlb;
    }

    public static double ftlbAKw(double ftlb) {
        kw = ftlb * 0.001356;
        return kw;
    }
    
}
