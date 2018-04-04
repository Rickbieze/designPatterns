import java.util.concurrent.TimeUnit;

public class Main {

    private static WeatherStation weatherStation;

    public static void main(String[] args) throws InterruptedException {
        runWeatherStation();
    }

    public Main(){
    }

    public static void runWeatherStation() throws InterruptedException {
        WeatherStation subject = new WeatherStation();
        new WeatherStationGUI(subject);
        subject.setState(subject.returnHistoryWeather());
        TimeUnit.SECONDS.sleep(10);
        subject.setState(subject.returnCurrentWeather());

    }

}
