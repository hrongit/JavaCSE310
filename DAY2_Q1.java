import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        if(a<0){
            int b=a*-1;
            System.out.println(b);
        
        }
        else{
            System.out.println(a);
        }
        
    }
}