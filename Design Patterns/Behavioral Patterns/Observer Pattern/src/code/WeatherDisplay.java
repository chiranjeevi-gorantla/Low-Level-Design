package code;

public class WeatherDisplay implements Observer {
    private float temperature;

    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }

    private void display() {
        System.out.println("Temperature: " + temperature + "°C");
    }
}
