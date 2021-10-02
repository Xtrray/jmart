package ferdyJmartDR;


/**
 * Write a description of class Complaint here.
 *
 * @Mochamad Ferdy Fauzan
 * @02-10-2021
 */
import java.util.Date;

public class Complaint extends Recognizable implements FileParser
{
    public Date date;
    public String desc;

    public Complaint(int id, String desc) {
        super(id);
        this.desc = desc;
        this.date = new Date();
    }

    @Override
    public boolean read(String content){
        return false;
    }

    /*
    public Complaint(int id, int buyerId, int storeId, int paymentId, String desc){
        super(id);
        this.paymentId = paymentId;
        this.desc = desc;
    }
    
    public boolean validate(){
        return false;
    }
    
    public Transaction perform(){
        return null;
    }
    */

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
}
