package ferdyJmartDR;


/**
 * Abstract class Transaction - write a description of the class here
 *
 * @Mochamad Ferdy Fauzan
 * @27-09-2021
 */
public interface Transactor
{
    // instance variables - replace the example below with your own
    /*
    public String time = "Time";
    public int buyerId;
    public int storeId;
    public Rating rating = Rating.NONE;

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     
    
    public enum Rating{
        NONE,
        BAD,
        NEUTRAL,
        GOOD;
    }
    
    protected Transaction(int id, int buyerId, int storeId){
        super(id);
        this.buyerId = buyerId;
        this.storeId = storeId;
    }
    
    protected Transaction(int id, Account buyer, Store store){
        super(id);
        this.buyerId = buyer.id;
        this.storeId = store.id;
    }
    */
    public default boolean validate(){
        return false;
    }
    
    public default Invoice perform(){
        return null;
    }
}
