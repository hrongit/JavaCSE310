import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
      if(1<=a && a<=10){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a+1-i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
        else{
            System.out.print("Invalid Rows");
            }
    }
}