public class HistoryWeather implements IApiHandler {

    public void getHistoryWeather(){
        System.out.println("get history weather yeye");
    }

    @Override
    public void execute() {
        getHistoryWeather();
    }
}
