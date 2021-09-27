package ferdyJmartDR;


/**
 * Write a description of class Complaint here.
 *
 * @Mochamad Ferdy Fauzan
 * @27-09-2021
 */
public class Complaint extends Recognizable implements FileParser
{
    public String date;
    public String desc;

    public Complaint(int id, String desc) {
        super(id);
        this.desc = desc;
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
