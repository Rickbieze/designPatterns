import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

    private List<Observer> observers = new ArrayList<Observer>();
    private String state;

    private static HistoryWeather historyWeather;
    private static CurrentWeater currentWeater;

    public String current;
    public String history;

    public ArrayList<SimpleWeatherStatus> weatherStatuses;

    private static Data weather;

    public WeatherStation(){
        historyWeather = new HistoryWeather();
        currentWeater = new CurrentWeater();

        weather = new Weather(historyWeather);
        history = getApiData(weather);

        weather = new Weather(currentWeater);
        current = getApiData(weather);

        weatherStatuses = new ArrayList<>(10);
    }

    public void setStatus(int[] weatherStatusCodes){

        WeatherStatus weatherStatus = new WeatherStatus();
        for (int weatherStatusCode: weatherStatusCodes) {
            switch (weatherStatusCode){
                case 0: weatherStatuses.add(new WeatherStatusCloudy(weatherStatus)); break;
                case 1: weatherStatuses.add(new WeatherStatusFoggy(weatherStatus)); break;
                case 2: weatherStatuses.add(new WeatherStatusRainy(weatherStatus)); break;
                case 3: weatherStatuses.add(new WeatherStatusSnowy(weatherStatus)); break;
                case 4: weatherStatuses.add(new WeatherStatusSunny(weatherStatus)); break;
                default: weatherStatuses.add(new WeatherStatus()); break;
            }
        }
        getWeatherStatusMessage();
    }

    public void getWeatherStatusMessage(){
        String message = "";
        for (SimpleWeatherStatus status: weatherStatuses){
         message += status.getWeatherStatus();
        }
        System.out.println(message);
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
