package ferdyJmartDR;


/**
 * Write a description of class Product here.
 *
 * @Mochamad Ferdy Fauzan
 * @27-09-2021
 */
public class Product extends Recognizable implements FileParser
{
    // instance variables - replace the example below with your own
    public int storeId; 
    public String name;
    public int weight;
    public boolean conditionUsed;
    public PriceTag priceTag;
    public ProductCategory category;
    public ProductRating rating;
    public Shipment.MultiDuration multiDuration;
    /**
     * Constructor for objects of class Product
     */
     public Product(int id, int storeId, String name, int weight, boolean conditionUsed, PriceTag priceTag, ProductCategory category, Shipment.MultiDuration multiDuration)
    {
        super(id);
        this.storeId = storeId;
        this.name = name;
        this.weight = weight;
        this.conditionUsed = conditionUsed;
        this.priceTag = priceTag;
        this.category = category;
        this.rating = new ProductRating();
        this.multiDuration = multiDuration;
    }
    
    @Override
    public boolean read(String content){
        return false;
    }
    
    public String toString() {
        return 
        "Name: " + this.name +
        "\nWeight: " + this.weight +
        "\nconditionUsed: " + this.conditionUsed +
        "\npriceTag: " + this.priceTag +
        "\ncategory: " + this.category +
        "\nrating: " + this.rating +
        "\nstoreId: " + this.storeId;
    }
    /*
    @Override
    public Object write(){
        return null;
    }
    
    public static Object newInstance(String content){
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
