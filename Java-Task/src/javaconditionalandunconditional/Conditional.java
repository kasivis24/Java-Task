package javaconditionalandunconditional;

import java.util.Scanner;

public class Conditional{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        1. Take three numbers from the user and print the greatest number.

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println((num1 > num2 && num1> num3)?num1 : (num2 > num3 && num2> num1) ?num2:(num3>num2 && num3>num1)?num3:num3);
    }
}
class Grade{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        2. Create a program that takes a student's score as input and outputs their corresponding grade.
        int grade = sc.nextInt();
        if(grade >= 90 && grade <= 100)System.out.println("A");
        else if(grade >= 70 && grade <= 80)System.out.println("B");
        else if(grade >= 50 && grade <= 60)System.out.println("C");
        else if(grade >= 30 && grade <= 40)System.out.println("D");
        else System.out.println("F");
    }
}
class Table{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        3. Write a program to print multiplication table of a given number in a neat format
        int table= sc.nextInt();
        for(int i=1;i<=10;++i){
            System.out.println(i+"  *  "+ table +"  =  " + table*i);
        }
    }
}