import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        String n1 = Long.toString(n);
        if(n<0 || n>2147483647){
            System.out.println("Invalid Number");
        }
        else{
            System.out.println(n1.length());
        }
    }
}