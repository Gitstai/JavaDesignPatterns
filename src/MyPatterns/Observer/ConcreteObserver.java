package MyPatterns.Observer;

public class ConcreteObserver extends Observer {


    @Override
    public void work() {
        for (Subject subject : list) {
            subject.update();
        }
    }
}
