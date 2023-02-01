import java.util.*;

public class Solution{

public static void countCurrency(int amount)
{
int[] notes = new int[]{ 2000, 500, 200, 100 };
int[] noteCounter = new int[4];

for (int i = 0; i < 4; i++) {
if (amount >= notes[i]) {
noteCounter[i] = amount / notes[i];
amount = amount % notes[i];
}
}

for (int i = 3; i >= 0; i--) {
if (noteCounter[i] != 0) {
System.out.println(noteCounter[i] + " " + notes[i] + " Notes");
}
}
}
public static void main(String argc[]){
Scanner scan = new Scanner(System.in);
int amount = scan.nextInt();
scan.close();
if(amount > 100 && amount < 20000 && amount%100==0)
countCurrency(amount);
else System.out.println("Invalid Input");
}
}