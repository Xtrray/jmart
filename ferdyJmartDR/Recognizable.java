package ferdyJmartDR;


/**
 * Write a description of class Recognizable here.
 *
 * @Mochamad Ferdy Fauzan
 * @09-10-2021
 */
public class Recognizable implements Comparable<Recognizable>
{
    public final int id;

    protected Recognizable(int id)
    {
        this.id = id;
    }

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
    
    public static <T extends Recognizable> int setClosingId(Class<T> clazz, int id) {
        return 0;
    }

    public static <T extends Recognizable> int getClosingId(Class<T> clazz) {
        return 0;
    }
    
    @Override
    public int compareTo(Recognizable other) {
        return Integer.compare(this.id, other.id);
    }
}