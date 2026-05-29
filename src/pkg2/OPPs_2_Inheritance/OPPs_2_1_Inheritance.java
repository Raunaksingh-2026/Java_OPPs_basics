package pkg2.OPPs_2_Inheritance;

import java.util.Scanner;

///  INHERITANCE -> Inheritance allows one class to acquire properties and methods of another class.
/*
    This program demonstrates:
    ✔ Superclass
    ✔ Subclass
    ✔ Inheritance
    ✔ Method Overriding
    ✔ Single Level Inheritance
*/
/**************************** INHERITANCE MAIN CLASS ****************************/
public class OPPs_2_1_Inheritance {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("PLese enter first number : ");
        int userNumber1 = userInput.nextInt();
        System.out.print("Please enter second number : ");
        int userNumber2 = userInput.nextInt();

/*************************** Without INHERITANCE ****************************/
//        we only use METHOD of SINGLE CLASS only
//        Here we can use only methods of [ BasicCalculator ] class.
        BasicCalculator basicCalc = new BasicCalculator();
        int basicAddition = basicCalc.addTwoNumbers(userNumber1, userNumber2);
        int basicSubtraction = basicCalc.subtractTwoNumbers(userNumber1, userNumber2);

        System.out.println("\nWITHOUT INHERITANCE");
        System.out.println("ADDITION of two numbers : " + basicAddition);
        System.out.println("SUBTRACTION of two numbers : " + basicSubtraction);

/*************************** With SINGLE LEVEL INHERITANCE ****************************/
// we use METHOD of DOUBLE CLASS by creating OBJECT of "SUBCLASS"
         /*
            AdvanceCalculator object can access:
            ✔ inherited methods
            ✔ overridden methods
            ✔ subclass methods
        */
        AdvanceCalculator advanceCalc = new AdvanceCalculator();
        int advanceAddition = advanceCalc.addTwoNumbers(userNumber1, userNumber2);/// [ addTwoNumber() ] -> overridden in [ advanceCal ] -> [ addTwoNumber() + 5 ]
        int advanceSubtraction = advanceCalc.subtractTwoNumbers(userNumber1, userNumber2);
        int advanceMultiplication = advanceCalc.multiplyTwoNumbers(userNumber1, userNumber2);
        int advanceDivision = advanceCalc.divideTwoNumber(userNumber1, userNumber2);


        System.out.println("\nWITH INHERITANCE");
        System.out.println("OVERRIDDEN ADDITION of two numbers : " + advanceAddition);
        System.out.println("SUBTRACTION of two numbers : " + advanceSubtraction);
        System.out.println("MULTIPLICATION of two numbers : " + advanceMultiplication);
        System.out.println("DIVISION of two numbers : " + advanceDivision);


/*************************** With MULTI LEVEL INHERITANCE ****************************/
//      we use METHOD of DIFFERENT CLASSES by creating OBJECT of "SUBCLASS"
///        Multi-Level Inheritance -> Class A → inherited by Class B -> Class B → inherited by Class C

///        This can be implemented later.

        userInput.close(); // Closing Scanner
    }
}
