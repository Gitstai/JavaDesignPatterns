package MyPatterns.Observer;

public abstract class Subject {
    private String name;
    Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void update();
}
