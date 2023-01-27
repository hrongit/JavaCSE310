import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        double b= (a-32)*(double)0.555;
        if (a>=95 && a<=105)
            System.out.printf("%.1f",(float)b);
        else
            System.out.print("Invalid");
    }
}