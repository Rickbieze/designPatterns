public class WeatherStationGUI extends Observer {

    public WeatherStationGUI(WeatherStation subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Weather: " + subject.getState() );
    }
}
