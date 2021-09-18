package ferdyJmartDR;


/**
 * Write a description of class PriceTag here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PriceTag
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class PriceTag
     */
    public PriceTag()
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
        // put your code here
    }
    
    final double COMMISSION_MULTIPLIER = 0.05f;
    final double BOTTOM_PRICE = 20000.0f;
    final double BOTTOM_FEE = 1000.0f;
    
    double price;
    double discount;
    
    public PriceTag(double price){
        this.price = price;
        this.discount = 0.0f;
    }
    
    public PriceTag(double price, double discount){
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
