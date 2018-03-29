public class Main {

    private HistoryWeather historyWeather;
    private CurrentWeater currentWeater;
    private WeatherStation weatherStation;

    public static void main(String[] args) {

    }

    public Main(){
        weatherStation = new WeatherStation();
    }

    public void test(){
        historyWeather = new HistoryWeather();
        weatherStation.getApiData(historyWeather);
    }
}
