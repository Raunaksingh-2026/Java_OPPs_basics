package pkg2;

/**===================================== ABSTRACTION =====================================**/
/**
 * ABSTRACTION -> Hide implementation
 * ABSTRACT CLASS -> Used as a blueprint for child classes.
     -> Cannot create object directly.
     Can contain:
     ✔ Abstract Methods
     ✔ Concrete Methods
     ✔ Variables
     ✔ Constructors
     -> it can have both either CONCRETE or ABSTRACT METHOD
     -> use ABSTRACT keyword with CLASS and use EXTENDS keyword with another CLASS who wants to inherit feature of that CLASS
     -> Use Abstract Class -->> When classes share common behavior.
 * INTERFACE -> Contract for classes
     -> Use Interface -->> When classes share common capability.
 * extends
      -> Class inherits Class
      -> Interface inherits Interface
 * implements
      -> Class implements Interface

 * UPCASTING -> Parent reference = Child object
 ** DOWNCASTING -> Parent Reference = Child Reference --> Explicit cast required.
 * LAMBDA -> Functional Interface only
 * FUNCTIONAL INTERFACE -> Exactly one abstract method
**/

abstract class Car {
//    VARIABLE Can be private, protected, final, non-static, etc.

    //    wants to create [ METHOD without body or ABSTRACT METHOD ] by using ABSTRACT keyword -> child class must provide Implementation
    public abstract void driveCar();

    //    if we want to create another ABSTRACT METHOD then it is necessary to initialize it in CHILD CLASS
    public abstract void speedOfCar(int speed);

    //    create CONCRETE METHOD / METHOD with body [ METHOD with Body ] -> Child class can use it Directly
    public void playMusic() {
        System.out.println("Playing music...");
    }
}

/******************* SINGLE LEVEL INHERITANCE with ABSTRACTION *******************/
//    CHILD CLASS of ABSTRACT CLASS [ "Car" CLASS ] must have body of all ABSTRACT METHOD in SINGLE CLASS which was declared in PARENT CLASS
//    as many CHILD CLASS of ABSTRACT CLASS present then every CHILD CLASS must have all ABSTRACT METHOD
/*
---------------------
        Car
          ↓
        WagonR
---------------------
    --> WagonR must implement ALL abstract methods of Car.
*/
class WagonR extends Car {
    //    providing implementation for ABSTRACT METHOD
    public void driveCar() {
        System.out.println("Ready to Drive...");
    }

    //    providing implementation for another ABSTRACT METHOD
    public void speedOfCar(int speed) {
        System.out.println(speed + " km/hr");
    }
}

/******************* MULTI LEVEL INHERITANCE with ABSTRACTION *******************/
//    CHILD CLASS of "Car" CLASS must have body of ABSTRACT METHOD in CLASS which was declared in PARENT CLASS
//    if we want to add few METHOD only then we have to make this as ABSTRACT CLASS and remaining METHODS will be initialized in another CLASS which INHERIT this ABSTRACT Class
/*
----------------------------
             Car
              ↓
    Lamborghini (Abstract)
              ↓
    ModifiedLamborghini
----------------------------
    -> An abstract child class can implement SOME methods and leave remaining methods for another child.
 */
abstract class Lamborghini extends Car {
//    providing implementation for ABSTRACT METHOD
    public void driveCar() {
        System.out.println("Ready to Drive...");
    }

    public String colorOfLamborghini(String color) {
        return "This is " + color + " Color";
    }
}

//    creating CONCRETE CLASS
//    remaining ABSTRACT method will be initialized here
class ModifiedLamborghini extends Lamborghini {
//    providing implementation for another remaining ABSTRACT METHOD
    public void speedOfCar(int speed) {
        System.out.println(speed + " km/hr");
    }
}

///   -------------------------------------------------------------------------------------------------------------------------
//        CLASS - CLASS --> EXTENDS
//        INTERFACE - INTERFACE --> EXTENDS
//        CLASS - INTERFACE --> IMPLEMENTS
///   -------------------------------------------------------------------------------------------------------------------------

/**===================================== INTERFACE =====================================**/
// INTERFACE -> Used to achieve abstraction.
//    -> Cannot create object directly.
//    -> All methods are implicitly --> public abstract
//    -> All variables are implicitly --> public static final

// MULTIPLE INHERITANCE ->
///    Java does not support -> Class + Class
///    But supports -> Interface + Interface --> through implementation.

//    Creating INTERFACE METHOD
//    can have only ABSTRACT METHOD not CONCRETE METHOD
//    uses keyword INTERFACE and IMPLEMENTS
interface Car1 {
//    this VARIABLE is always be PUBLIC, STATIC, and FINAL which cannot be changed
//    VARIABLE must be INITIALISED and these can be DIRECTLY access without using OBJECT
    String variableName = "INTERFACE VARIABLE ";

//    creating ABSTRACT METHOD
//    these METHODS are by default "PUBLIC, and ABSTRACT" that's why we can call as INTERFACE-ABSTRACT METHOD
    void driveCar1();
    void musicPlayer1();
}

interface HatchbackCar1 {
    void videoPlayer1();
}

//    @FunctionalInterface -> Ensures that the interface contains exactly ONE abstract method.
//    -> Required for Lambda Expressions.
@FunctionalInterface
interface SportsCar1 {
    void accelerateCar1(int speed1);
}

//    must INITIALISE all ABSTRACT METHOD of PARENT CLASS and all METHOD must be PUBLIC
class WagonR1 implements Car1, HatchbackCar1{ // we also IMPLEMENT MULTIPLE INTERFACE CLASS in single CLASS which is call as MULTI INHERITANCE
    public void driveCar1() {
        System.out.println("DRIVING.... ");
    }

    public void musicPlayer1() {
        System.out.println("MUSIC PLAYING.... ");
    }

    public void videoPlayer1() {
        System.out.println("VIDEO PLAYING.... ");
    }

    public void smartBreak1() {
        System.out.println("APPLYING BREAK.... ");
    }
}

public class OOPs_5_1_Abstraction {
    public static void main(String[] args) {

    /**----------------------------------- ABSTRACTION -----------------------------------**/
        /**++++++++++++++++ SINGLE LEVEL INHERITANCE with ABSTRACTION ++++++++++++++++**/
        System.out.println("\n<-- By using SINGLE LEVEL INHERITANCE with ABSTRACTION -->");
//        we cannot create object of ABSTRACT CLASS
//        Car ability = new Car(); // this will go to give a compile time error because wo only use ABSTRACT CLASS as REFERENCE only not for OBJECT
        Car ability = new WagonR();
        System.out.println("Using Car Reference and WagonR Object ");
        ability.playMusic();
        ability.driveCar();
        ability.speedOfCar(40);

        /**++++++++++++++ Multi LEVEL INHERITANCE with ABSTRACTION +++++++++++++++++**/
        System.out.println("\n<-- By using MULTI LEVEL INHERITANCE with ABSTRACTION -->");
//        Car car = new Car(); // this will go to give a compile time error because wo only use ABSTRACT CLASS as REFERENCE only not for OBJECT
//        Car carLamborghini = new Lamborghini(); // this will also go to give a compile time error because wo only use ABSTRACT CLASS as REFERENCE only not for OBJECT
        Car carModifiedLamborghini = new ModifiedLamborghini();
        System.out.println("Using Car Reference and ModifiedLamborghini Object ");
        carModifiedLamborghini.playMusic();
        carModifiedLamborghini.driveCar();
        carModifiedLamborghini.speedOfCar(80);

        System.out.println(carModifiedLamborghini instanceof Lamborghini); ///  [ instanceof ] -> Checks actual object type at runtime.

        Lamborghini lamborghini = new ModifiedLamborghini(); // to use CONCRETE METHOD of "Lamborghini" ABSTRACT CLASS we have used this ClASS as REFERENCE and make OBJECT to Its CHILD CONCRETE CLASS
        System.out.println("\nUsing Lamborghini Reference and ModifiedLamborghini Object");
        System.out.println(lamborghini.colorOfLamborghini("Red"));

        /**----------------------------------- INTERFACE -----------------------------------**/
            /**+++++++++++++++++++++ SINGLE INTERFACE INHERITANCE +++++++++++++++++++++**/
        System.out.println("\n<-- By using SINGLE INTERFACE INHERITANCE -->");
//        We cannot create object of Interface directly.
//        Car1 car = new Car1(); // Compile Time Error
//        INTERFACE REFERENCE + IMPLEMENTING CLASS OBJECT -> This is called UPCASTING.
        Car1 carReference = new WagonR1();
//        Accessible Methods -> Only methods declared inside Car1.
//        Calling methods declared in Interface
        System.out.println("Using Car1 Reference");
        carReference.driveCar1();
        carReference.musicPlayer1();

///        Reference Type decides -> Which methods are visible.
///        Object Type decides -> Which implementation runs.

        /**+++++++++++++++++++++ MULTIPLE INTERFACE INHERITANCE +++++++++++++++++++++**/
        System.out.println("\n<-- By using MULTIPLE INTERFACE INHERITANCE -->");
        HatchbackCar1 hatchbackCar1Reference = new WagonR1();
//        Accessible Methods -> Only methods declared inside hatchbackCar1.
//        Calling methods declared in Interface
        System.out.println("Using HatchbackCar1 Reference");
        hatchbackCar1Reference.videoPlayer1();

        WagonR1 wagonR1Reference = new WagonR1();
//        Can access -> ✔ Interface Methods || ✔ Class-Specific Methods
//        Calling accessible methods by child reference
        System.out.println("\nUsing WagonR1 Reference");
        wagonR1Reference.driveCar1();
        wagonR1Reference.musicPlayer1();
        wagonR1Reference.videoPlayer1();
        wagonR1Reference.smartBreak1();

//        Creating Anonymous Class for INTERFACE CLASS
        System.out.println("\nANONYMOUS CLASS Without Using LAMBDA EXPRESSION");
        SportsCar1 sportsCar1Reference1 = new SportsCar1() {
            public void accelerateCar1(int speed) {
                System.out.println("ACCELERATEING.... " + "> >> >>> " + speed + "Km/hr > >> >>> >>>>");
            }
        };
        sportsCar1Reference1.accelerateCar1(50);

///        LAMBDA EXPRESSION -> Short form of implementing Functional Interface.
///        LAMBDA FUNCTION can only be used with FUNCTIONAl INTERFACE which have EXACTLY 1 ABSTRACT METHOD
///             Syntax --> [ (parameter) -> { body } ]
//        creating LAMBDA EXPRESSION of Anonymous Class for INTERFACE CLASS
        System.out.println("\nANONYMOUS CLASS With Using LAMBDA EXPRESSION");
        SportsCar1 sportsCar1Reference2 = (int speed1) -> System.out.println("ACCELERATEING.... " + "> >> >>> " + speed1 + "Km/hr > >> >>> >>>>");
        sportsCar1Reference2.accelerateCar1(60);
    }
}
