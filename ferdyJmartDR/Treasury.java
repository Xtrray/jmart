package ferdyJmartDR;


/**
 * Write a description of class Jmart here.
 *
 * @Mochamad Ferdy Fauzan
 * @11-10-2021
 */
public class Treasury
{    
    public final double COMMISSION_MULTIPLIER = 0.05f;
    public final double BOTTOM_PRICE = 20000.0f;
    public final double BOTTOM_FEE = 1000.0f;
    
    double price;
    double discount;
    
    public Treasury(double price){
        this.price = price;
        this.discount = 0.0f;
    }
    
    public Treasury(double price, double discount){
        this.price = price;
        this.discount = discount;
    }
    
    public double getAdjustedPrice(){
       return (double) getDiscountedPrice()+getAdminFee();
    }
    
    public double getAdminFee(){
        if(getDiscountedPrice() < BOTTOM_PRICE){
            return (double) BOTTOM_FEE;
        }
        else{
            return (double) getDiscountedPrice() - COMMISSION_MULTIPLIER;
        }
    }
    
    private double getDiscountedPrice(){
        if(this.discount >= 100){
            return 0.0;
        }
        else{
            return(this.price - (this.price * (this.discount / 100.0f)));
        }
    }
}
