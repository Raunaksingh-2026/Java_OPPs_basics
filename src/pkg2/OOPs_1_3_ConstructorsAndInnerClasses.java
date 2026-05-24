package pkg2;

class Cars {

    static String companyName; /// STATIC VARIABLE -> Shared among all objects of class, and Can be accessed using -> [ ClassName.variableName ]
    int price;
    String carName; /// INSTANCE VARIABLES -> Every object gets separate copy.
    private String ownerOfCompany; /// PRIVATE VARIABLES -> Accessible only inside same class.
    private int ageOfOwnerOfCompany;

    /**************************** STATIC BLOCK ****************************/
//    STATIC BLOCK -> Executes only once when class is loaded into memory.
//    -> or when CLASS is LOADED from LIBRARY
//    -> this will run only ONCE
    static {
        companyName = "Automobile Lamborghini";
        System.out.println("This is STATIC BLOCK calls only once ");
    }

    /******************************* Creating CONSTRUCTOR *******************************/
//    CONSTRUCTOR -> Automatically called when object is created.
//    -> Used to initialize object data.
//    -> one call for each OBJECT created.
//    -> it is SAME a CLASS name
    public Cars() {// this is CONSTRUCTOR
        carName = "Lamborghini Fenomeno";
        price = 325816750;
        System.out.println("This is NON-PARAMETERIZED CONSTRUCTOR and CALL as many we create OBJECT of OUTER CLASS ");
        System.out.println(companyName + " : " +"\u20B9"+ price + " : " + carName);
    }

    /********************** PARAMETERIZED CONSTRUCTOR **********************/
//    PARAMETERIZED CONSTRUCTOR ->  Used to initialize object with custom values.
    public Cars(String carName, int price) {//this is PARAMETRIZED CONSTRUCTOR called by PARAMETERISED OBJECT, there will be 1 call for each time this CONSTRUCTOR's OBJECT created
        this.carName = carName;// [ this ] keyword refers current object
        this.price = price;
        System.out.println("This is PARAMETERISED CONSTRUCTOR and CALL as many we create OBJECT of OUTER CLASS with PARAMETER is passed ");
        System.out.println(companyName + " : " +"\u20B9"+ price + " : " + carName);
    }

    public String showDetails() {
        return (companyName + " : " +"\u20B9"+ price + " : " + carName);
    }

    /*++++++++++++++++++++ Non-Static INNER CLASS ++++++++++++++++++++*/
//    creating NON STATIC INNER CLASS
//    NON-STATIC INNER CLASS -> Requires object of outer class to create inner class object.
    class SportCars {
        public void sportsCar() { // we can directly access the static ore non-static variable of OUTER CLASS there is no need OBJECT of OUTER CLASS
            carName = "BMW M8";
            price = 235000000;
            System.out.println("This is NON-STAIC INNER CLASS ");
            System.out.println(companyName + " : " +"\u20B9"+ price + " : " + carName);
            String show = showDetails();
            System.out.println("Detail " + show);
        }
    }

    /******************************* creating STATIC INNER CLASS *******************************/
    static class SuperSportCars {// we can directly access the static variable of OUTER CLASS but for using NON-STATIC VARIABLE/INSTANCE first we need OBJECT of OUTER CLASS
        public void superSportsCar() {
            Cars carValue = new Cars(); // Creates object only when method runs.
            carValue.carName = "Bugatti Chiron";
            carValue.price = 450000000;
            System.out.println("This is STATIC INNER CLASS ");
            System.out.println(companyName + " : " + "\u20B9" + carValue.price + " : " + carValue.carName);
           /****** HOW I CALL THIS ***************/
            String show = carValue.showDetails();
            System.out.println("Detail " + show);
        }
    }
}

/**************************** MAIN CLASS ****************************/
public class OOPs_1_3_ConstructorsAndInnerClasses {
    public static void main(String[] args) {

        /**++++++++++++++++++++ Constructors ++++++++++++++++++**/
        Cars carValue = new Cars(); ///  Object for non parameterized Constructor

        Cars carValue2 = new Cars("Lamborghini Revuelto",870000000); /// Object for parameterized constructor

        /*++++++++++++++++++++ NON-STATIC INNER CLASS +++++++++++++++++++*/
        Cars.SportCars carValue3 = carValue.new SportCars(); /// if we want to access NON-STATIC INNER CLASS then we need to use OUTER CLASS as REFERENCE and then for using its METHOD we needs object of OUTER class for creating object of INNER CLASS
        carValue3.sportsCar();

        /*++++++++++++++++++++ STATIC INNER CLASS +++++++++++++++++++*/
        Cars.SuperSportCars carValue4 = new Cars.SuperSportCars(); /// if we want to access STATIC INNER CLASS then we need to use OUTER CLASS as REFERENCE and then for using its METHOD we needs not needs object of OUTER class instead we use OUTER CLASS as REFERENCE for creating object of INNER CASS
        carValue4.superSportsCar();

        /**************************** SHOWING DETAILS ****************************/
        System.out.println("\nShowing Detail ");
        System.out.println(carValue2.showDetails());
//        System.out.println(show);
        carValue.showDetails();
        carValue2.showDetails();
//        carValue3.showDetail();
    }
}
