package pkg2.OPPs_2_Inheritance;

/**************************** SUB CLASS / CHILD CLASS ****************************/
//    SUB CLASS / CHILD CLASS -> This class inherits properties and methods from BasicCalculator class using "extends".

public class AdvanceCalculator extends BasicCalculator {// here "AdvanceCalculator" is SUBCLASS and "BasicCalculator" is SUPERCLASS and " EXTENDS " is KEYWORD used for subclass to INHERIT FUNCTIONALITY of superclass

    /**************************** METHOD OVERRIDING ****************************/
//        METHOD OVERRIDING -> Redefining superclass method inside subclass.

    @Override
    public int addTwoNumbers(int firstNumber, int secondNumber) {// this METHOD ' OVERRIDING ' the same METHOD which is available in SUPERCLASS by that's way we redefine that METHOD of SUPERCLASS when we want.
        int addTwoNumbers = firstNumber + secondNumber + 5; ///  Overridden logic -> adding extra [ + 5 ]
        return addTwoNumbers;
    }

    /**************************** MULTIPLICATION METHOD ****************************/
    public int multiplyTwoNumbers(int firstNumber, int secondNumber) {
        int multiplicationOfTwoNumbers = firstNumber * secondNumber;
        return multiplicationOfTwoNumbers;
    }

    /**************************** DIVISION METHOD ****************************/
    public int divideTwoNumber(int firstNumber, int secondNumber) {

        int divisionOfTwoNumbers = firstNumber / secondNumber;
        return divisionOfTwoNumbers;
    }
}
