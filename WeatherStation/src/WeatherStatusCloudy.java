public class WeatherStatusCloudy extends WeatherStatusDecorator {

    public WeatherStatusCloudy(SimpleWeatherStatus weatherStatus){
        super(weatherStatus);
    }

    @Override
    public String getWeatherStatus() {
        return getCloudyStatus();

    }

    private String getCloudyStatus(){
        return "Cloudy";
    }

}
