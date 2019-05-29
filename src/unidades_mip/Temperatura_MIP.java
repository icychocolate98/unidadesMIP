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

    public static double celsiusAKelvin(double celsius) {
        kelvin = celsius + 273.15;
        return kelvin;
    }

    public static double kelvinACelsius(double kelvin) {
        celsius = kelvin - 273.15;
        return celsius;
    }
    
}