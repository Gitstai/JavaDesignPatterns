package practice;

public class Boxing {
    public static void main(String[] args) {



        /*
        true
        false
        true
        true
        true???
        true
        true??
         */

        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        Long h = 2L;
        String str = "111";

        System.out.println(c==d);//true
        System.out.println(e==f);//false
        System.out.println(c==(a+b));//true
        System.out.println(c.equals(a+b));//true
        System.out.println(g==(a+b));//true
        System.out.println(g.equals(a+b));//false
        System.out.println(g.equals(a+h));//true
    }
}
