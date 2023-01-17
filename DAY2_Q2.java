import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int b=x*2;
        int temp=x;
        x=b;
        b=temp;
        
        System.out.print(x);
        System.out.print(" ");
        System.out.print(b);
        
    }
}