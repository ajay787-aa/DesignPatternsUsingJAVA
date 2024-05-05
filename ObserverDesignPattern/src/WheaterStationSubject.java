import java.util.ArrayList;
import java.util.List;

public class WheaterStationSubject {
    int temp;
    int humidity;

    private ArrayList<Observers> arrayList;
    public int getTemp() {
        return temp;
    }
    WheaterStationSubject(){
        arrayList=new ArrayList<>();
    }
    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

   public void registerObserver(Observers observers){
        this.arrayList.add(observers);
   }
    public void update() {
        notifyObservers(temp,humidity);
    }

    public void notifyObservers(int temp,int humidity){
        for(Observers observers:arrayList)
            observers.update();
    }
}
