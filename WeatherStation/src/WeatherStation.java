public class WeatherStation {
    Weather weather;



    public WeatherStation(){

    }

    public void getApiData(IApiHandler apiCall){
        apiCall.execute();
    }

}
