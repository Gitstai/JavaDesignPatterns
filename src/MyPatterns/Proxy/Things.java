package MyPatterns.Proxy;

public class Things implements Proxy {
    @Override
    public void doThis() {
        System.out.println("the true things i have done");
    }
}
