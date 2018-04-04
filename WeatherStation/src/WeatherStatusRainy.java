public class WeatherStatusRainy extends WeatherStatusDecorator{

    public WeatherStatusRainy(SimpleWeatherStatus weatherStatus){
        super(weatherStatus);
    }
    @Override
    public String getWeatherStatus() {
        return "Rainy";
    }
}
