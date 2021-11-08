package ferdyJmartDR;


/**
 * Write a description of class Jmart here.
 *
 * @Mochamad Ferdy Fauzan
 * @08-11-2021
 */

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
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
    		String filepath = "C://Java//jmart/city.json";
        	Gson gson = new Gson();
    		BufferedReader br = new BufferedReader(new FileReader(filepath));
    		Country input = gson.fromJson(br, Country.class);
    		System.out.println("name: " + input.name);
    		System.out.println("population: " + input.population);
    		System.out.println("States:");
    		input.listOfStates.forEach(state -> System.out.println(state));
    	}
    	catch(IOException e){
    		e.printStackTrace();
    	}
    	
    	try {
    		List<Product> list = read("C:/Java/jmart/randomProductList.json");
    		List<Product> filterPrice = filterByPrice(list, 20000.0, 25000.0);
            filterPrice.forEach(product -> System.out.println(product.price));
            List<Product> filterName = filterByName(list, "amd", 1, 5);
            filterName.forEach(product -> System.out.println(product.name));
            List<Product> filterAccId = filterByAccountId(list, 10, 0, 5);
            filterAccId.forEach(product -> System.out.println(product.name));
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
        List<Product> product = new ArrayList<>();
        try{
            Gson gson = new Gson();
            JsonReader reader = new JsonReader(new FileReader(filepath));
            reader.beginArray();
            while(reader.hasNext()){
                product.add(gson.fromJson(reader, Product.class));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return product;
    }

    public static List<Product> filterByCategory(List<Product> list, ProductCategory category){
        List<Product> products = new ArrayList<>();
        for(Product product : list){
            if(product.category.equals(category)){
                products.add(product);
            }
        }
        return products;
    }

    public static List<Product> filterByPrice(List<Product> list, double minPrice, double maxPrice){
        List<Product> products = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(minPrice <= 0.0){
                if(list.get(i).price <= maxPrice){
                    products.add(list.get(i));
                }
            }else if(maxPrice <= 0.0){
                if(list.get(i).price >= minPrice){
                    products.add(list.get(i));
                }
            }else{
                if(list.get(i).price >= minPrice && list.get(i).price <= maxPrice){
                    products.add(list.get(i));
                }
            }
        }
        return products;
    }

    public static List<Product> filterByName(List<Product> list, String search, int page, int pageSize) {
        Predicate<Product> predicate = a -> (a.name.toLowerCase().contains(search.toLowerCase()));
        return paginate(list, page, pageSize, predicate);
    }

    public static List<Product> filterByAccountId(List<Product> list, int accountId, int page, int pageSize) {
        Predicate<Product> predicate = a -> (a.accountId == accountId);
        return paginate(list, page, pageSize, predicate);
    }
    
    private static List<Product> paginate(List<Product> list, int page, int pageSize, Predicate<Product> pred) {
    	if(pageSize < 0)
        {
        	System.out.println("Size tidak boleh kurang dari 0!");
        	pageSize = 0;
        }
        if(page < 0) {
        	System.out.println("Page tidak boleh kurang dari 0!");
        	page = 0;
        }
        return list.stream().filter(a -> pred.predicate(a)).skip(page * pageSize).limit(pageSize).collect(Collectors.toList());
    }
    
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
