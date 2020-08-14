package companyInterview.huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(",");
        if (strs.length <= 0 || strs.length >= 100){
            System.out.println("error.0001");
            return;
        }
        Map<String, Integer> map = new HashMap<>();
        for (String str : strs) {
            if (str.matches("^[A-Z][a-z]+$")){
                if (!map.containsKey(str)){
                    map.put(str,1);
                }else {
                    map.put(str,map.get(str)+1);
                }
            }else {
                System.out.println("error.0001");
                return;
            }
        }
        String maxStr = strs[0];
        int maxNum = map.get(maxStr);
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            String tempStr = entry.getKey();
            int tempNum = entry.getValue();
            if(maxNum < tempNum){
                maxStr = tempStr;
            } else if (maxNum == tempNum) {
                if (maxStr.compareTo(tempStr) > 0){
                    maxStr = tempStr;
                }
            }
        }
        System.out.println(maxStr);
    }

}
