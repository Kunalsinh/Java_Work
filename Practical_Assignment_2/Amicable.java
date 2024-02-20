/* Program 1: -
Write a program user through input two numbers and check amicable number using Constructor.
*/

import java.util.*;

class Check_Amicable {
    Scanner sc = new Scanner(System.in);
    int number1, number2, divS1 = 0, divS2 = 0;

    Check_Amicable() {
        System.out.print("Enter First Number : ");
        number1 = sc.nextInt();

        System.out.print("Enter Second Number : ");
        number2 = sc.nextInt();
    }

    void checkNum() {
        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                divS1 = divS1 + i;
            }

        }

        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                divS2 = divS2 + i;
            }

        }

        if ((number1 == divS2) && (number2 == divS1)) {
            System.out.println("The Number1 " + number1 + " and Number2 " + number2 + " both are AMICABLE numbers!");
        } else {
            System.out
                    .println("The Number1 " + number1 + " and Number2 " + number2 + " both are NOT AMICABLE numbers!");
        }
    }

}

public class Amicable {
    public static void main(String args[]) {
        Check_Amicable cn = new Check_Amicable();
        cn.checkNum();
    }
}