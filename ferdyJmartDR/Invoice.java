package ferdyJmartDR;


/**
 * Write a description of class Invoice here.
 *
 * @Mochamad Ferdy Fauzan
 * @04-10-2021
 */
import java.util.Date;
import java.util.ArrayList;
public class Invoice extends Recognizable implements FileParser
{
    // instance variables - replace the example below with your own
    public Date date;
    public int buyerId;
    public int productId;
    public int complaintId;
    public Rating rating;
    public Status status;
    ArrayList<Record> history = new ArrayList<>();

    public enum Status{
        WAITING_CONFIRMATION,
        CANCELLED,
        ON_PROGRESS,
        ON_DELIVERY,
        COMPLAINT,
        FINISHED,
        FAILED;
    }
    
    public enum Rating{
        NONE,
        BAD,
        NEUTRAL,
        GOOD;
    }
    /**
     * Constructor for objects of class Invoice
     */
      protected Invoice(int id, int buyerId, int productId)
    {
        super(id);
        this.buyerId = buyerId;
        this.productId = productId;
        this.date = new Date();
        this.rating = Rating.NONE;
        this.status = Status.WAITING_CONFIRMATION;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override
    public boolean read(String content){
        return false;
    }
    
    public double getTotalPay(){
        return 0.0f;
    }
    
    class Record{
        public Status status;
        public Date date;
        public String message;
    }
}
