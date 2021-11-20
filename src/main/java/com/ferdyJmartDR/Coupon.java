package com.ferdyJmartDR;


import com.ferdyJmartDR.dbjson.Serializable;

/**
 * Write a description of class Coupon here.
 *
 * @Mochamad Ferdy Fauzan
 * @11-10-2021
 */
public class Coupon extends Serializable
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
    public Coupon(String name, int code, Type type, double cut, double minimum)
    {
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
    
    public boolean canApply(Treasury priceTag){
        if(priceTag.getAdjustedPrice() >= minimum & this.used == false){
            return true;
        }
        else{
            return false;
        }
    }
    
    public double apply(Treasury priceTag){
        this.used = true;
        if(this.type == Type.DISCOUNT){
            return priceTag.getAdjustedPrice() * ((100-this.cut)/100);
        }
        return (priceTag.getAdjustedPrice() - this.cut);
    }
    
    public static Object newInstance(String content){
        return null;
    }
}
