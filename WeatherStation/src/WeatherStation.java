import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

    private List<WeatherObserver> weatherObservers = new ArrayList<WeatherObserver>();
    private WeatherResponse state;

    private static HistoryWeather historyWeather;
    private static CurrentWeater currentWeater;

    public WeatherResponse current;
    public WeatherResponse history;

    public ArrayList<SimpleWeatherStatus> weatherStatuses;

    private static Data weather;

    public WeatherStation(){
        historyWeather = new HistoryWeather();
        currentWeater = new CurrentWeater();

        weather = new Weather(historyWeather);
        history = getApiData(weather);

        weather = new Weather(currentWeater);
        current = getApiData(weather);

    }

    public void setStatus(int[] weatherStatusCodes){
        weatherStatuses = new ArrayList<>();
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
    }

    public String getWeatherStatusMessage(WeatherResponse toFormat){
        String message = "Location: "+ toFormat.getLocation() + System.lineSeparator() + "date: " + toFormat.getType() + System.lineSeparator() + "Temperature: " + toFormat.getTemperature() +System.lineSeparator()+" Humidity: " + toFormat.getHumidity() +System.lineSeparator() +" weatherstatuses: " ;
        for (SimpleWeatherStatus status: weatherStatuses){
         message += status.getWeatherStatus() + " ";
        }
        return message;
    }

    public WeatherResponse getApiData(Data weather){
        return weather.apiCall.execute();
    }

    public WeatherResponse returnCurrentWeather(){
        setStatus(current.getWeatherStatusses());
        getWeatherStatusMessage(current);
        return current;
    }

    public WeatherResponse returnHistoryWeather(){
        setStatus(history.getWeatherStatusses());
        getWeatherStatusMessage(history);
        return history;
    }

    public String getState() {
        return getWeatherStatusMessage(state);
    }

    public void setState(WeatherResponse state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(WeatherObserver weatherObserver){
        weatherObservers.add(weatherObserver);
    }

    public void notifyAllObservers(){
        for (WeatherObserver weatherObserver : weatherObservers) {
            weatherObserver.update();
        }
    }
}
