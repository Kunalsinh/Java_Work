package Assignment1;

import java.util.*;
class CheckNum{
    Scanner sc = new Scanner(System.in);
    
    int number,originalNumber,remainNumber,answer;
    void armsNum(){

        System.out.print("Enter number for checking the number is armstrong or not : ");
        number = sc.nextInt();
        
        if(number > 0){
            originalNumber = number;
            while(originalNumber != 0){
                remainNumber = originalNumber % 10;
                answer += remainNumber * remainNumber * remainNumber;
                originalNumber /= 10;
            }
            if(answer == number){
                System.out.println("Number is Armstrong!");
            }
            else{
                System.out.println("Number is not Armstrong!");
            }
        }else{
            System.out.println("Please enter positive number only!");
        }
    }
}

public class ArmstrongNum {
        public static void main(String args[]){
        
        CheckNum cn = new CheckNum();
        cn.armsNum();
    }
}
