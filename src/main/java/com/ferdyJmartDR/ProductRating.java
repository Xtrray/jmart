package com.ferdyJmartDR;

/**
 * @author Mochamad Ferdy Fauzan
 * @version 17-12-2021
 */

public class ProductRating
{
    private long total;
    private long count;

    /**
     * Constructor for objects of class ProductRating
     */
    public ProductRating()
    {
        this.total = 0;
        this.count = 0;
    }

    public void insert(int rating){
        total += rating;
        count++;
    }
    
    public double getAverage(){
        if(count > 0){
            return total/count;
        }
        else{
            return 0;
        }
    }
    
    public long getCount(){
        return count;
    }
    
    public long getTotal(){
        return total;
    }
}
