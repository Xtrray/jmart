package ferdyJmartDR;


/**
 * Write a description of interface FileParser here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface FileParser
{
    /**
     * An example of a method header - replace this comment with your own
     *
     * @param  y a sample parameter for a method
     * @return   the result produced by sampleMethod
     */
    public boolean read(String content);
    
    public default Object write(){
        return null;
    }
    
    public static Object newInstance(String content){
        return null;
    }
}
