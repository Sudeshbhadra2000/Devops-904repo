package com.nt.nb;

public class NetBankingOperations {

	public String doPayment(long cardNo,double amt) {
		return amt + " Payment is done with the card :: "+cardNo;
	}
}
