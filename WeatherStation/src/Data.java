public abstract class Data {
    protected IApiHandler apiCall;

    protected Data(IApiHandler apiCall){
        this.apiCall = apiCall;
    }

}
