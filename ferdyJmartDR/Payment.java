package ferdyJmartDR;


/**
 * Write a description of class Payment here.
 *
 * @Mochamad Ferdy Fauzan
 * @27-09-2021
 */
public class Payment extends Invoice implements Transactor
{
    public int productCount;
    public Shipment shipment;

    public Payment(int id, int buyerId, int productId, int productCount, Shipment shipment) {
        super(id, buyerId, productId);
        this.buyerId = buyerId;
        this.productId = productId;
        this.productCount = productCount;
        this.shipment = shipment;
    }
    /*
    public Payment(int id, int buyerId, int storeId, int productId, ShipmentDuration shipmentDuration) {
        super(id);
        this.productId = productId;
        this.shipmentDuration = shipmentDuration;
    }
    */
    public boolean validate() {
        return false;
    }

    public Invoice perform() {
        return null;
    }
    
    public double getTotalPay(){
        return 0.0f;
    }
    
    @Override
    public boolean read(String content){
        return false;
    }
    /*
    @Override
    public boolean read(String content){
        return false;
    }
    */
}
