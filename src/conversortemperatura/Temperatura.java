
package conversortemperatura;


public class Temperatura {
    public static double celsiusFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    
    public static double celsiusKelvin(double c){
        return c + 273.15;
    }
    public static double fahrenheitCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    public static double fahrenheitKelvin(double f) {
        return (f - 32) * 5 / 9 + 273.15;
    }
    public static double kelvinCelsius(double k) {
        return k - 273.15;
    }
    public static double kelvinFahrenheit(double k) {
        return (k - 273.15) * 9 / 5 + 32;
    }
    
}
