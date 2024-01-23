package Assignment1;

import java.util.*;

class PatternFloyd {
    Scanner sc = new Scanner(System.in);
    int number, floyd_num = 1;

    void makePattern() {

        System.out.print("Enter number for make Pattern : ");
        number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("\t" + floyd_num++);
            }
            System.out.println();
        }
    }
}

public class FloydTriangle {
    public static void main(String args[]) {
        PatternFloyd pf = new PatternFloyd();
        pf.makePattern();
    }
}
