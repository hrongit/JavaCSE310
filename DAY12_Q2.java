import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0 && a<99){
            for(int i=0 ; i<=a ; i++){
                System.out.println(i);
            }
            System.out.println("Games End");
        }
        else{
             System.out.println("Invalid Input");
        }
    }
    
}