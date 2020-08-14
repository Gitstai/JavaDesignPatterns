package companyInterview.ByteDance;

public class Money {
    public static void main(String[] args) {
        long[] d= new long[201];
        d[0]=1;
        int[] v={1,2,5,10,20,50,100};
        for(int i=0;i<7;i++){
            for(int j=v[i];j<201;j++){
                d[j]+=d[j-v[i]];       //相当于
            }
        }
        System.out.println(200+"的组合方式有"+d[200]+"种");
    }
}
