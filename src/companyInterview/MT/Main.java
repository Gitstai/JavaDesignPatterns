package companyInterview.MT;

public class Main {
    public static void main(String[] args) {
        System.out.println(toHexString("16"));
    }
    // 转化字符串为十六进制编码
    public static String toHexString(String str) {
        return Integer.toHexString(Integer.parseInt(str));
    }




//把字符串转换成16进制。以字符串的形式返回

//    public static String encode(String str){
//        // 根据默认编码获取字节数组
//        byte[] bytes=str.getBytes();
//        StringBuilder sb=new StringBuilder(bytes.length*2);
//        // 将字节数组中每个字节拆解成2位16进制整数
//        for(int i=0;i <bytes.length;i++){
//            sb.append(hexString.charAt((bytes[i]&0xf0)>> 4));
//            sb.append(hexString.charAt((bytes[i] & 0x0f)));
//        }
//        return sb.toString();
//    }
}
