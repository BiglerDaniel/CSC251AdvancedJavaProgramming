/*
 * daniel bigler    biglerd7304
 * 100719
 * gets, sets, etc, classes for converting fahrenheit to celsius and kelvin
 */
package inclass_14_1007_biglerdaniel;
public class Temperature {
    // fields
    private final double ftemp;   // fahrenheit temperature
    private double celsius;
    private double kelvin;
    /**
     * Constructor
     * @param temperature The fahrenheit temperature
     */
    
    public Temperature(double temperature)
    {
        ftemp = temperature;
    }
    
    /**
     * The setFahrenheit method accepts a Fahrenheit temperature as a double and
     * stores it in the ftemp field
     * @param ftemp 
     */
    
    public void setFahrenheit (double ftemp)
    {
        double temperature;
        temperature = ftemp;
    }
    
    /**
     * getFahrenheit method
     * @return the value of the ftemp field, as a Fahrenheit temperature
     * no conversion required
     */
    
    public double getFahrenheit()
    {
        return ftemp;
    }
    
    /**
     * getCelsuis method
     * @return getCelsius
     * returns the value of the ftemp field converted to Celsius
     */
    
    public double getCelsuis(ftemp)
    {
        
        celsius = (5/9) * (ftemp - 32);
        return celsius;
    }
    
    /**
     * getKelvin method
     * @return the value of the ftemp field, as a Fahrenheit
     */
    
    public double getKelvin(ftemp)
    {
        
        kelvin = ((5/9) * (ftemp - 32)) + 273;
        return kelvin;
    }
}
