import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // System.out.println("Hello, World!");
        Scanner s=new Scanner(System.in);
        int a , b ;
        String c;
        // System.out.println("enter 2 number");
        a=s.nextInt();
        b=s.nextInt();
        c=s.next();



        switch(c) {
            case "+":
                // code block

                System.out.println(a+b);
                break;
            case "-":
                // code block
                System.out.println(a-b);
                break;
            case "*":
                // code block
                System.out.println(a*b);
                break;
            case "/":
                // code block
                System.out.println(a/b);
                break;
            case "%":
                // code block
                System.out.println(a%b);
                break;
            default:
                // code block
                System.out.println("Invalid arithmetic operators");
        }




    }
}