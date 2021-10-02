package ferdyJmartDR;


/**
 * Write a description of class Filter here.
 *
 * @Mochamad Ferdy Fauzan
 * @02-10-2021
 */
import java.util.ArrayList;
public class Filter
{   
    public static ArrayList<PriceTag> filterPriceTag(PriceTag[] list, double value, boolean less) {
        ArrayList<PriceTag> priceTags = new ArrayList<>();
        for (PriceTag filterPrice : list) {
            if (less && filterPrice.getAdjustedPrice() < value || !less && filterPrice.getAdjustedPrice() >= value)
                priceTags.add(filterPrice);
        }
        return priceTags;
    }

    public static void filterProductRating(ArrayList<ProductRating > list, double value, boolean less){
        for(int i = 0; i < list.size(); ++i){
            final ProductRating filterRating = list.get(i);
            if(less && filterRating.getAverage() < value || !less && filterRating.getAverage() >= value){
                list.remove(i);
            }
        }
    }
}
