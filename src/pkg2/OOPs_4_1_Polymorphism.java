package pkg2;

/*
POLYMORPHISM -> Poly = Many || Morphism = Forms
Meaning -> One reference can behave like many objects.
Types -> 1. Compile-Time Polymorphism -> Method Overloading
         2. Run-Time Polymorphism -> Method Overriding || -> Dynamic Method Dispatch
*/
// PARENT CLASS / SUPER CLASS -> Provides a common method that child classes can override.
class Parent {

//    Method that displays the role of a Parent
    void role() {
        System.out.println("I am a Parent.");
    }

}
// Derived class "Child1" that Inherits Parent class and overrides the role method of "Parent"
class Child1 extends Parent {

    public Child1() {
    }

//    @Override -> Tells compiler that this method is intended to override a method from the parent class.
//    Benefit -> Compiler checks for mistakes.
    @Override // form of metadata that provide supplemental information about a program without being part of the program's actual logic.
    void role() { // METHOD OVERRIDING -> Same method name | Same parameters | Same return type || BUT || Different implementation.
        System.out.println("I am a First Child.");
    }
}

// Derived class "Child2" that Inherits Parent class and overrides the role method "Parent"
class Child2 extends Parent {

//    Overridden method to show the role of a "Child2"
//    METHOD OVERRIDING -> Same method name | Same parameters | Same return type -> But Different implementation.
    void role() {
        System.out.println("I am a Second Child.");
    }
}

public class OOPs_4_1_Polymorphism {
/*
    DYNAMIC METHOD DISPATCH -> Parent reference -> Child object
    -> Method call is decided at Runtime based on actual object type.
        Reference Type : Parent
        Object Type    : Child1 / Child2
    -> This is the foundation of Runtime Polymorphism.
*/
    public static void main(String[] args) {
        /***************************** DYNAMIC METHOD DISPATCH **************************/
//        Creating a reference of type "Parent" but initializing it with "Parent" class object
//        At runtime, the method that gets executed depends on the actual object type, not the reference type.
        Parent familyMember = new Parent(); //  Parent Reference | Parent Object -> Calls Parent's role() method.
        familyMember.role();// Calling the role method of "Parent"

/*
        Parent Reference | Child1 Object -> Upcasting happens automatically.
        -> At runtime JVM checks: Actual object = Child1
        >> Therefore Child1's role() method is executed.
*/
//        Creating a reference of type "Parent" but initializing it with "Child1" class object
        familyMember = new Child1();
        familyMember.role();// Calling the role method. It calls the overridden version in "Child1" class

/*
        Same reference variable | Different object assigned.
        -> JVM calls Child2's overridden method at runtime.
*/
//        Creating a reference of type "Parent" but initializing it with "Child2" class object
        familyMember = new Child2();
        familyMember.role();// Calling the role method. It calls the overridden version in "Child2" class
    }
}


