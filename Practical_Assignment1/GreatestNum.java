package Assignment1;

import java.util.*;

class GreatNum {
    Scanner sc = new Scanner(System.in);
    int number1, number2, number3;

    void greatNumber() {

        System.out.print("Enter First Number :");
        number1 = sc.nextInt();

        System.out.print("Enter Second Number :");
        number2 = sc.nextInt();

        System.out.print("Enter Third Number :");
        number3 = sc.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("Greatest number :" + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Greatest number :" + number2);
        } else {
            System.out.println("Greatest number :" + number3);
        }
    }
}

public class GreatestNum {
    public static void main(String args[]) {
        GreatNum gn = new GreatNum();
        gn.greatNumber();
    }
}
