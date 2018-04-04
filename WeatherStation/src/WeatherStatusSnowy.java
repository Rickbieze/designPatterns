public class WeatherStatusSnowy extends WeatherStatusDecorator {

    public WeatherStatusSnowy(SimpleWeatherStatus weatherStatus){
        super(weatherStatus);
    }
    @Override
    public String getWeatherStatus() {
        return "Snowy";
    }
}
