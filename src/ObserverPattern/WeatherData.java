package ObserverPattern;

//Publishers(Subject) + Subscribers(Observer) = Observer Pattern
/*
1. The Subject object manages some important data.
2. The Observer have subscribed to (registered with) the Subject
   to receive updates when the Subject's data changes.
3. When data in the Subject changes, the observers are notified.
4. New data values are communicated to the observer in some form when they change.
 */
// OBSERVER PATTERN : Defines a one-to-many relationship between a set of objects so that when
// one object changes state, all of its dependents are notified and updated automatically.
/*
1. One subject, who notifies many observers when something in the subject changes.
2. The observers are dependent on the subject.
3. When the subject's state changes, observers are notified.
 */
/*
Design Principle :
1. Strive for loosely coupled designs between objects that interact.
 */

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(temperature, humidity, pressure);
        }
    }
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void getTemperature(){

    }

    public void getHumidity(){

    }

    public void getPressure(){

    }

    public void measurementsChanged(){
        notifyObservers();
    }
}
