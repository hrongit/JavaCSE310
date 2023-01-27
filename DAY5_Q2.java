import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        sc.nextLine();
        String str=sc.nextLine();
        double z=sc.nextDouble();
        double a=x/1000;
        double b=y/10;
        double n;
        double o;
        if(z<0.01 || z>1000)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            if(str.equals("Silver"))
        {
            n=a*z;
            System.out.println((int)n);
        }
        else
        {
            o=b*z;
            System.out.println((int)o);
        }
        }
    }
}