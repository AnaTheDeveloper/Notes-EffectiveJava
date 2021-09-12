public class SweetShopModel {

    //Instance Variables

    String sweetType = "";
    double sweetPrice = 0.00;
    int sweetAmount = 0;

    //Constructor

    private SweetShopModel(String sweetType, double sweetPrice, int sweetAmount) {
        this.sweetType = sweetType;
        this.sweetPrice = sweetPrice;
        this.sweetAmount = sweetAmount;
    }


    @Override
    public String toString() {
        return "SweetShopModel{" +
                "sweetType='" + sweetType + '\'' +
                ", sweetPrice=" + sweetPrice +
                ", sweetAmount=" + sweetAmount +
                '}';
    }


    //Static Factory Methods

    public static String bonBons(int sweetAmount){

        SweetShopModel bonBons = new SweetShopModel("Bonbons", 0.10, sweetAmount);
        double priceOfBonBons = sweetAmount * 0.10;
        return "You got " + sweetAmount + " Bonbons for £" + priceOfBonBons;

    }

    public static String haribo(int sweetAmount){

        SweetShopModel haribo = new SweetShopModel("Haribo", 1.25, sweetAmount);
        double priceOfHaribo = sweetAmount * 1.25;
        return "You got " + sweetAmount + " Haribo for £" + priceOfHaribo;
    }

    public static String FizzyBlueBottles(int sweetAmount){

        SweetShopModel fizzyBlueBottles = new SweetShopModel("Fizzy Blue Bottles", 0.30, sweetAmount);
        double priceOfFizzyBlueBottles = sweetAmount * 0.30;
        return "You got " + sweetAmount + " Fizzy blue bottles for £" + priceOfFizzyBlueBottles;
    }

    /*
    The Advantages of Static Factory Methods over Constructors:

    1. Constructors don't have meaningful names. They have the same name as the class.
    2. Static factory methods can have names that explicitly convey what they'll do.
    3. Static factory methods can return the same type that implements the method(s),a subtype,
       and also primitives. They offer a more flexible range of returning types.
    4. They can also encapsulate all the logic required for pre-constructing fully initialized instances.
    5. Static factory methods can also be controlled-instanced methods.

     */


}
