package InternshipInterview.PDD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[]arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<=arr.length-i;j++){
                List<Integer> list = new ArrayList<>();
                for(int k=i;k<i+j && k<arr.length;k++){
                    list.add(arr[k]);
                }
                if(pan(list,m)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static boolean pan(List<Integer> list, int m){
        long temp = 0;
        for (int i = 0; i < list.size(); i++) {
            temp += list.get(i);
        }
        return temp%m == 0;
    }
}
