package pkg2;

/*********************** Creating Class ***********************/
///    A Class is a blueprint/template for creating objects.
//    -> Car blueprint → color, price, start()
class StudentDetail {

    /*************** DATA MEMBERS / VARIABLES ***************/
    // instance variables
    // every object will get its own copy
    String studentName;
    int studentAge;
    int studentRollNumber;

    /********************* Creating METHODS **************************/
    void showStudentDetails() {// method to display student details
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Age : " + studentAge);
        System.out.println("Student Roll No. : " + studentRollNumber);
        System.out.println();
    }
}

/*********************** Creating Main Class ***********************/
public class OOPs_1_1_ClassAndObject {
    static void main(String[] args) {
///        Object is a real instance of class.
        /**************** FIRST OBJECT ****************/
        // creating first object of StudentDetail class
        StudentDetail student1 = new StudentDetail();

        // assigning values to object variables
        student1.studentName = "Raunak";
        student1.studentAge = 20;
        student1.studentRollNumber = 101;

        // calling method using object
        student1.showStudentDetails();

        /**************** SECOND OBJECT ****************/
        // creating second object
        StudentDetail student2 = new StudentDetail();

        // assigning different values
        student2.studentName = "Aman";
        student2.studentAge = 21;
        student2.studentRollNumber = 102;

        // calling method using second object
        student2.showStudentDetails();

        /**************** IMPORTANT CONCEPT -> Changing first Student Data ****************/
///        student1 and student2 are different objects. -> Both have separate memory.
//        Changing student1 data -> will NOT affect student2.

        student1.studentName = "Updated Raunak";
        System.out.println("After Updating student1 Data");
        System.out.println();

///         only student1 changes -> student2 remains same
        student1.showStudentDetails();
        student2.showStudentDetails();
    }
}

