package com.ferdyJmartDR;

/**
 * Write a description of class Jmart here.
 *
 * @Mochamad Ferdy Fauzan
 * @11-10-2021
 */

import java.util.Calendar;
import java.util.Date;
import java.text.*;
public class Shipment
{
    public String address;
    public int cost;
    public byte plan;
    public String receipt;
    public static final SimpleDateFormat ESTIMATION_FORMAT = new SimpleDateFormat("EEE MM dd yyyy");
    public static final Plan INSTANT = new Plan((byte)(1 << 0));
    public static final Plan SAME_DAY = new Plan((byte)(1 << 1));
    public static final Plan NEXT_DAY = new Plan((byte)(1 << 2));
    public static final Plan REGULER = new Plan((byte)(1 << 3));
    public static final Plan KARGO = new Plan((byte)(1 << 4));
    
    public Shipment(String address, int cost, byte plan, String receipt)
    {
       this.address = address;
       this.cost = cost;
       this.plan = plan;
       this.receipt = receipt;
    }
    
    public String getEstimatedArrival(Date reference){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(reference);
        if(Plan.bit == NEXT_DAY.bit){
            calendar.add(Calendar.DATE, 1);
        }
        if(Plan.bit == REGULER.bit){
            calendar.add(Calendar.DATE, 2);
        }
        if(Plan.bit == KARGO.bit){
            calendar.add(Calendar.DATE, 5);
        }
        return ESTIMATION_FORMAT.format(calendar.getTime());
    }
    
    public boolean isDuration(Plan reference){
        return (Plan.bit & reference.bit) != 0;
    }
    
    public static boolean isDuration(byte object, Plan reference) {
    	return (object & Plan.bit) != 0;
    }

    public static class Plan
    {
    	public static final byte bit = 0;
    	
    	private Plan(byte bit, Shipment... args) {
    		byte flags = 0;
            for (Shipment arg : args) { flags |= arg.plan; }
            bit = flags;
    	}
    }
}
