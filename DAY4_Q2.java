import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        sc.nextLine();
        String name=sc.nextLine();
         char gender =sc.next().charAt(0);
        sc.nextLine();
        int a=sc.nextInt();
        if(gender=='F'){
            System.out.println("Hi Ms. "+name+"!");
                }
        else if(gender=='M'){
            System.out.println("Hi Mr. "+name+"!");
        }
        int n=20000-a;// for remaining  amount.
             if(a<=20000){
            System.out.println("Your Account Balance after withdrawl is "+n+".");
        }
        else{
            System.out.println("Insufficient Funds! You can not withdraw "+a+".");
        }
       
    }
}