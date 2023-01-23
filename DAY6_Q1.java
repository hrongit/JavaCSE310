import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class EvenOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }
}