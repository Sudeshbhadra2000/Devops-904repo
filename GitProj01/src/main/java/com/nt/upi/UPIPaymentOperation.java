package com.nt.upi;

public class UPIPaymentOperation {

	public String doPayment(String upiId, double amount) {
		return amount+" is transfered to "+upiId;
	}
}
