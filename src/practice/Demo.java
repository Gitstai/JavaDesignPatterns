package practice;

public class Demo {
    static int i = 1;
    final int x = 0;
    public static void main(String[] args) {
        String s1 = new String("123");
        String s2 = new String(s1);
        System.out.println();
    }
    public static int fun(){
        return 1;
    }
}
class Son extends Demo {
    static int i = 2;
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println();
    }
    public void method(){
        System.out.println(i);
    }
}
