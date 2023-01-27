import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        double  a;
        double b;
        double c;
        double x,y,z;
        a=s.nextFloat();
        b=s.nextFloat();
        c=s.nextFloat();
        
        x=Math.ceil(a);
        y=Math.ceil(b);
        z=Math.ceil(c);
        
        int a_f = (int)x;
        int b_f = (int)y;
        int c_f = (int)z;
        
        System.out.print(a_f+" "+b_f+" "+c_f);
        
    }
}