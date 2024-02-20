
/* Program 5 :- 
Write a program user through input one number and then check this number
is neon or not. Using Constructor.
*/
import java.util.*;

class Check_Neon {
    Scanner sc = new Scanner(System.in);
    int number, sum = 0, digit, square, temp;

    Check_Neon() {
        System.out.print("Enter value :");
        number = sc.nextInt();

        square = number * number;
        temp = square;

        while (temp != 0) {
            digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        if (sum == number) {
            System.out.println("Number " + number + " is Neon!");
        } else {
            System.out.println("Number " + number + " is not Neon!");
        }
    }
}

public class Neon {
    public static void main(String args[]) {
        Check_Neon cn = new Check_Neon();
    }
}
