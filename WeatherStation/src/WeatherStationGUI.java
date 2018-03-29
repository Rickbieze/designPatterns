public class WeatherStationGUI extends Observer {

    public WeatherStationGUI(Main main){
        this.subject = main;
        this.subject.attach(this);
    }


    @Override
    public void update() {
        subject.getState();
    }
}
