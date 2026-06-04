package pkg2;
/**===================================== ABSTRACTION =====================================**/
//  creating ABSTRACT CLASS
//  -> Cannot create object directly.
//  -> Used as a blueprint for child classes.
//    Can contain:
//        ✔ Abstract Methods
//        ✔ Concrete Methods
//        ✔ Variables
//        ✔ Constructors
//  -> it can have both either CONCRETE or ABSTRACT METHOD
//  -> use ABSTRACT keyword with CLASS and use EXTENDS keyword with another CLASS who wants to inherit feature of that CLASS
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
public class OOPs_5_1_Abstraction {
    public static void main(String[] args) {

    /**----------------------------------- ABSTRACTION -----------------------------------**/
        /**++++++++++++++++ SINGLE LEVEL INHERITANCE with ABSTRACTION ++++++++++++++++**/
        System.out.println("<-- By using SINGLE LEVEL INHERITANCE with ABSTRACTION -->");
//        we cannot create object of ABSTRACT CLASS
//        Car ability = new Car(); // this will go to give a compile time error because wo only use ABSTRACT CLASS as REFERENCE only not for OBJECT
        Car ability = new WagonR();
        ability.playMusic();
        ability.driveCar();
        ability.speedOfCar(40);

        /**++++++++++++++ Multi LEVEL INHERITANCE with ABSTRACTION +++++++++++++++++**/
        System.out.println("<-- By using MULTI LEVEL INHERITANCE with ABSTRACTION -->");
//        Car car = new Car(); // this will go to give a compile time error because wo only use ABSTRACT CLASS as REFERENCE only not for OBJECT
//        Car carLamborghini = new Lamborghini(); // this will also go to give a compile time error because wo only use ABSTRACT CLASS as REFERENCE only not for OBJECT
        Car carModifiedLamborghini = new ModifiedLamborghini();
        carModifiedLamborghini.playMusic();
        carModifiedLamborghini.driveCar();
        carModifiedLamborghini.speedOfCar(80);

        Lamborghini lamborghini = new ModifiedLamborghini(); // to use CONCRETE METHOD of "Lamborghini" ABSTRACT CLASS we have used this ClASS as REFERENCE and make OBJECT to Its CHILD CONCRETE CLASS
        System.out.println(lamborghini.colorOfLamborghini("Red"));
    }
}
