import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MatrixZeros {
    public static void main(String[] args) {


        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};


        Set<String> set = new HashSet<>();


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0 && set.add(""+i+""+j)){
                    int row = i;
                    for (int k = 0; k < matrix[0].length; k++) {
                        if (matrix[row][k] != 0 && set.add(""+row+""+k)){
                            matrix[row][k] = 0;
                        }
                    }

                    int col = j;
                    for (int k = 0; k < matrix.length; k++) {
                        if (matrix[k][col] != 0 && set.add(""+k+""+col)){
                            matrix[k][col] = 0;
                        }
                    }
                    
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
