import java.util.Arrays;
import java.util.Scanner;

public class Leaders {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the Array Size");

        int arrSize = sc.nextInt();

        int[] arr = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            if (i == arr.length - 1){
                System.out.print(arr[arr.length-1] + " ");
                break;
            }
            for (int j = i+1; j < arr.length; j++) {
                flag = arr[i] > arr[j];
                if (flag == false){
                    break;
                }
            }
            if (flag){
                System.out.print(arr[i] + " ");
            }
        }

    }
}
