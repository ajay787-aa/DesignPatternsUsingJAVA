public class XiomiWheaterApp implements Observers{

    WheaterStationSubject subject;
    XiomiWheaterApp(WheaterStationSubject subject){
        this.subject=subject;
        subject.registerObserver(this);
    }
    @Override
    public void update() {
        System.out.println("add+ "+ subject.getHumidity()+" some more ads+"+ subject.getTemp());
    }
}
