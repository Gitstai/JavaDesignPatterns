package MyPatterns.Observer;

public class clients {
    public static void main(String[] args) {
        Observer obs = new ConcreteObserver();
        for (int i = 0; i < 5; i++) {
            Subject subject = new ConcreteSubject(String.valueOf(i));
            obs.add(subject);
        }
        obs.work();
    }
}
