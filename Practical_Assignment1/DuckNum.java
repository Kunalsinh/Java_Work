package Assignment1;

import java.util.*;

class CheckDuck {
    Scanner sc = new Scanner(System.in);
    int number, originalNumber, flag=0;

    void duckNum() {
        System.out.print("Enter number for check it is Duck or Not :");
        number = sc.nextInt();

        originalNumber = number;

        if (number > 0) {

            while (number != 0) {
                if (number % 10 == 0) {
                    flag = 1;
                    break;
                }
                number /= 10;
            }

            if (originalNumber > 0 && flag == 1) {
                System.out.println("It is a Duck Number!");
            } else {
                System.out.println("It is not a Duck Number!");
            }

        } else {
            System.out.println("Please enter positive number only!");
        }

    }
}

public class DuckNum {
    public static void main(String args[]) {
        CheckDuck cd = new CheckDuck();
        cd.duckNum();
    }
}
