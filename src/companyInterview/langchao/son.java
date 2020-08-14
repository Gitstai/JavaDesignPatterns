package companyInterview.langchao;

public class son extends dad{



    public int get(){
        return 0;
    }

    public static void main(String[] args) {
        dad dad = new dad();
        son son = new son();
        System.out.println(dad.get()+" " + son.get());
    }
}
