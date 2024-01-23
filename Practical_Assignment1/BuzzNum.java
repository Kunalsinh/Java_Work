package Assignment1;

import java.util.*;

class CheckBuzz {
    Scanner sc = new Scanner(System.in);
    int number, remainNumber;

    void numBuzz() {

        System.out.print("Enter number for check it is Buzz or Not :");
        number = sc.nextInt();

        if (number > 0) {
            
            remainNumber = number % 10;
            System.out.println(remainNumber);

            if (remainNumber == 7 && (remainNumber % 7 == 0)) {
                System.out.println("It's a Buzz Number!");
            } else {
                System.out.println("It's not a Buzz Number!");
            }

        } else {
            System.out.println("Please enter valid positive number!");
        }
    }
}

public class BuzzNum {
    public static void main(String args[]) {
        CheckBuzz cb = new CheckBuzz();
        cb.numBuzz();
    }
}
