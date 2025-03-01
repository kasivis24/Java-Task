package javascopeandoperator;

import java.util.Scanner;


public class ScopeAndOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        1. Write a program to convert Celsius to Fahrenheit using appropriate datatypes and literal conventions
        double celsius = sc.nextDouble();

        float fahrenheit= (float)celsius* (9.0f / 5.0f) +(32.0f) ;

        System.out.println(fahrenheit);



    }
}
class Quadreatic{
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        //    2. Write a program to solve a quadratic equation (ax^2+bx+c). Take a,b and c from user and use quadratic formula.
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int bSq = b*b;
        b = -b;
        int fAc = 4*a*c;
        int inRoot = bSq-fAc;
        int tA = 2*a;

        System.out.println((b+Math.sqrt(inRoot))/tA);
        System.out.println((b-Math.sqrt(inRoot))/tA);
    }
}
class Bitwise{
    public static void main(String[] ar){
//        3. Get two numbers from user and perform bitwise AND< OR, XOR, left and right shift operations on them.

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter two numbers..");
        int a = sc.nextInt();
        int b = sc.nextInt();
        //Bitwise OR
        System.out.println("Bitwise OR-> a|b = "+a+"|"+b+"="+(a|b));
        //Bitwise AND
        System.out.println("Bitwise AND-> a&b = "+a+"&"+b+"="+(a&b));
        //Bitwise XOR
        System.out.println("Bitwise XOR-> a^b = "+a+"^"+b+"="+(a^b));
        //Left shift
        System.out.println("Left shift a<<2 -> "+a+"<<2 = "+(a<<2));
        //Right shift
        System.out.println("Right shift b>>2 -> "+b+">>2 = "+(b>>2));

    }
}
class  Scope{
    public static void main(String[] ar){
//        4. Write a program with an if statement. Declare one variable inside the if block and another one outside. Print both variables inside and outside the if block to understand variable scope. (Comment the compiler error in your program while submitting)
        Scanner sc=new Scanner(System.in);
        int a = 10;
        if(a==10) {
            int b = 5;
            System.out.println("a = "+a+", b = "+b);
        }
//		System.out.println("a = "+a+", b = "+b);
//        we can not print b because b inside  of the    block
    }
}