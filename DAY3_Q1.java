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
       int a , b , c;
       a=s.nextInt();
       b=s.nextInt();
       c=s.nextInt();
            if(a>0 & b>0 & c >0){
                System.out.println(a+"*"+b+"*"+c);
            }
            else{
                System.out.println("Invalid Input");
            
    }
    }
}