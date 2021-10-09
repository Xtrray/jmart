package ferdyJmartDR;


/**
 * Write a description of class Jmart here.
 *
 * @Mochamad Ferdy Fauzan
 * @09-10-2021
 */
public class Jmart
{
    public void Jmart()
    {
        
    }

    public static void main(String[] args)
    {
    	Store store = new Store(24, "Toko Game Gasix", "Rawa Belong", "0123456789");
        store.validate();
        Complaint komplen = new Complaint(2, "Dibawa kabur oleh kurir");
        Account account = new Account(42, "Kim Fei Hu", "kim.feihu09@gmail.com", "kimC1an5uprem4cy");
        account.validate();
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
