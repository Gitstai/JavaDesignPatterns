package companyInterview.PDD;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        in.nextLine();
//        int[] start = new int[n];
//        int[] end = new int[n];
//        int count = 0;
////        Map<Integer,Integer> map= new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            start[i] = in.nextInt();
//        }
//        in.nextLine();
//        for (int i = 0; i < n; i++) {
//            end[i] = in.nextInt();
//        }
//        in.nextLine();
//        for (int i = 0; i < n; i++) {
//            System.out.print(start[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            System.out.print(end[i] + " ");
//        }


        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] s1 = in.nextLine().split(" ");
        String[] s2 = in.nextLine().split(" ");
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s1[i]);
        for (int i = 0; i < n; i++)
            b[i] = Integer.parseInt(s2[i]);
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
        for (int i : b)
            System.out.print(i + " ");
























//        for (Integer key:map.keySet()) {
//            System.out.println("key= "+ key + " and value= " + map.get(key));
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i; j++) {
//                int x = map.get(start[j]);
//                int y = map.get(start[i]);
//                if(x > y){
//                    count++;
//                    break;
//                }
//            }
//        }
//        System.out.println(count);
    }
}
