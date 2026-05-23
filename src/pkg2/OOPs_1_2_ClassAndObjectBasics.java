package pkg2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/// Here we created a Calculator class.
class Calculator { // here [ Calculator ] is CLASS_NAME which is written in PascaleNamingConvention and these CLASS is accessed by calling in MAIN_METHOD using OBJECT

//    STATIC VARIABLE -> Shared among all objects of class.
    static int same = 87; /// it is member of CLASS there is NO NEED to make object fot STATIC variable which is same for all and can be access by using [ ClassName.VariableName ] Also we can call STATIC_METHOD using CLASS

//    INSTANCE VARIABLES -> Every object gets separate copy.
    int age = 19;// it is INSTANCE VARIABLE
    String message = "Hello Brother ! ";// it is INSTANCE VARIABLE

    /**************************** Creating METHOD *******************************/
    public int add(int firstNumber, int secondNumber) { /// passing "2" ARGUMENT
        DateTimeFormatter takeDate = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // Formating Date pattern

//        LOCAL VARIABLES -> Variables declared inside method.
        LocalDate dateOfBirth = LocalDate.parse("23-08-2005", takeDate); // Converted String into LocalDate Object VARIABLE
        System.out.println(dateOfBirth);

        System.out.print("ADDITION of numbers : ");
        return firstNumber + secondNumber;
    }

    /**************************** Method Overloading *******************************/
//    Creating another METHOD with SAME name
//    1. METHOD OVERLOADING -> we can also create multiple METHOD of same name but the ARGUMENT must be different from other METHOD int term of their DATA_TYPE of in term of their numbers of quantity these technic is known as " OVERLOADING "
    public int add(int numberForAdd1, int numberForAdd2, int numberForAdd3) { /// passing " 3 " ARGUMENT

        System.out.print("ADDITION of numbers : ");
        int resultOfAdd = numberForAdd1 + numberForAdd2 + numberForAdd3;
        return resultOfAdd;
    }

    /**************************** Method Overloading *******************************/
//    Creating Third METHOD with SAME name
//    2. METHOD OVERLOADING -> Same method name but different data type.
    public long add(long numberForAdd1, int numberForAdd2) { /// passing different DATA_TYPE of ARGUMENT
        System.out.print("ADDITION of numbers : ");
        long resultOfAdd = numberForAdd1 + numberForAdd2;
        return resultOfAdd;
    }
}
/**************************** MAIN CLASS ****************************/
public class OOPs_1_2_ClassAndObjectBasics {

    //        STATIC NESTED CLASS -> Can be accessed without creating object of outer class.
    public static class UserInputHandler1 { //for accessing this class in MAIN_METHOD we have to use "static" keyword before "class" keyword because this class and MAIN_METHOD in same class named "UserInputHandler1"

        public void takeInput1() {
            Scanner scanValue = new Scanner(System.in);

            System.out.println("Enter any value");
            int num1 = scanValue.nextInt();
        }
    }
    /**************************** MAIN METHOD ****************************/
    public static void main(String[] args) {
//        declaring PRIMITIVE_VARIABLE
//        PRIMITIVE VARIABLES -> Stores primitive data directly.
        int number1 = 10;
        int number2 = 20;
        int number3 = 45;

        /**************************** OBJECT CREATION ****************************/
//            OBJECT -> Real-world instance of class.
//            Syntax -> ClassName referenceVariable = new ClassName();

        UserInputHandler1 hereIsValue = new UserInputHandler1(); // Creating object
        hereIsValue.takeInput1(); // Calling object using Class

//         for accessing "add" METHOD which is available in different CLASS named " CALCULATOR " we have to create OBJECT of Calculator Class
        Calculator calcValue = new Calculator();// here " calcValue " is REFERENCE_VARIABLE which required some SPACES, and by using " NEW " KEYWORD we can provide

///        accessing instance variables using object
        System.out.println("INSTANCE VARIABLE " + calcValue.age);// calling INSTANCE VARIABLE using REFERENCE_VARIABLE which is obtained by creating OBJECT
        System.out.println("INSTANCE VARIABLE " + calcValue.message);// calling INSTANCE VARIABLE using REFERENCE_VARIABLE which is obtained by creating OBJECT
        /**  accessing static variable using class name no need to create object for static members **/
        System.out.println("STATIC VARIABLE " + Calculator.same);// calling STATIC VARIABLE without using REFERENCE_VARIABLE we can use this variable without creating OBJECT

        /**************************** CALLING METHODS ****************************/

//        calling overloaded add() method -> JVM decides which method to call based on arguments passed.

//         this add() METHOD also gives some RETURN_VALUE, and we can print that value by providing VARIABLE to the calling statement
        int result = calcValue.add(number1, number2, number3);
        System.out.println(result);  // printing final result
    }
}
