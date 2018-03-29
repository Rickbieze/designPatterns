public class WeatherStation {

    private static HistoryWeather historyWeather;
    private static CurrentWeater currentWeater;

    private static Data weather;



    public WeatherStation(){
        historyWeather = new HistoryWeather();
        currentWeater = new CurrentWeater();

        weather = new Weather(historyWeather);
        String history = getApiData(weather);
        System.out.println(history);

        weather = new Weather(currentWeater);
        String current = getApiData(weather);
        System.out.println(current);
    }

    public String getApiData(Data weather){

        return weather.apiCall.execute();

    }

}
