/* Program 3 :- 
Write a program user through input one number and perform Factorial.
Using Constructor.
*/

import java.util.*;

class Get_Factorial {
    Scanner sc = new Scanner(System.in);
    int number, fact = 1;

    Get_Factorial() {
        System.out.print("Enter a value to calculate its Factorial :");
        number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Number is " + number + " and its Factorial is " + fact);
    }

}

public class Factorial {
    public static void main(String args[]) {
        Get_Factorial cf = new Get_Factorial();
    }
}
