public class WeatherStatusFoggy extends WeatherStatusDecorator {

    public WeatherStatusFoggy(SimpleWeatherStatus weatherStatus){
        super(weatherStatus);

    }
    @Override
    public String getWeatherStatus() {
        return "Foggy";
    }
}
