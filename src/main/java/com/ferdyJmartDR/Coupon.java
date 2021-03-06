package com.ferdyJmartDR;

/**
 * @author Mochamad Ferdy Fauzan
 * @version 17-12-2021
 */

import com.ferdyJmartDR.dbjson.Serializable;
public class Coupon extends Serializable
{
    public enum Type{
        DISCOUNT, REBATE
    }
    public final int code;
    public final double cut;
    public final double minimum;
    public final String name;
    public final Type type;
    private boolean used;
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
    public double apply(double price, double discount)
    {
        used = true;
        if(type == Type.DISCOUNT){
            if(cut >= 100){
                return (Treasury.getAdjustedPrice(price, discount) - Treasury.getAdjustedPrice(price, discount) * (100 / 100)); //cut max 100%
            }else if(cut <= 0){
                return (Treasury.getAdjustedPrice(price, discount) - Treasury.getAdjustedPrice(price, discount) * (0 / 100)); //cut min 0%
            }else{
                return (Treasury.getAdjustedPrice(price, discount) - Treasury.getAdjustedPrice(price, discount) * (cut / 100));
            }
        }
        return (Treasury.getAdjustedPrice(price, cut) - cut);
    }
    public boolean canApply(double price, double discount)
    {
        if(Treasury.getAdjustedPrice(price, discount) >= minimum && !used){
            return true;
        }else{
            return false;
        }
    }
    public boolean isUsed()
    {
        return used;
    }

}