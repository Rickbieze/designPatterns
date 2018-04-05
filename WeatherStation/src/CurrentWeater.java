public class CurrentWeater implements IApiHandler {

    public WeatherResponse getCurrentWeather(){
        int[] weatherstatuses = new int[2];
        weatherstatuses[0]= 0;
        weatherstatuses[1] = 1;
        return new WeatherResponse(25,75,weatherstatuses, "Amsterdam", "current");
    }
    @Override
    public WeatherResponse execute() {
        return getCurrentWeather();
    }

}
