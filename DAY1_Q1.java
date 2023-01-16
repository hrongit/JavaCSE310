import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        float a , b , project , quiz;
        a=s.nextFloat();
        b=s.nextFloat();
        project=s.nextFloat();
        quiz=s.nextFloat();

        if (a >= 0 & b >= 0 & a < 20 & b<20 & project < 15 & project>=0 & quiz < 5 & quiz>=0 ){
                    float sum = a+b+project+quiz;
            int intsum = (int) sum;
                    System.out.println(intsum);
                
        }
        else {
            System.out.println("Invalid Input");
        }

    }
}