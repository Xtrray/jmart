package ferdyJmartDR;


/**
 * Write a description of class Recognizable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recognizable
{
    // instance variables - replace the example below with your own
    public final int id;

    /**
     * Constructor for objects of class Recognizable
     */
    protected Recognizable(int id)
    {
        this.id = id;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean equals (Object obj)
    {
        if(obj instanceof Recognizable)
        {
            Recognizable rec = (Recognizable)obj;
            if(rec.id == id){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    
    public boolean equals(Recognizable rec){
        if(this.id == rec.id){
            return true;
        }
        else{
            return false;
        }
    }
}
