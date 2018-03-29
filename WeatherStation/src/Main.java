public class Main {

    private static HistoryWeather historyWeather;
    private static CurrentWeater currentWeater;
    private static WeatherStation weatherStation;

    public static void main(String[] args) {
        test();
    }

    public Main(){

    }

    public static void test(){
        weatherStation = new WeatherStation();
        historyWeather = new HistoryWeather();
        currentWeater = new CurrentWeater();
        weatherStation.getApiData(historyWeather);
        weatherStation.getApiData(currentWeater);
    }
}
