package com.nt.nb;

import java.util.List;

public class NetBankingOperations {

	public String doPayment(long cardNo,double amt) {
		return amt + " Payment is done with the card :: "+cardNo;
	}
	public String cashbackOffer(String txId,double amt) {
		return amt*0.5+" amount goes as cashback amount";
	} 
	public List<String> showReport(){
		System.out.println("NetBankingOperations.showReport()");
		return List.of("report1","report2");
	}
}
