package com.nt.ob;

import java.util.Random;

public class OnlineBanking {

	public String checkBalance() {
		return new Random().nextInt(100000000)+"";
	}
}
