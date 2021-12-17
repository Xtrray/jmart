package com.ferdyJmartDR;

/**
 * @author Mochamad Ferdy Fauzan
 * @version 17-12-2021
 */

public class PhoneTopUp extends Invoice {
    public String phoneNumber;
    public Status status;

    protected PhoneTopUp(int buyerId, int productId, String phoneNumber) {
        super(buyerId, productId);
        this.phoneNumber = phoneNumber;
    }
    @Override
    public double getTotalPay(Product product) {
        return product.price;
    }
}