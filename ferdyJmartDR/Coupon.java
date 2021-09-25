package ferdyJmartDR;


/**
 * Write a description of class Coupon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Coupon extends Recognizable implements FileParser
{
    public String name;
    public int code;
    public double cut;
    public Type type;
    public double minimum;
    private boolean used;
    
    public enum Type
    {
        DISCOUNT,
        REBATE;
    }
    /**
     * Constructor for objects of class Coupon
     */
    public Coupon(int id, String name, int code, Type type, double cut, double minimum)
    {
        super(id);
        this.name = name;
        this.code = code;
        this.type = type;
        this.cut = cut;
        this.minimum = minimum;
        this.used = false;
    }
    
    public boolean isUsed(){
        return this.used;
    }
    
    public boolean canApply(PriceTag priceTag){
        if(priceTag.getAdjustedPrice() >= minimum & this.used == false){
            return true;
        }
        else{
            return false;
        }
    }
    
    public double apply(PriceTag priceTag){
        this.used = true;
        if(this.type == Type.DISCOUNT){
            return priceTag.getAdjustedPrice() * ((100-this.cut)/100);
        }
        return (priceTag.getAdjustedPrice() - this.cut);
    }
    
    @Override
    public boolean read(String content){
        return false;
    }
    
    @Override
    public Object write(){
        return null;
    }
    
    public static Object newInstance(String content){
        return null;
    }
}
