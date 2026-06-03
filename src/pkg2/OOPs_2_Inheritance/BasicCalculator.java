package pkg2.OPPs_2_Inheritance;

/**************************** SUPER CLASS / PARENT CLASS ****************************/
//    SUPER CLASS / PARENT CLASS -> Other classes can inherit these methods using the "extends" keyword.

public class BasicCalculator { //  This class contains basic mathematical operations.

    /**************************** ADDITION METHOD ****************************/
    public int addTwoNumbers(int firstNumber, int secondNumber) {
        int sumOfTwoNumbers = firstNumber + secondNumber;
        return sumOfTwoNumbers;
    }

    /**************************** SUBTRACTION METHOD ****************************/
    public int subtractTwoNumbers(int firstNumber, int secondNumber) {
        int subtractionOfTwoNumbers = firstNumber - secondNumber;
        return subtractionOfTwoNumbers;
    }
}
