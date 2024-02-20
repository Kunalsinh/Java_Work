/* Program 4: - 
Write a program user through input one number and perform Factor .Using
Constructor.
 */

import java.util.*;

class Get_Factor {
    Scanner sc = new Scanner(System.in);
    int number;

    Get_Factor() {
        System.out.print("Enter value for getting its Factors : ");
        number = sc.nextInt();

        System.out.print("\nFactors of " + number + " : ");
        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

public class Factor {
    public static void main(String args[]) {
        Get_Factor gf = new Get_Factor();
    }
}
