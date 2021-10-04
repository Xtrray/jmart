package ferdyJmartDR;


/**
 * Write a description of class Complaint here.
 *
 * @Mochamad Ferdy Fauzan
 * @04-10-2021
 */
import java.util.Date;
import java.text.*;
public class Complaint extends Recognizable implements FileParser
{
    public Date date;
    public String desc;
    SimpleDateFormat SDFormat = new SimpleDateFormat("MM/dd/yyyy");

    public Complaint(int id, String desc) {
        super(id);
        this.desc = desc;
        this.date = new Date();
    }

    @Override
    public boolean read(String content){
        return false;
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
