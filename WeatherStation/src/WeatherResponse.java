public class WeatherResponse {

    private int temperature;
    private int humidity;
    private int [] weatherStatusses;

    public WeatherResponse(int temperature, int humidity, int[] weatherStatusses){
        this.temperature = temperature;
        this.humidity = humidity;
        this.weatherStatusses = weatherStatusses;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public int[] getWeatherStatusses() {
        return weatherStatusses;
    }
}
