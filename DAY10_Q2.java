import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        
        double fahrenheit;
        
        Scanner sc =new Scanner(System.in);
        
        int celsius= sc.nextInt();
        fahrenheit = (1.8*celsius) + 32;
        
        
        
        if (celsius>=30 && celsius<=45)
            System.out.printf("%.1f",(float)fahrenheit);
        else
            System.out.print("Invalid Input");
    }

}