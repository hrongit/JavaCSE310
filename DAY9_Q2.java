import java.util.Scanner;

public class DAY9 {

    private static final char[] Invalid = null;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        int age = reader.nextInt();

        if(age > 18)
            System.out.println("Eligible");
        else
            System.out.println("Not eligible");


        
    }

}