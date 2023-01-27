import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.Scanner;

public class absolutepositiveno {
    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);


        int num = reader.nextInt();

        if(num < 0)
            System.out.println(num*(-1));
        else
            System.out.println(num);

    }

}







