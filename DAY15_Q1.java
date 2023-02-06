import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        if(row>0 && row<2147483647)
        {
        for(int i=1;i<=row;  i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("@");
            }
            System.out.println();
        }
        }
        else if(row<=0 || row> 2147483647)
        {
            System.out.println("Invalid Rows");
        }
    }
}