package pkg2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// here I am going to create a CLASS named as calculator
class Calculator { // here Calculator is CLASS_NAME which is written in PascaleNamingConvention and these CLASS is accessed by calling in MAIN_METHOD using OBJECT
    static int same = 87; /// it is member of CLASS there is NO NEED to make object fot STATIC variable which is same for all and can be access by using its CLASS Also we can call STATIC_METHOD using CLASS
    int age = 19;// it is INSTANCE VARIABLE
    String name = "Hello Brother ! ";// it is INSTANCE VARIABLE

    /**************************** Creating METHOD *******************************/
    public int add(int numberForAdd1, int numberForAdd2) { /// passing "2" ARGUMENT
        DateTimeFormatter takeDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate dateOfBirth = LocalDate.parse("23-08-2005", takeDate); // it is LOCAL VARIABLE
        System.out.println(dateOfBirth);

        System.out.print("ADDITION of numbers : ");
        int resultOfAdd = numberForAdd1 + numberForAdd2;
        return resultOfAdd;
    }

    /**************************** Creating another METHOD with SAME name *******************************/
    // we can also create multiple METHOD of same name but the ARGUMENT must be different from other METHOD int term of their DATA_TYPE of in term of their numbers of quantity these technic is known as " OVERLOADING "
    public int add(int numberForAdd1, int numberForAdd2, int numberForAdd3) { /// passing " 3 " ARGUMENT
        System.out.print("ADDITION of numbers : ");
        int resultOfAdd = numberForAdd1 + numberForAdd2 + numberForAdd3;
        return resultOfAdd;
    }

    /**************************** Creating Third METHOD with SAME name *******************************/
    public long add(long numberForAdd1, int numberForAdd2) { /// passing different DATA_TYPE of ARGUMENT
        System.out.print("ADDITION of numbers : ");
        long resultOfAdd = numberForAdd1 + numberForAdd2;
        return resultOfAdd;
    }
}
public class OOPs_1_2_ClassAndObjectBasics {
    public static class UserInputHandler { //for accessing this class in MAIN_METHOD we have to use "static" keyword before "class" keyword becuse this class and MAIN_METHOD in same class named "TakeValue"
        public void userValue() {
            Scanner scanValue = new Scanner(System.in);

            System.out.println("Enter any value");
            int num1 = scanValue.nextInt();
        }
    }

    public static void main(String[] args) {
        // declaring PRIMITIVE_VARIABLE
        int number1 = 10;
        int number2 = 20;
        int number3 = 45;

        UserInputHandler hereIsValue = new UserInputHandler();
        hereIsValue.userValue();

        // for accessing "add" METHOD which is available in different CLASS named " CALCULATOR " we have to create OBJECT
        Calculator calcValue = new Calculator();// here " calcValue " is REFERENCE_VARIABLE which required some SPACES, and by using " NEW " KEYWORD we can provide

        System.out.println("INSTANCE VARIABLE " + calcValue.age);// calling INSTANCE VARIABLE using REFERENCE_VARIABLE which is obtained by creating OBJECT
        System.out.println("INSTANCE VARIABLE " + calcValue.name);// calling INSTANCE VARIABLE using REFERENCE_VARIABLE which is obtained by creating OBJECT
        System.out.println("STATIC VARIABLE " + Calculator.same);// calling STATIC VARIABLE without using REFERENCE_VARIABLE we can use this variable without creating OBJECT

        // now we can finally call the "add()" METHOD from other class
        // this add() METHOD also gives some RETURN_VALUE, and we can print that value by providing VARIABLE to the calling statement
        int result = calcValue.add(number1, number2, number3);
        System.out.println(result);
    }
}
