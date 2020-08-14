package practice.fromWindows;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class client {
    public static void main(String[] args) throws InterruptedException {

        String boyFriend = XMLUtil.getBoyFriend();
        SZY szy = SZY.back(boyFriend);
        System.out.println(szy.getBOYFRIEND());

        int i=0;
        Set<String> set = new HashSet<>();
        while(i < 100){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    set.add(szy.console(UUID.randomUUID().toString()));
                }
            }).start();
            i++;
        }
        Thread.sleep(1500);
        System.out.println(set.size());
        for (String str:set) {
            System.out.println(str);
        }
        HashMap<Integer, Integer> map = new HashMap<>();

    }
}
