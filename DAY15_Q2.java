import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float present=s.nextFloat();
        
        int a=s.nextInt();
        
            if(a==1)
                {
                    float wd=s.nextFloat();
               
                    if(wd>present)
                    {
                        System.out.println("error");
                    }
                
                    else
                    {
                    present= present-wd;
                    System.out.println(String.format("%.2f",present));
                }
            }
            else if(a==2)
                {
                    float dp=s.nextFloat();
                    present=present+dp;
                 System.out.println(String.format("%.2f",present));
                    
                    
                }
           else if(a==3)
                {
                    System.out.println(String.format("%.2f",present));
                }
                
            else
                {
                    System.out.println("error");
                    
                }
    }
}