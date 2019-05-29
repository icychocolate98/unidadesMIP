package unidades_mip;

/**
 *
 * @author daw117
 */
public class Temperatura_MIP extends UnidadesApp_MIP{
    
    public static double celsiusAFahrenheit(double celsius) {
        fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }

    public static double fahrenheitACelsius(double fahrenheit) {
        celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }
    
}