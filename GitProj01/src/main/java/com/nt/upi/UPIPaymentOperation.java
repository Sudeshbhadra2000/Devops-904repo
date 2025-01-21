package com.nt.upi;

import java.util.Random;

public class UPIPaymentOperation {

	public String doPayment(String upiId, double amount) {
		return amount+" is transfered to "+upiId;
	}  
	public String addrewards(String txId) {
		return txId+" has got "+new Random().nextInt(3000)+" Reward point have come";
	}
	

}
