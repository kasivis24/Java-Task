package javaarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayRotate {
    public static void main(String[] args) {


        // 1.Create a program that rotates the elements of an array to the right by a specified number of positions. Get the array and the rotation count from the user

        int rotate = 3;

        int[] arr = {1,2,3,4,5,6,7};



        for (int i = 0; i < rotate; i++) {

            int first = arr[0];
            arr[0] = arr[arr.length-1];

            for (int j = 1; j < arr.length; j++) {
                int t = arr[j];
                arr[j] = first;
                first = t;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

class TransposeMatrix{
    public static void main(String[] args) {



        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        convertToTranspose(matrix);
    }

    static int[][] convertToTranspose(int[][] arr){
        int[][] newmatrix = new int[arr[0].length][arr.length];
        int temp = -1;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                newmatrix[j][i] = arr[i][j];
            }
        }
        return newmatrix;
    }
}

class SprialMatrix{
    public static void main(String[] args) {


        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        int row_start = 0;
        int row_end = matrix.length - 1;
        int col_start = 0;
        int col_end = matrix[0].length - 1;

        List<Integer> list = new ArrayList<>();

        while (row_start <= row_end && col_start <= col_end){
            for (int i = row_start; i <= col_end; i++) {
                list.add(matrix[row_start][i]);
            }

            row_start += 1;

            for (int i = row_start; i <= row_end; i++) {
                list.add(matrix[i][col_end]);
            }

            col_end -= 1;

            if(row_start <= row_end){
                for (int i = col_end; i >= col_start; i--) {
                    list.add(matrix[row_end][i]);
                }

                row_end -= 1;
            }

            if(col_start <= col_end){
                for (int i = row_end; i >= row_start; i--) {
                    list.add(matrix[i][col_start]);
                }

                col_start += 1;
            }
        }
    }
}

class MutipleMatrix{
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows of first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter number of columns of first matrix: ");
        int cols1 = scanner.nextInt();

        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows1][cols1];
        int[][] product = new int[rows1][cols1];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                product[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Product of the matrices:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();

    }
}

class JaggedArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int N = sc.nextInt();
        double[][] weightPerson = new double[N][];
        int option;
        do {
            System.out.println("1 .Add weight ");
            System.out.println("2 .Get minimum weight ");
            System.out.print("Enter the option : ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter your row : ");
                    int row = sc.nextInt();
                    System.out.print("Enter the new weight : ");
                    double weight = sc.nextDouble();
                    if (row >= N)
                        System.out.println("Wrong row");
                    else {
                        weightPerson[row] = addWeight(weightPerson[row], weight);
                        System.out.println("New Weights added successfully : " + Arrays.toString(weightPerson[row]));
                    }
                    break;
                case 2:
                    System.out.print("Enter your row : ");
                    int rowIdx = sc.nextInt();
                    System.out.println("Minimum weight of person : " + getMinimumWeight(weightPerson[rowIdx]));
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        } while (option == 1 || option == 2);
        sc.close();
    }

    private static double getMinimumWeight(double[] personWeights) {
        if (personWeights.length > 0) {
            double min = personWeights[0];
            for (double weight : personWeights) {
                if (weight < min) {
                    min = weight;
                }
            }
            return min;
        } else {
            System.out.println("No weights available");
            return 0.0;
        }

    }

    private static double[] addWeight(double[] personWeights, double weight) {
        double[] newWeights;
        if (personWeights != null) {
            newWeights = new double[personWeights.length + 1];
            for (int i = 0; i < personWeights.length; i++)
                newWeights[i] = personWeights[i];
            newWeights[personWeights.length] = weight;
        } else {
            newWeights = new double[1];
            newWeights[0] = weight;
        }
        return newWeights;
    }

}