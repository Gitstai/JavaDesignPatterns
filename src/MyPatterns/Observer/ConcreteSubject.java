package MyPatterns.Observer;

public class ConcreteSubject extends Subject {
    ConcreteSubject(String name) {
        super(name);
    }

    @Override
    public void update() {
        System.out.println("name is " + this.getName());
    }
}
