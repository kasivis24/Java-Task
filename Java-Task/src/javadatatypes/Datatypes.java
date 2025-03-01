package javadatatypes;

import java.util.Scanner;

enum findDay{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

}
public class Datatypes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        1. print hellowold
        System.out.println("Hello and welcome!");

//       2. Write a program to demonstrate compatible type conversions. For eg., float to int, double to float, int to short
        float float_val=3.33f;
        // float to int conversion
        int float_int_val=(int) float_val;
        System.out.printf(" %f", float_val);
        System.out.println(" It convert to int"+float_int_val);
        // double to float conversion
        double double_val=3.33d;
        float double_float_val=(float) double_val;
        System.out.println( double_val + " It converted to float: " + double_float_val);
//        int to short conversion
        int number_val=100;
        short number_short_val=(short) number_val;
        System.out.println(number_val + " It converted to short: " + number_short_val);
//        4.Write a program to swap the two given numbers.
        int  num1=5;
        int num2=10;
        System.out.println("Befor Swap "+num1+" "+num2);
//       use  add- sub
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After swap "+num1+" "+num2);

//        use BitwiseOperator
        num1 ^=num2;
        num2 ^=num1;
        num1 ^=num2;
        System.out.println("After swap using BitWise "+num1+" "+num2);

//        5. Write a Java program that gets a number from the user and displays the name of the weekday. Use enum.
        int getday=sc.nextInt();
        if(getday>=1 && getday<=7){
            System.out.println("Today :"+findDay.values()[getday-1]);
        }
        else {
            System.out.println("Enter a valid  number");
        }

//      6.  Write a program that calculates the average weight of 10 people. Use descriptive and meaningful variable names following Java naming conventions. Use proper datatypes for the variables.
        int total_people=10;
        double  total_weight=0;
        for(int i=0;i<total_people;++i){
            double people_weight=sc.nextDouble();
            total_weight+=people_weight;
        }
        double average_people_weight=total_weight/total_people;
        System.out.println("Average weight of 10 people is :" + average_people_weight);
    }
}
// 3.Create multiple classes in single file and compile and explore how many .class files are generated.
class MyDemoCLassOne{
    public static void display(){
        System.out.println("MyDemoCLassOne");
    }
    public static void main(String[] args){
        display();
    }
}
class MyDemoCLassTwo{
    public static void display(){
        System.out.println("MyDemoCLassTwo");
    }
    public static void main(String[] args){
        display();
    }
}
class MyDemoCLassThree{
    public static void display(){
        System.out.println("MyDemoCLassThree");
    }
    public static void main(String[] args){
        display();
    }
}