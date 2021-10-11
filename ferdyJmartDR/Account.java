package ferdyJmartDR;


/**
 * Write a description of class Account here.
 *
 * @Mochamad Ferdy Fauzan
 * @11-10-2021
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Account extends Recognizable
{

    public String name;
    public String email;
    public String password;
    public static final String REGEX_EMAIL = "^(?!\\.)(?!.*?\\.\\.)[a-zA-Z0-9&_*~.]+@(?!\\-)[a-zA-Z0-9-]+.(?!.*\\.$)[a-zA-Z0-9.]+$";
    public static final String REGEX_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d](\\S){8,}$";
    public Store store;
    
    public Account(String name, String email, String password)
    {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    public static Object newInstance(String content){
        return null;
    }
   
    public boolean validate(){
        Pattern patternEmail = Pattern.compile(REGEX_EMAIL);
        Matcher matcherEmail = patternEmail.matcher(email);
        Pattern patternPassword = Pattern.compile(REGEX_PASSWORD);
        Matcher matcherPassword = patternPassword.matcher(password);
        
         if (matcherEmail.find() == true && matcherPassword.find()==true){
            return true;
        }
        else {
            return false;
        }
    }
}
