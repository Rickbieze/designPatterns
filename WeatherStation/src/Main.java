public class Main {

    private static HistoryWeather historyWeather;
    private static CurrentWeater currentWeater;
    private static WeatherStation weatherStation;

    private static Data weather;

    public static void main(String[] args) {
        test();
    }

    public Main(){

    }

    public static void test(){
        weatherStation = new WeatherStation();
        historyWeather = new HistoryWeather();
        currentWeater = new CurrentWeater();


        weather = new Weather(new HistoryWeather());


        weatherStation.getApiData(weather);

        weather = new Weather(currentWeater);

        weatherStation.getApiData(weather);
    }
}
