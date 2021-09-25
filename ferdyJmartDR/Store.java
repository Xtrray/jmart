package ferdyJmartDR;


/**
 * Write a description of class Store here.
 *
 * @Mochamad Ferdy Fauzan
 * @25-09-2021
 */
public class Store extends Recognizable implements FileParser
{
    // instance variables - replace the example below with your own
    public String name;
    public String address;
    public String phoneNumber;

    /**
     * Constructor for objects of class Store
     */
    public Store(int accountId, String name, String address, String phoneNumber)
    {
        super(accountId);
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Store(Account account, String name, String address, String phoneNumber){
        super(account.id);
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public boolean read(String content){
        return false;
    }
}
