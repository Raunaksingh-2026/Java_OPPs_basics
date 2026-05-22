package pkg2;

class Cars {

    static String company_Name;
    int price;
    String car_Name;
    private String ownerOfCompany;
    private int ageOfOwnerOfCompany;

    static //this is " SPECIAL BLOCK " known as Static block executes when class is loaded into memory. or when CLASS is LOADED from LIBRARY | this will run only ONCE
    {
        company_Name = "Automobile Lamborghini";
        System.out.println("This is STATIC BLOCK calls only once ");
    }
    public Cars() {// this is CONSTRUCTOR and this is auto call when OBJECT of CLASS is created| one call for each OBJECT created. it is SAME a CLASS name
        car_Name = "Lamborghini Fenomeno";
        price = 325816750;
        System.out.println("This is CONSTRUCTOR and CALL as many we create OBJECT of OUTER CLASS ");
        System.out.println(company_Name + " : " +"\u20B9"+ price + " : " + car_Name);
    }

    public Cars(String car_Name, int price) {//this is PARAMETRISED CONSTRUCTOR called by PARAMETERISED OBJECT, there will be 1 call for each time this CONSTRUCTOR's OBJECT created
        this.car_Name = car_Name;
        this.price = price;
        System.out.println("This is PARAMETERISED CONSTRUCTOR and CALL as many we create OBJECT of OUTER CLASS with PARAMETER is passed ");
        System.out.println(company_Name + " : " +"\u20B9"+ price + " : " + car_Name);
    }

    public String showDetails() {
        return (company_Name + " : " +"\u20B9"+ price + " : " + car_Name);
    }

    /*++++++++++++++++++++ INNER CLASS ++++++++++++++++++++*/
    //creating NON STATIC INNER CLASS
    class SportCars {

        public void sportsCar() {//we can directly access the static ore non-static variable of OUTER CLASS there is no need OBJECT of OUTER CLASS
            car_Name = "BMW M8";
            price = 235000000;
            System.out.println("This is INNER CLASS ");
            System.out.println(company_Name + " : " +"\u20B9"+ price + " : " + car_Name);

            String show = showDetails();
            System.out.println("Detail " + show);
        }
    }

    // creating STATIC INNER CLASS
    static class SuperSportCars {// we can directly access the static variable of OUTER CLASS but for using NON-STATIC  VARIABLE/INSTANCE first we need OBJECT of OUTER CLASS
            Cars carValue = new Cars();
        public void superSportsCar() {
            carValue.car_Name = "Bugatti Chiron";
            carValue.price = 450000000;
            System.out.println("This is STATIC INNER CLASS ");
            System.out.println(company_Name + " : " + "\u20B9" + carValue.price + " : " + carValue.car_Name);

           /****** HOW I CALL THIS ***************/
            String show = carValue.showDetails();
            System.out.println("Detail " + show);
        }
    }
}
public class OOPs_1_3_ConstructorsAndInnerClasses {
    public static void main(String[] args) {

        /**++++++++++++++++++++ Constructor ++++++++++++++++++**/
        Cars carValue = new Cars();//Object for non parameterized Constructor

        Cars carValue2 = new Cars("Lamborghini Revuelto",870000000);//Object for parameterized constructor

        /*++++++++++++++++++++ OUTER CLASS +++++++++++++++++++*/
        Cars.SportCars carValue3 = carValue.new SportCars();//if we want to access NON-STATIC INNER CLASS then we need to use OUTER CLASS as REFERENCE and then for using its METHOD we needs object of OUTER class for creating object of INNER CLASS
        carValue3.sportsCar();

        /*++++++++++++++++++++ INNER CLASS +++++++++++++++++++*/
        Cars.SuperSportCars carValue4 = new Cars.SuperSportCars();//if we want to access STATIC INNER CLASS then we need to use OUTER CLASS as REFERENCE and then for using its METHOD we needs not needs object of OUTER class instead we use OUTER CLASS as REFERENCE for creating object of INNER CALSS
        carValue4.superSportsCar();

        System.out.println("Showing Detail ");
        System.out.println(carValue2.showDetails());
//        System.out.println(show);
        carValue.showDetails();
        carValue2.showDetails();
//        carValue3.showDetail();
//

    }
}
