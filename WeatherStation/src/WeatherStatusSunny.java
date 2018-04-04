public class WeatherStatusSunny extends WeatherStatusDecorator {

    public WeatherStatusSunny(SimpleWeatherStatus weatherStatus){
        super(weatherStatus);
    }
    @Override
    public String getWeatherStatus() {
        return "Sunny";
    }
}
