
/* Program 2: -
Write a program user through input one number and then check. This no is AutomorphicNumber or not. Using Constructor.
 */
import java.util.*;

// Program is incomplete.
class Check_Automorphic {

    Scanner sc = new Scanner(System.in);
    int number, squareOfNumber, tempNumber, count = 0;
    double squreRemain;
    Check_Automorphic() {
        System.out.print("Enter value of Number :");
        number = sc.nextInt();
    }

    void checkAutomorphic() {
        tempNumber = number;
        squareOfNumber = tempNumber * tempNumber;

        while (tempNumber > 0) {
            count++;
            tempNumber = tempNumber / 10;
        }
        squreRemain = squareOfNumber % (Math.pow(10, count));
    }
    

    void display() {

        if (squreRemain == number) {
            System.out.println("Number " + number + " is AutoMorphic Number!");
        } else {
            System.out.println("Number " + number + " is not AutoMorphic Number!");
        }
    }
}

public class Automorphic {
    public static void main(String args[]) {
        Check_Automorphic ca = new Check_Automorphic();
        ca.checkAutomorphic();
        ca.display();
    }
}
