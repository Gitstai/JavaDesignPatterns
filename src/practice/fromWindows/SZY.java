package practice.fromWindows;

public class SZY {

    private volatile static com.company.test.SZY szy = null;

    public String getBOYFRIEND() {
        return BOYFRIEND;
    }

    public void setBOYFRIEND(String BOYFRIEND) {
        this.BOYFRIEND = BOYFRIEND;
    }

    private String BOYFRIEND;

    private SZY(String boyFriend){
        this.BOYFRIEND = boyFriend;
    }

    public static com.company.test.SZY back(String boyFriend){
        if(szy == null){
            synchronized (com.company.test.SZY.class){
                if(szy == null){ szy = new com.company.test.SZY(boyFriend); }
            }
        }
        return szy;
    }
    public String console(String str){
        return str;
    }


}
