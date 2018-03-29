public class WeatherStation {
    Weather weather;



    public WeatherStation(){

    }

    public void getApiData(Data weather){
        weather.apiCall.execute();
    }

}
