package pkg2.OPPs_2_Inheritance;

import java.util.Scanner;

public class OPPs_2_1_Inheritance {
    public static void main(String[] args) {

        Scanner userValue = new Scanner(System.in);

        System.out.print("PLese enter first number : ");
        int userNumber1 = userValue.nextInt();
        System.out.print("Please enter second number : ");
        int userNumber2 = userValue.nextInt();

/*************************** Without INHERITANCE ****************************/
//        we only use METHOD of SINGLE CLASS only

        BasicCalculator basicCalc = new BasicCalculator();
        int resultB1 = basicCalc.addTwoNumbers(userNumber1, userNumber2);
        int resultB2 = basicCalc.subtractTwoNumbers(userNumber1, userNumber2);
        System.out.println("ADDITION of two numbers : " + resultB1);
        System.out.println("SUBTRACTION of two numbers : " + resultB2);

/*************************** With SINGLE LEVEL INHERITANCE ****************************/
// we use METHOD of DOUBLE CLASS by creating OBJECT of "SUBCLASS"

        AdvanceCalculator advanceCalc = new AdvanceCalculator();
        int result1 = advanceCalc.addTwoNumbers(userNumber1, userNumber2);/// [ addTwoNumber() ] -> overridden in [ advanceCal ] -> [ addTwoNumber() + 5 ]
        int result2 = advanceCalc.subtractTwoNumbers(userNumber1, userNumber2);
        int result3 = advanceCalc.multiplyTwoNumbers(userNumber1, userNumber2);
        int result4 = advanceCalc.divideTwoNumber(userNumber1, userNumber2);
        System.out.println("ADDITION of two numbers : " + result1);
        System.out.println("SUBTRACTION of two numbers : " + result2);
        System.out.println("MULTIPLICATION of two numbers : " + result3);
        System.out.println("DIVISION of two numbers : " + result4);


/*************************** With MULTI LEVEL INHERITANCE ****************************/
// we use METHOD of DIFFERENT CLASSES by creating OBJECT of "SUBCLASS"
    }
}
