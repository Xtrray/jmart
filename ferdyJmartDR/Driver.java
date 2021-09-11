package ferdyJmartDR;


/**
 * Write a description of class Driver here.
 *
 * @Xtrray (Mochamad Ferdy Fauzan - 1906381741)
 * @version (11-09-2021)
 */
public class Driver
{
    public void main (String args[]){
        getPromo();
    }
    
    public int getPromo(){
        return 0;
    }
    
    public String getCustomer(){
        return "oop";
    }
    
    public float getDiscountPercentage(int before, int after){
        if(before < after){
            return 0.0f;
        }
        else{
            return (((before-after)/before)*100);
        }
    }
    
    public int getDiscountedPrice(int price, float discountPercentage){
        if(discountPercentage > 100.0f){
            return 0;
        }
        else{
            return price - (price * (int)discountPercentage/100);
        }
    }
    
    public int getOriginalPrice(int discountedPrice, float discountPercentage){
        return discountedPrice + (discountedPrice * (int)discountPercentage/100);
    }
    
    public float getCommissionMultiplier(){
        return 0.05f;
    }
    
    public int getAdjustedPrice(int price){
        return price + (price * 5/100);
    }
    
    public int getAdminFee(int price){
        return price*5/100;
    }
}
