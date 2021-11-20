package com.ferdyJmartDR;


import com.ferdyJmartDR.dbjson.Serializable;

/**
 * Write a description of class Product here.
 *
 * @Mochamad Ferdy Fauzan
 * @11-10-2021
 */
public class Product extends Serializable
{
    public int accountId; 
    public String name;
    public int weight;
    public boolean conditionUsed;
    public double discount;
    public double price;
    public byte shipmentPlans;
    public ProductCategory category;
    /**
     * Constructor for objects of class Product
     */
     public Product(int accountId, String name, int weight, boolean conditionUsed, double price, double discount, ProductCategory category, byte shipmentPlans)
    {
        this.accountId = accountId;
        this.name = name;
        this.weight = weight;
        this.conditionUsed = conditionUsed;
        this.price = price;
        this.category = category;
        this.discount = discount;
        this.shipmentPlans = shipmentPlans;
    }
    
    public String toString() {
        return 
        "accountId: " + this.accountId +
        "\nName: " + this.name +
        "\nweight: " + this.weight +
        "\nconditionUsed: " + this.conditionUsed +
        "\nprice: " + this.price +
        "\ndiscount: " + this.discount +
        "\ncategory: " + this.category +
        "\nshipmentPlans: " + this.shipmentPlans;
    }
}
