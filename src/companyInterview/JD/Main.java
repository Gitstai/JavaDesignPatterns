package companyInterview.JD;

import java.util.*;

public class Main {

    static class TEC implements Comparable<TEC> {
        int h;
        int w;

        @Override
        public int compareTo(TEC o) {
            int p = this.h - o.h;

            return p != 0 ? p : this.w-o.w;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            List<TEC> list = new ArrayList<>();
            boolean pan = true;

            for (int j = 0; j < 6; j++) {
                int h = sc.nextInt();
                int w = sc.nextInt();
                TEC s = new TEC();
                s.h = Math.max(h,w);
                s.w = Math.min(h,w);
                list.add(s);
            }
            Collections.sort(list);
            Set<Integer> set = new HashSet<>();

            for (int j = 0; j < 6; j+=2) {
                if (list.get(j).h != list.get(j+1).h || list.get(j).w != list.get(j+1).w){
                    pan = false;
                    break;
                }
                set.add(list.get(j).h);
                set.add(list.get(j+1).h);
                set.add(list.get(j).w);
                set.add(list.get(j+1).w);
            }
            if (set.size() > 3){
                pan = false;
            }

            System.out.println(pan ? "POSSIBLE" : "IMPOSSIBLE");
        }

    }
}
