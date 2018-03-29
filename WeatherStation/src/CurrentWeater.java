public class CurrentWeater implements IApiHandler {

    public void getCurrentWeather(){
        System.out.println("get current weather ");
    }
    @Override
    public void execute() {
        getCurrentWeather();
    }

}
