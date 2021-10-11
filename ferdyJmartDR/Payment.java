package ferdyJmartDR;


/**
 * Write a description of class Payment here.
 *
 * @Mochamad Ferdy Fauzan
 * @11-10-2021
 */
public class Payment extends Invoice
{
    public int productCount;
    public Shipment shipment;

    public Payment(int buyerId, int productId, int productCount, Shipment shipment) {
    	super(buyerId, productId);
    	this.buyerId = buyerId;
        this.productId = productId;
        this.productCount = productCount;
        this.shipment = shipment;
    }
}