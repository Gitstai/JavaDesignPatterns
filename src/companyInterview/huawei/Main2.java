package companyInterview.huawei;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = sc.next();
        //!str.matches("^[a-zA-Z]+$") ||
        if (str.length() > 1024 || s.length() > 1024){
            System.out.println("FAIL");
            return;
        }
        int fromIndex = 0;
        Machine head = new Machine(-1,-1,-1);
        Machine p = head;
        while (fromIndex < s.length()){
            int left = s.indexOf("[",fromIndex)+1;
            int right = s.indexOf("]",left+1);
            p.next = new Machine(fromIndex,left,right);
            p = p.next;
            fromIndex = right+2;
        }
        p = head.next;
        boolean pan = false;

        while (p != null){
            String[] temp = s.substring(p.left,p.right).split(",");
            for (int i = 0; i < 3; i++) {
                String tempS = temp[i].substring(temp[i].indexOf("=")+1);
                if (!(tempS.matches("^[0][x][a-f0-9A-F]+$") || tempS.matches("^[0][X][a-f0-9A-F]+$"))){
                    System.out.println("FAIL");
                    return;
                }
            }
            p = p.next;
        }

        p = head.next;

        while (p != null){
            if (str.equals(s.substring(p.fromIndex,p.left-1))){
                String[] temp = s.substring(p.left,p.right).split(",");
                for (int i = 0; i < 3; i++) {
                    System.out.print(temp[i].substring(temp[i].indexOf("=")+1) + " ");
                }
                System.out.print("\r\n");
                pan = true;
            }
            p = p.next;
        }
        if (!pan){
            System.out.println("FAIL");
        }

    }
    static class Machine{
        Machine next;
        int fromIndex;
        int left;
        int right;
        Machine(int fromIndex,int left,int right){
            this.fromIndex = fromIndex;
            this.left = left;
            this.right = right;
        }
    }
}
