package InternshipInterview.jisuanke;

import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        int[][] matrix = new int[4][5];
//        output(matrix,3,3);
        int odd = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = odd++;
            }
        }
        output2(matrix);
    }
    //方法1：循环
    public static void output(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int direction = 1;
        int sum = rows * cols;
        int i=0,j=0;
        int startR = 0,endR = rows-1,startC = 0,endC = cols-1;
        List<Integer> list = new ArrayList<>();
        for (int x = 0; x < sum; x++) {
            list.add(matrix[i][j]);
            switch (direction){
                case 1:
                    j++;
                    if (j > endC){
                        direction = 2;
                        startR++;
                        j--;
                        i++;
                    }
                    break;
                case 2:
                    i++;
                    if (i > endR){
                        direction = 3;
                        endC--;
                        j--;
                        i--;
                    }
                    break;
                case 3:
                    j--;
                    if (j < startC){
                        direction = 4;
                        endR--;
                        j++;
                        i--;
                    }
                    break;
                case 4:
                    i--;
                    if (i < startR){
                        direction = 1;
                        startC++;
                        i++;
                        j++;
                    }
                    break;
            }
        }
        System.out.println(list);
    }

    //方法2：深度优先
    public static void output2(int[][] matrix){
        List<Integer> list = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] seen = new boolean[rows][cols];

        int sum = rows*cols;
        int i=0,j=0,di=0;
        int[] dr = new int[]{0,1,0,-1};
        int[] dc = new int[]{1,0,-1,0};
        for (int x = 0; x < sum; x++) {
            list.add(matrix[i][j]);
            seen[i][j] = true;
            int cr = i + dr[di];
            int cc = j + dc[di];
            if (cr < rows && cc < cols && cr >= 0 && cc >= 0 && !seen[cr][cc]){
                i = cr;
                j = cc;
            }else {
                di = (di + 1) % 4;
                i += dr[di];
                j += dc[di];
            }
        }
        System.out.println(list);
    }

}
