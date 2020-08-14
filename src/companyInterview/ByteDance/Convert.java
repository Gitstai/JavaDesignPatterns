package companyInterview.ByteDance;

public class Convert {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }
    public static String convert (String s, int numRows){
        StringBuilder[] sb = new StringBuilder[numRows];
        int up = 1;
        int curr = 0;
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }
        for (int i = 0; i < s.length(); i++) {
            sb[curr].append(s.charAt(i));
            curr += up;
            if (curr == numRows - 1 || curr == 0) up = -up;
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            res.append(sb[i].toString());
        }
        return res.toString();
    }
}
