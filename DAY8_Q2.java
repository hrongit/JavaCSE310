import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       if(9<n && n<100)
       {
           int z=n;
           int r=z%10;
           int p=z/10;
           int s=r+p;
           int l=r*p;
           int t=s+l;
           if(t==n)
           {
               System.out.println("special two digit number");
           }
           else
           {
               System.out.println("not a special two digit number");
           }
       }
        else
        {
            System.out.println("invalid input");
        }
    }
}