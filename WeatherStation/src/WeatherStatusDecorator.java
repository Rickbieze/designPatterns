import java.util.ArrayList;

public abstract class WeatherStatusDecorator implements SimpleWeatherStatus {
    protected SimpleWeatherStatus weatherStatus;

    public WeatherStatusDecorator(SimpleWeatherStatus weatherStatus){
        this.weatherStatus = weatherStatus;
    }

    @Override
    public String getWeatherStatus() {
        return weatherStatus.getWeatherStatus();
    }
}