package ferdyJmartDR;


/**
 * Write a description of class Complaint here.
 *
 * @Mochamad Ferdy Fauzan
 * @11-10-2021
 */
import java.util.Date;
import java.text.*;
public class Complaint extends Serializable
{
    public Date date;
    public String desc;
    SimpleDateFormat SDFormat = new SimpleDateFormat("MM/dd/yyyy");

    public Complaint(String desc) {
        this.desc = desc;
        this.date = new Date();
    }
    
    public String toString(){
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatDate.format(this.date);
        return "Complaint{date=" + formattedDate + ", desc='" +this.desc+ "'}";
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
