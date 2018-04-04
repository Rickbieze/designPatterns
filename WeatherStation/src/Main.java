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
        int[] weatherstatustest = new int[2];
        weatherstatustest[0]= 0;
        weatherstatustest[1] = 1;
        subject.setStatus(weatherstatustest);
        subject.setState(subject.returnCurrentWeather());
    }

}
