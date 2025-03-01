package javaconditionalandunconditional;

import java.util.Scanner;

public class UnConditional {
    public static void main(String[] args) {
        // 1. Write a program to find second occurrence of a given number in an array


        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int target = sc.nextInt();
        int count = 0;
        int[] arr = new int[arrSize];



        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == target){
                count++;
            }
            if (count == 2){
                System.out.println("occurrence ");
               break;
            }
        }
    }
}

class Primenumber{
    public static void main(String[] args) {
//        2. Write a program to print prime numbers between 1 to 30
        System.out.println(+2);
        for(int i=3;i<=30;i++){
            int val=(int)Math.sqrt(i);
            boolean ptr=false;
            for(int j=2;j<=val;j++){
                if(i%j==0){
                    ptr=true;
                    break;
                }
            }
            if(!ptr){
                System.out.println(i);
            }
        }
    }
}

class FindEven{
    public static void main(String[] args) {


        // 3. Write a program to find the sum of even numbers only in a given array. Use continue.

        int[] arr = {1,2,3,4,5,6,7,8};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                continue;
            }
            sum += arr[i];
        }

        System.out.println(sum);
    }
}