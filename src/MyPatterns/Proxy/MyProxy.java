package MyPatterns.Proxy;

public class MyProxy implements Proxy {
    private Proxy obj;

    MyProxy(Proxy obj) {
        this.obj = obj;
    }

    @Override
    public void doThis() {
        System.out.println("1111");
        obj.doThis();
        System.out.println("2222");
    }
}
