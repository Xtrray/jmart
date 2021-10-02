package ferdyJmartDR;


/**
 * Write a description of class Jmart here.
 *
 * @Mochamad Ferdy Fauzan
 * @02-10-2021
 */
public class Jmart
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Jmart
     */
    public void Jmart()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args)
    {
        Store store = new Store(24, "Toko Game Gasix", "Rawa Belong", "0123456789");
        store.validate();
    }
    /*
    public static int getPromo(){
        return 0;
    }
    
    public static String getCustomer(){
        return "oop";
    }
    
    public static float getDiscountPercentage(int before, int after){
        if(before < after){
            return 0.0f;
        }
        else{
            return ((before-after)/100);
        }
    }
    
    public static int getDiscountedPrice(int price, float discountPercentage){
        if(discountPercentage > 100.0f){
            discountPercentage = 100.0f;
        }
        return (int) (price * (100.0f - discountPercentage) / 100.0f);
    }
    
    public static int getOriginalPrice(int discountedPrice, float discountPercentage){
        return (int)(discountedPrice/((100.0f-discountPercentage)/100));
    }
    
    public float getCommissionMultiplier(){
        return 0.05f;
    }
    
    public int getAdjustedPrice(int price){
        return price + ((int)(price * getCommissionMultiplier()));
    }
    
    public int getAdminFee(int price){
        return (int)(price*getCommissionMultiplier());
    }
    */
    public static Product create(){
        return null;
    }
    
    public static Product createProduct(){
        return null;
    }
    
    public static Coupon createCoupon(){
        return null;
    }
    
    public static Shipment createShipment(){
        return null;
    }
}
