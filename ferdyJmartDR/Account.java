package ferdyJmartDR;


/**
 * Write a description of class Account here.
 *
 * @Mochamad Ferdy Fauzan
 * @27-09-2021
 */
public class Account extends Recognizable implements FileParser
{
    // instance variables - replace the example below with your own
    
    public String name;
    public String email;
    public String password;

    public Account(int id, String name, String email, String password)
    {
        super(id);
        this.name = name;
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean read(String content){
        return false;
    }
    
    @Override
    public Object write(){
        return null;
    }
    
    public static Object newInstance(String content){
        return null;
    }
   
    public String toString(){
        return
        "Name : "+this.name+
        "\nemail : "+this.email+
        "\npassword : "+this.password;
    }
}
