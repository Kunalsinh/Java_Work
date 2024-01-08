// Simple program of java where we use one constructor for print Hello World! and other methods for doing aerithmetic operations.
class Hello{
    
    int number1 = 10;
    int number2 = 5;
        
    void add(){
        int sum = number1+number2;
        System.out.println("Addition is "+sum);
    }

    void sub(){
        int sum = number1-number2;
        System.out.println("Subtraction is "+sum);
    }

    void mul(){
        int sum = number1*number2;
        System.out.println("Multiplication is "+sum);
    }

    void div(){
        int sum = number1/number2;
        System.out.println("Division is "+sum);
    }

    Hello(){
        System.out.println("Hello World!");
    }
}
public class printHello{

    public static void main(String args[]){
        Hello hlo = new Hello();
        hlo.add();
        hlo.sub();
        hlo.mul();
        hlo.div();
        
    }
}