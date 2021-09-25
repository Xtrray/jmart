package ferdyJmartDR;


/**
 * Write a description of class Product here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Product extends Recognizable implements FileParser
{
    // instance variables - replace the example below with your own
    private static int idCounter;
    public int id;
    public String name;
    public int weight;
    public boolean conditionUsed;
    public PriceTag priceTag;
    public ProductCategory category;
    public ProductRating rating;
    public int storeId;

    /**
     * Constructor for objects of class Product
     */
    public Product(int id, String name, int weight, boolean conditionUsed, PriceTag pricetag, ProductCategory category, int storeId)
    {
        super(id);
        this.idCounter = idCounter++;
        this.name = name;
        this.weight = weight;
        this.conditionUsed = conditionUsed;
        this.priceTag = priceTag;
        this.category = category;
        this.storeId = storeId;
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
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
}
