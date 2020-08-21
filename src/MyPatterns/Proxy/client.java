package MyPatterns.Proxy;

public class client {
    public static void main(String[] args) {
        Proxy proxy = new MyProxy(new Things());
        proxy.doThis();
    }
}
