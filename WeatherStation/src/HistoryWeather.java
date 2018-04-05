public class HistoryWeather implements IApiHandler {

    public WeatherResponse getHistoryWeather(){
        int[] weatherstatuses = new int[2];
        weatherstatuses[0]= 2;
        weatherstatuses[1] = 3;
        return new WeatherResponse(11,13,weatherstatuses ,"Amsterdam", "History");
    }

    @Override
    public WeatherResponse execute() {
        return getHistoryWeather();
    }
}
