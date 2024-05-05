public class Main {
    public static void main(String[] args) {
        //this design pattern kind of replicates pub sub.
        // we have subjects which are getting observed for some data change.
        //we have observers which are doing the observation.

        //watch Riddi's video

        WheaterStationSubject wheaterStationSubject=new WheaterStationSubject();
        wheaterStationSubject.setHumidity(20);
        wheaterStationSubject.setTemp(20);
        new XiomiWheaterApp(wheaterStationSubject);
        wheaterStationSubject.update();
        wheaterStationSubject.setHumidity(10);
        wheaterStationSubject.setTemp(10);
        wheaterStationSubject.update();
    }
}

