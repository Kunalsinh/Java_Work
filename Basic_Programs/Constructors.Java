// Define Constructor...
// In this program i used one normal Constructor and one Parameterized Constructor, for this we can also say this is a Constructor Overloading program.



import java.util.*;

class AllConstructors{
    Scanner sc = new Scanner(System.in);
    String uniName,studentName;
    int rollNo,subjectJava,subjectLaravel,subjectReactJS,total,percentage;
    char courseDivision;

    AllConstructors(){

        System.out.print("Enter University name :");
        uniName = sc.nextLine();
    
        System.out.print("Enter Student name :");
        studentName = sc.nextLine();
        
        System.out.print("Enter Roll No. :");
        rollNo = sc.nextInt();
        
        System.out.print("Enter Course Division :");
        courseDivision = sc.next().charAt(0);
        System.out.println("-----------------------------------------------------------------------------"); 
    }

    AllConstructors(int subReactJS,int subJava,int subLaravel){
        subjectReactJS = subReactJS;
        subjectJava = subJava;
        subjectLaravel = subLaravel;

        total = subjectJava + subjectLaravel + subjectReactJS;
        percentage = total / 3;

    }

    void displayStudentData(){
        System.out.println("University Name : \t"+uniName);
        System.out.println("Student Name : \t"+studentName);
        System.out.println("Student Roll No. : \t"+rollNo);
        System.out.println("Student Division : \t"+courseDivision);
        System.out.println("-----------------------------------------------------------------------------");
    }
    void displayMarks(){
        System.out.println("ReactJs : "+subjectReactJS+"\tJava : "+subjectJava+"\tLaravel : "+subjectLaravel);
        System.out.println("Total :"+total+"\tPercentage :"+percentage);
    }

}

public class Constructors{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int reactjs,java,laravel;
        AllConstructors ac1 = new AllConstructors();

        System.out.print("Enter marks of ReactJS :");
        reactjs = sc.nextInt();

        System.out.print("Enter marks of Java :");
        java = sc.nextInt();

        System.out.print("Enter marks of Laravel :");
        laravel = sc.nextInt();


        AllConstructors ac2 = new AllConstructors(reactjs,java,laravel);

        ac1.displayStudentData();
        ac2.displayMarks();
    }
}
