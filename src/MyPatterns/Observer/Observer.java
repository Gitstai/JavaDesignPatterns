package MyPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observer {
    ArrayList<Subject> list = new ArrayList<>();
    public void add(Subject sbs) {
        list.add(sbs);
    }
    public void remove(Subject sbs) {
        list.remove(sbs);
    }
    public abstract void work();

}
