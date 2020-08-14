package companyInterview.weipinhui;

public class Main {
    public static String change(String s, int i, StringBuffer sb, Person p){
        s="123";
        i=3;
        sb.append("woshi");
        p.setAge(100);
        sb = new StringBuffer("sbsb");
        p = new Person("bb",44);
        return s;
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("buff");
        String s = "aaa";
        int i = 1;
        Person p = new Person("aa",12);
        i=2;
        change(s,i,sb,p);
//        s="222";
        System.out.println(s);
        System.out.println(i);
        System.out.println(sb.toString());
        System.out.println(p);
    }
}

class Person{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    String name;
    int age;
    Person(String name, int age){
        this.age = age;
        this.name = name;
    }
}
