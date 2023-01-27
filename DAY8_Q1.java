import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
          switch(c) {
            case 1:
                double f=sc.nextDouble();
                double z=((f-32)*5)/9;
                  System.out.println(String.format("%.2f",z));
                break;
            case 2:
                double a=sc.nextDouble();
                  double b=((a*9)/5)+32;
                  System.out.println(b);
                break;
            default:
                System.out.println("INVALID CHOICE");
          }
    }
}