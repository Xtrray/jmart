package ferdyJmartDR;

/**
 * Write a description of class Jmart here.
 *
 * @Mochamad Ferdy Fauzan
 * @13-11-2021
 */

public class PhoneTopUp extends Invoice{
	public String phoneNumber;
	public Status status;
	
	public PhoneTopUp(int buyerId, int productId, String PhoneNumber) {
		super(buyerId, productId);
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public double getTotalPay() {
		return 0;
	}
}
