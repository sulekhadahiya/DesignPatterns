package ObserverPattern;

public class ForecastDisplay implements Observer, DisplayElement{

    private WeatherData weatherData;
    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void display() {   // Display the forecast

    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }
}
