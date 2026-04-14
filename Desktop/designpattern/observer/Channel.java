package observer;
import java.util.*;
public class Channel implements Subject{
    List<Observer> subs=new ArrayList<>();
     private String latestVideo;
    public void addObserver(Observer o){
        subs.add(o);
    }
    public void removeObserver(Observer o){
        subs.remove(o);
    }
    public void uploadVideo(String title) {
        this.latestVideo = title;
        notifyObservers();
    }

    public void notifyObservers(){
        for(Observer o: subs){
            o.update(latestVideo);
        }
    }
}
