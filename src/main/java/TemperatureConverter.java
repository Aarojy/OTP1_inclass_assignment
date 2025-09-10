public class TemperatureConverter {

    public float fahrenheitToCelsius(float fahrenheit) {
        float celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public float celsiusToFahrenheit(float celsius) {
        float fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    public boolean isExtremeTemperature(double temperature) {
        return temperature < -40 || temperature > 50;
    }
}
