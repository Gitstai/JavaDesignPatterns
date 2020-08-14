package companyInterview.langchao;

public class Test extends Thread {
    String name;

    public static void main(String[] args) {
//        Test t = new Test();
//        t.execute();
        Thread thread = new Test("AAAA");
        thread.start();
        Thread t = new Thread(()->{

        });
    }
//    Test(){
//
//    }
    Test(String name){
        this.name = name;
    }
    public String getThreadName(){
        return name;
    }
//    public void execute(){
//        Thread first = new Test("one");
//        first.start();
//        Thread second = new Test("two");
//        second.start();
//    }

    public void run(){
        System.out.println("?????");
    }

    public void start(){
        for (int i = 0; i < 2; i++) {
            System.out.println(this.getThreadName()+i);
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
