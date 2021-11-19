package com.ferdyJmartDR;


/**
 * Write a description of class Recognizable here.
 *
 * @Mochamad Ferdy Fauzan
 * @06-11-2021
 */
import java.util.HashMap;
import java.util.Map;

public class Serializable implements Comparable<Serializable>
{
    public final int id;
    private static HashMap<Class<?>, Integer> mapCounter = new HashMap<>();

    protected Serializable(){
    	Integer counter = mapCounter.get(getClass());
    	counter = counter == null ? 0: counter+1;
    	mapCounter.put(getClass(), counter);
    	this.id = counter;
    }

    public boolean equals (Object other)
    {
        if(other instanceof Serializable)
        {
            Serializable rec = (Serializable)other;
            if(rec.id == id){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    
    public boolean equals(Serializable other){
        if(this.id == other.id){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static <T extends Serializable> int setClosingId(Class<T> clazz, int id) {
        return mapCounter.getOrDefault(clazz, id);
    }

    public static <T extends Serializable> int getClosingId(Class<T> clazz) {
        return mapCounter.get(clazz);
    }
    
    @Override
    public int compareTo(Serializable other) {
        return Integer.compare(this.id, other.id);
    }
}