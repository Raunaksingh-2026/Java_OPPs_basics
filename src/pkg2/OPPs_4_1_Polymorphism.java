package pkg2;

/*
POLYMORPHISM -> Poly = Many || Morphism = Forms
Meaning -> One reference can behave like many objects.
Types -> 1. Compile-Time Polymorphism -> Method Overloading
         2. Run-Time Polymorphism -> Method Overriding || -> Dynamic Method Dispatch
*/
// PARENT CLASS / SUPER CLASS -> Provides a common method that child classes can override.
class Parent {

//     Method that displays the role of a Parent
    void role() {
        System.out.println("I am a Parent.");
    }

}
// Derived class "Child1" that Inherits Parent class and overrides the role method of "Parent"
class Child1 extends Parent {

    public Child1() {
    }
    /*
    @Override -> Tells compiler that this method is intended to override a method from the parent class.
    Benefit -> Compiler checks for mistakes.
    */
    @Override // form of metadata that provide supplemental information about a program without being part of the program's actual logic.
    void role() { // METHOD OVERRIDING -> Same method name | Same parameters | Same return type || BUT || Different implementation.
        System.out.println("I am a First Child.");
    }

}

// Derived class "Child2" that Inherits Parent class and overrides the role method "Parent"
class Child2 extends Parent {

    // Overridden method to show the role of a "Child2"
    void role() {
        System.out.println("I am a Second Child.");
    }
}

public class OPPs_4_1_Polymorphism {
    public static void main(String[] args) {
        /***************************** DYNAMIC METHOD DISPATCH **************************/
        // Creating a reference of type "Parent" but initializing it with "Parent" class object
        //At runtime, the method that gets executed depends on the actual object type, not the reference type.
        Parent familyMember = new Parent();

        familyMember.role();// Calling the role method of "Parent"

        // Creating a reference of type "Parent" but initializing it with "Child1" class object
        familyMember = new Child1();

        familyMember.role();// Calling the role method. It calls the overridden version in "Child1" class

        // Creating a reference of type "Parent" but initializing it with "Child2" class object
        familyMember = new Child2();

        familyMember.role();// Calling the role method. It calls the overridden version in "Child2" class


    }
}


