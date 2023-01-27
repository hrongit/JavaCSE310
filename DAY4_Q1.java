import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int a,b;
        a=s.nextInt();
        b=s.nextInt();
        if(a<=100 & a>=0 & b<=100 & b>=0){
            System.out.println((a*1)+(b*2) );
        }
        else if(a<0 || b<0){
            System.out.println("0");
        }
    }
}