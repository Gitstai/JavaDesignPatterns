package RecruitInterview.PDD;

import java.util.Scanner;

public class Main1 {
    private static int[][] array;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            array = new int[N][N];
            for (int i1 = 0; i1 < array.length; i1++) {
                for (int i2 = 0; i2 < array[i1].length; i2++) {
                    array[i1][i2] = sc.nextInt();
                }
            }
            System.out.println(Resolve());
        }

    }
    public static int Resolve() {
        int length = array.length;
        int k = length / 10;
        if (isFour(k)){
            return 4;
        }else if (isSeven(k)){
            return 7;
        }else if (isNine(k)){
            return 9;
        }else if (isZero(k)){
            return 0;
        }else if (isFive(k)){
            return 5;
        }else if (isSix(k)){
            return 6;
        }else if (isTwo(k)){
            return 2;
        }else if (isOne(k)){
            return 1;
        }else if (isThree(k)){
            return 3;
        }else{
            return 8;
        }
    }
    public static boolean isZero(int k){
        for (int i = 4*k; i <=5*k; i++) {
            if (array[4*k][i] != 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isOne(int k){
        return array[2 * k][4 * k] == 1;
    }
    public static boolean isTwo(int k){
        for (int i = 2*k; i <= 7*k; i++) {
            if (array[2*k][i] != 1) {
                return false;
            }
        }
        return true;
    }
    public static boolean isThree(int k){
        return array[3 * k][3 * k] == 1;
    }
    public static boolean isFour(int k){
        return array[4 * k][k] == 1;
    }
    public static boolean isFive(int k){
        return array[1 * k][2 * k] == 1 && array[1 * k][7 * k] == 0;
    }
    public static boolean isSix(int k){
        if (array[1 * k][2 * k] == 1) {
            return false;
        }
        for (int i = 2*k; i <= 6*k; i++) {
            if (array[4*k][i] != 1) {
                return false;
            }
        }
        return true;
    }
    public static boolean isSeven(int k){
        for (int i = 2*k; i <= 7 * k; i++) {
            if (array[1 * k][i] != 1) {
                return false;
            }
        }
        return true;
    }
    public static boolean isEight(int k){
        return true;
    }
    public static boolean isNine(int k){
        for (int i = 7*k; i >= 3*k; i--) {
            if (array[4*k][i] != 1) {
                return false;
            }
        }
        return true;
    }
}
