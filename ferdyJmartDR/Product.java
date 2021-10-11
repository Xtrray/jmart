package ferdyJmartDR;


/**
 * Write a description of class Product here.
 *
 * @Mochamad Ferdy Fauzan
 * @11-10-2021
 */
public class Product extends Recognizable
{
    public int storeId; 
    public String name;
    public int weight;
    public boolean conditionUsed;
    public Treasury priceTag;
    public ProductCategory category;
    public ProductRating rating;
    public Shipment.MultiDuration multiDuration;
    /**
     * Constructor for objects of class Product
     */
     public Product(int storeId, String name, int weight, boolean conditionUsed, Treasury priceTag, ProductCategory category, Shipment.MultiDuration multiDuration)
    {
        this.storeId = storeId;
        this.name = name;
        this.weight = weight;
        this.conditionUsed = conditionUsed;
        this.priceTag = priceTag;
        this.category = category;
        this.rating = new ProductRating();
        this.multiDuration = multiDuration;
    }
    
    public String toString() {
        return 
        "Name: " + this.name +
        "\nconditionUsed: " + this.conditionUsed +
        "\npriceTag: " + this.priceTag +
        "\ncategory: " + this.category +
        "\nrating: " + this.rating +
        "\nstoreId: " + this.storeId;
    }
}
