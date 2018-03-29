public class CurrentWeater implements IApiHandler {

    public String getCurrentWeather(){
        return "rainy";
    }
    @Override
    public String execute() {
        return getCurrentWeather();
    }

}
