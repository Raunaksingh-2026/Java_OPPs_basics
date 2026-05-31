package pkg2;

/*
    * Class        -> Blueprint
    * Object       -> Real instance of Class
    * Encapsulation -> Hide data using private variables and provide controlled access using getters and setters.
        private -> Hide Data
        getter  -> Read Data
        setter  -> Modify Data
*/

/*
    Encapsulation -> means wrapping
    data and methods together
    in a single unit (Class).
        ✔ Data Hiding
        ✔ Private Variables
        ✔ Getter Methods
        ✔ Setter Methods
        ✔ Controlled Access
*/
class EncapsulatedCar {

    static String companyName; // STATIC VARIABLE -> Belongs to CLASS, not OBJECT. -> Shared among all objects.
    int price ; // INSTANCE VARIABLES -> Every object gets its own copy. -> Stored inside object memory.
    String carName;
    private String ownerOfCompany; // PRIVATE VARIABLE -> Can only be accessed directly inside the same class. -> This is the main idea behind Encapsulation (Data Hiding). And not access by other CLASS directly | Access is controlled through -> Getter and Setter methods.
    private int ageOfOwnerOfCompany;

/*
    * SETTER METHOD -> Used to modify/update private variable value.
    *   Benefit -> Validation can be applied before storing data.
 */
    public void setOwnerOfCompany(String ownerName) {
        this.ownerOfCompany = ownerName;
    }

/*
    * GETTER METHOD -> Used to read/access private variable value.
    * Provides controlled access to hidden data.
*/
    public String getOwnerOfCompany() {
        return ownerOfCompany;
    }

    public void setAgeOfOwnerOfCompany(int ownerAge) {
        this.ageOfOwnerOfCompany = ownerAge;
    }

    public int getAgeOfOwnerOfCompany() {
        return ageOfOwnerOfCompany;
    }

    public void showDetail() {
        System.out.println(companyName + " : " +"\u20B9"+ price + " : " + carName);
        System.out.println("OWNER NAME : " + ownerOfCompany + " | AGE OF OWNWR : " + ageOfOwnerOfCompany);
        System.out.println("OWNER NAME : " + getOwnerOfCompany() + " | AGE OF OWNWR : " + getAgeOfOwnerOfCompany());

    }
}
public class OOPs_3_1_Encapsulation {
    public static void main(String[] args) {

//        OBJECT CREATION -> Object is a real-world entity -> created from a Class blueprint.
        EncapsulatedCar carDetails = new EncapsulatedCar();
        // Set values here
        EncapsulatedCar.companyName = "BMW";   // static variable -> Use class name because companyName is static (belongs to class, not object).
        carDetails.price = 5000000;       // instance variable
        carDetails.carName = "X5";       // instance variable

//        Accessing private data through -> Setter Methods instead of direct variable access.
        carDetails.setOwnerOfCompany("MR. RAUNAK SINGH");// we can set the VALUE of PRIVATE VARIABLE
        carDetails.setAgeOfOwnerOfCompany(20);

//        System.out.println(carDetails.ownerOfCompany); // can't be use directly because of SCOPE which is set to be PRIVATE

//         Reading private data through -> Getter Methods. -> Direct access is not allowed.
        System.out.println(carDetails.getOwnerOfCompany() + " : " + carDetails.getAgeOfOwnerOfCompany()); // can be use this METHOD only because of SCOPE of that VARIABLE is set to be PRIVATE
        carDetails.showDetail();
    }
}
