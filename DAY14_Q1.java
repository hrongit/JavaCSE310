import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String s1;
        s1 = s.nextLine();
        String s2;
        s2 = s.nextLine();
        String s3;
        s3 = s.nextLine();
        
        int a,b,c;
        a=s1.length();
        b=s2.length();
        c=s3.length();
        
        if(s1.length()<50 & s2.length()<50 & s3.length()<50){
            if(a==b & a==c){
            System.out.println("-1");
        }
        else{
            if(a>b & a>c){
                System.out.println(a-1);
            }
            if(b > a & b>c){
                System.out.println(b);
            }
            if(c>a & c>b){
                System.out.println(c);
            }
        }
        }
        
        
    }
}