package ferdyJmartDR;


/**
 * Write a description of class Shipment here.
 *
 * @Mochamad Ferdy Fauzan
 * @27-09-2021
 */
public class Shipment
{
    // instance variables - replace the example below with your own
    public String address;
    public int shipmentCost;
    public Duration duration;
    public String receipt;

    /**
     * Constructor for objects of class Shipment
     */
    public Shipment(String address, int shipment)
    {
       
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static class Duration
    {
    public static final Duration INSTANT = new Duration((byte)(1 << 0));
    public static final Duration SAME_DAY = new Duration((byte)(1 << 1));
    public static final Duration NEXT_DAY = new Duration((byte)(1 << 2));
    public static final Duration REGULER = new Duration((byte)(1 << 3));
    public static final Duration KARGO = new Duration((byte)(1 << 4));
    private byte bit;
    
    private Duration(byte bit){
            this.bit = bit;
        }
    }
    public class MultiDuration{
        public byte bit;
        public MultiDuration(Duration... args)
        {
            byte flags = 0;
            for (Duration arg : args) { flags |= arg.bit; }
            bit = flags;
        }
        public boolean isDuration(Duration reference){
            return (bit & reference.bit) != 0;
        }
    }
}
