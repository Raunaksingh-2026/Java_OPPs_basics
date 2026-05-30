package pkg2;

class CrazyCars {

    static String company_Name;
    int price ;
    String car_Name;
    private String ownerOfCompany;//this can only be access by any METHOD form SAME CLASS | not access by other CLASS directly
    private int ageOfOwnerOfCompany;

    public void setOwnerOfCompany(String ownerName) {//this can be called as SETTER METHOD
        this.ownerOfCompany = ownerName;
    }

    public String getOwnerOfCompany() {//this can be called as GETTERS METHOD
        return ownerOfCompany;
    }

    public void setAgeOfOwnerOfCompany(int ownerAge) {
        this.ageOfOwnerOfCompany = ownerAge;
    }

    public int getAgeOfOwnerOfCompany() {
        return ageOfOwnerOfCompany;
    }

    public void showDetail() {
        System.out.println(company_Name + " : " +"\u20B9"+ price + " : " + car_Name);
        System.out.println("OWNER NAME : " + ownerOfCompany + " | AGE OF OWNWR : " + ageOfOwnerOfCompany);
        System.out.println("OWNER NAME : " + getOwnerOfCompany() + " | AGE OF OWNWR : " + getAgeOfOwnerOfCompany());

    }
}
public class OOPs_3_1_Encapsulation {
    public static void main(String[] args) {

        CrazyCars carDetails = new CrazyCars();
        // Set values here
        CrazyCars.company_Name = "BMW";   // static variable // Use class name because company_Name is static (belongs to class, not object).
        carDetails.price = 5000000;       // instance variable
        carDetails.car_Name = "X5";       // instance variable

        carDetails.setOwnerOfCompany("MR. RAUNAK SINGH");//we can set the VALUE of PRIVATE VARIABLE
        carDetails.setAgeOfOwnerOfCompany(20);

        //System.out.println(carDetails.ownerOfCompany); //can't be use directly because of SCOPE which is set to be PRIVATE
        System.out.println(carDetails.getOwnerOfCompany() + " : " + carDetails.getAgeOfOwnerOfCompany());//can be use this METHOD only because of SCOPE of that VARIABLE is set to be PRIVATE
        carDetails.showDetail();
    }
}
