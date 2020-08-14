package companyInterview.xiecheng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static List<List<Integer>> subListBySegment(List<Integer> data, int segments) {

        List<List<Integer>> result = new ArrayList<>();

        int size = data.size();// 数据长度

        if (size > 0 && segments > 0) {// segments == 0 ，不需要分隔

            int count = size / segments;// 每段数量

            List<Integer> cutList = null;// 每段List

            for (int i = 0; i < segments; i++) {
                if (i == segments - 1) {
                    cutList = data.subList(count * i, size);
                } else {
                    cutList = data.subList(count * i, count * (i + 1));
                }
                result.add(cutList);
            }
        } else {
            result.add(data);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,2,6,7,3);
//        List<List<Integer>> lists = subListBySegment(list, 3);
        final List<List<Integer>> lists = spliceArrays(list, 3);
        System.out.println(lists);
    }
    public static List<List<Integer>> spliceArrays(List<Integer> datas, int splitSize) {
        if (datas == null || splitSize < 1) {
            return  null;
        }
        int totalSize = datas.size();
        //获取要拆分子数组个数
        int count = (totalSize % splitSize == 0) ?
                (totalSize / splitSize) : (totalSize/splitSize+1);

        System.out.println("split count = " +count);

        ArrayList rows = new ArrayList();
        for (int i = 0;i < count;i ++) {

            int index = i * splitSize;
            List<Integer> cols = new ArrayList();
            int j = 0;
            while (j < splitSize && index < totalSize) {
                cols.add(datas.get(index++));
                j ++;
            }
            rows.add(cols);
        }
        return rows;
    }
}
