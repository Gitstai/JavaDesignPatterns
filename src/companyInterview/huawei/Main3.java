package companyInterview.huawei;

class StaticSuper{
    public static String staticGet(){
        return "Base staticGet()";
    }
    public String dynamicGet(){
        return "Base dynamicGet()";
    }
}

class StaticSub extends StaticSuper{
    public static String staticGet(){
        return "Derived staticGet()";
    }
    public String dynamicGet(){
        return "Derived dynamicGet()";
    }
}

public class Main3 {
    public static void main(String[] args) {
        StaticSub sup = new StaticSub();
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
    }
}