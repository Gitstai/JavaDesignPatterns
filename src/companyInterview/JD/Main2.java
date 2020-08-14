package companyInterview.JD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    static class P implements Comparable<P> {
        int start;
        int end;

        @Override
        public int compareTo(P o) {
            if (((this.end-this.start) - (o.end - o.start)) == 0){ return this.start - o.start; }
            return (this.end-this.start) - (o.end - o.start);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<P> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            P p = new P();
            p.start = sc.nextInt();
            p.end = sc.nextInt();
            list.add(p);
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).start + " " + list.get(i).end);
        }
//        List<P> res = new ArrayList<>();
//        res.add(list.get(0));
//        for (int i = 1,k = 0; i < list.size(); i++) {
//            if (list.get(i).start <= res.get(k).end){
//                res.get(k).end = list.get(i).end;
//            }
//        }

    }
}
