package practice.fromWindows;

public class SZY {

    private volatile static SZY szy = null;

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

    public static SZY back(String boyFriend){
        if(szy == null){
            synchronized (SZY.class){
                if(szy == null){ szy = new SZY(boyFriend); }
            }
        }
        return szy;
    }
    public String console(String str){
        return str;
    }


}
