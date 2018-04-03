import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

    private List<Observer> observers = new ArrayList<Observer>();
    private String state;

    private static HistoryWeather historyWeather;
    private static CurrentWeater currentWeater;

    public String current;
    public String history;

    private static Data weather;

    public WeatherStation(){
        historyWeather = new HistoryWeather();
        currentWeater = new CurrentWeater();

        weather = new Weather(historyWeather);
        history = getApiData(weather);

        weather = new Weather(currentWeater);
        current = getApiData(weather);
    }

    public String getApiData(Data weather){
        return weather.apiCall.execute();
    }

    public String returnCurrentWeather(){
        return current;
    }

    public String returnHistoryWeather(){
        return history;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
