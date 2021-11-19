package com.ferdyJmartDR;


/**
 * Write a description of class Invoice here.
 *
 * @Mochamad Ferdy Fauzan
 * @15-11-2021
 */
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
public class Invoice extends Serializable
{
    public int buyerId;
    public int complaintId;
    public Date date;
    public int productId;
    public Rating rating;
    public Status status;
    
    public enum Status {
        CANCELLED,
        COMPLAINT,
        DELIVERED,
        FAILED,
        FINISHED,
        ON_DELIVERY,
        ON_PROGRESS,
        WAITING_CONFIRMATION
    }
    
    public enum Rating {
        BAD,
        GOOD,
        NEUTRAL,
        NONE
    }
    protected Invoice(int buyerId, int productId)
    {
        this.buyerId = buyerId;
        this.productId = productId;
        this.date = new Date();
        this.rating = Rating.NONE;
        this.status = Status.WAITING_CONFIRMATION;
        this.complaintId = -1;
    }

    public double getTotalPay(Product product) {
        return product.price;
    }
}