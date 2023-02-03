import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p=0f;
        long n = input.nextLong();
        double t=0;
        t = (n*1.1f)/12;
        System.out.println((long)((11*n)/10));
        p = t-((int)(t));
        if(p < 0){
            System.out.println(String.format("%.2f",t));
        }
        else if(p == 0){
            System.out.println((int)(t));
        }
        else{
            System.out.println(String.format("%.2f",t));
        }
    }
}