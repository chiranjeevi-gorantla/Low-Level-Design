import code.WeatherDisplay;
import code.WeatherStation;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        WeatherDisplay weatherDisplay1 = new WeatherDisplay();
        WeatherDisplay weatherDisplay2 = new WeatherDisplay();

        weatherStation.addObserver(weatherDisplay1);
        weatherStation.addObserver(weatherDisplay2);

        weatherStation.setTemperature(25.0f);
        weatherStation.setTemperature(13.0f);

        weatherStation.removeObserver(weatherDisplay2);
        weatherStation.setTemperature(9.0f);
    }
}