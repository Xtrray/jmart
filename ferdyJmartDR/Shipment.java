package ferdyJmartDR;


/**
 * Write a description of class Shipment here.
 *
 * @Mochamad Ferdy Fauzan
 * @02-10-2021
 */
import java.util.Calendar;
import java.util.Date;
import java.text.*;
public class Shipment
{
    // instance variables - replace the example below with your own
    public String address;
    public int shipmentCost;
    public Duration duration;
    public String receipt;

    public Shipment(String address, int shipment)
    {
       
    }

    public static class Duration
    {
    public static final SimpleDateFormat ESTIMATION_FORMAT = new SimpleDateFormat("Thu October 07 2021");
    public static final Duration INSTANT = new Duration((byte)(1 << 0));
    public static final Duration SAME_DAY = new Duration((byte)(1 << 1));
    public static final Duration NEXT_DAY = new Duration((byte)(1 << 2));
    public static final Duration REGULER = new Duration((byte)(1 << 3));
    public static final Duration KARGO = new Duration((byte)(1 << 4));
    private byte bit;
    
    private Duration(byte bit){
            this.bit = bit;
        }
    public String getEstimatedArrival(Date reference){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(reference);
        if(bit == Duration.NEXT_DAY.bit){
            calendar.add(Calendar.DATE, 1);
        }
        if(bit == Duration.REGULER.bit){
            calendar.add(Calendar.DATE, 2);
        }
        if(bit == Duration.KARGO.bit){
            calendar.add(Calendar.DATE, 5);
        }
        return ESTIMATION_FORMAT.format(calendar.getTime());
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
