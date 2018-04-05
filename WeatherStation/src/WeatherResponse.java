public class WeatherResponse {

    private String location;
    private String type;
    private int temperature;
    private int humidity;
    private int [] weatherStatusses;

    public WeatherResponse(int temperature, int humidity, int[] weatherStatusses, String location, String type){
        this.temperature = temperature;
        this.humidity = humidity;
        this.weatherStatusses = weatherStatusses;
        this.location = location;
        this.type = type;
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

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }
}
