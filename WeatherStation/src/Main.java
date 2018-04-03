public class Main {

    private static WeatherStation weatherStation;

    public static void main(String[] args) {
        test();
    }

    public Main(){
    }

    public static void test(){

        WeatherStation subject = new WeatherStation();

        new WeatherStationGUI(subject);

        subject.setState(subject.returnCurrentWeather());
    }

}
