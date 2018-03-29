public class HistoryWeather implements IApiHandler {

    public String getHistoryWeather(){
        return "sunny";
    }

    @Override
    public String execute() {
        return getHistoryWeather();
    }
}
