import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x<=0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
        int i,j;
        for(i=0; i<x; i++) 
            {           
            for(j=0; j<=i; j++) 
            {       
                System.out.print("&"); 
            }           
            System.out.println(); 
        } 
    } 
}
}