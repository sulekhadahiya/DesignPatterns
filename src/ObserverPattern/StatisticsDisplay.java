package ObserverPattern;

public class StatisticsDisplay implements Observer, DisplayElement{

    private WeatherData weatherData;
    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void display() {  // Display the average, min and max measurements

    }

    @Override
    public void update() {

    }
}
