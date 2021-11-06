package ferdyJmartDR;


/**
 * Write a description of class Jmart here.
 *
 * @Mochamad Ferdy Fauzan
 * @06-11-2021
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.google.gson.*;
import com.google.gson.stream.JsonReader;

public class Jmart
{
    public void Jmart()
    {
        
    }
    
    class Country{
    	public String name;
    	public int population;
    	public List<String> listOfStates;
    }
    
    public static void main(String[] args)
    {
    	try {
    		List<Product> list = read("C:/Java/jmart/randomProductList.json");
    		List<Product> filtered = filterByPrice(list, 20000.0, 25000.0);
            filtered.forEach(product -> System.out.println(product.price));
        }
    	catch (Throwable t){
            t.printStackTrace();
        }
    	
    	System.out.println("account id:" + new Account(null, null, null, -1).id);
    	System.out.println("account id:" + new Account(null, null, null, -1).id);
    	System.out.println("account id:" + new Account(null, null, null, -1).id);
    	
    	System.out.println("payment id:" + new Payment(-1, -1, -1, null).id);
    	System.out.println("payment id:" + new Payment(-1, -1, -1, null).id);
    	System.out.println("payment id:" + new Payment(-1, -1, -1, null).id);
    }
    
    public static List<Product> read(String filepath) throws FileNotFoundException {
        List<Product> products = new ArrayList<>();
        try{
            Gson gson = new Gson();
            JsonReader reader = new JsonReader(new FileReader(filepath));
            reader.beginArray();
            while(reader.hasNext()){
                products.add(gson.fromJson(reader, Product.class));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return products;
    }
    
    public static List<Product> filterByPrice(List<Product> list, double minPrice, double maxPrice){
    	return list;
    }
    
    public static List<Product> filterByCategory(List<Product> list, ProductCategory category){
    	return list;
    }
    /*
    public static int getPromo(){
        return 0;
    }
    
    public static String getCustomer(){
        return "oop";
    }
    
    public static float getDiscountPercentage(int before, int after){
        if(before < after){
            return 0.0f;
        }
        else{
            return ((before-after)/100);
        }
    }
    
    public static int getDiscountedPrice(int price, float discountPercentage){
        if(discountPercentage > 100.0f){
            discountPercentage = 100.0f;
        }
        return (int) (price * (100.0f - discountPercentage) / 100.0f);
    }
    
    public static int getOriginalPrice(int discountedPrice, float discountPercentage){
        return (int)(discountedPrice/((100.0f-discountPercentage)/100));
    }
    
    public float getCommissionMultiplier(){
        return 0.05f;
    }
    
    public int getAdjustedPrice(int price){
        return price + ((int)(price * getCommissionMultiplier()));
    }
    
    public int getAdminFee(int price){
        return (int)(price*getCommissionMultiplier());
    }
    */
    public static Product create(){
        return null;
    }
    
    public static Product createProduct(){
        return null;
    }
    
    public static Coupon createCoupon(){
        return null;
    }
    
    public static Shipment createShipment(){
        return null;
    }
}
