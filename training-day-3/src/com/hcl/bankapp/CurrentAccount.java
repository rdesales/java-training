package com.hcl.bankapp;

public class CurrentAccount extends Account {
	
	private static double minimumBalance;
	
	static {
		minimumBalance = 200;
	}
	
	/**
	 * Constuctor
	 * @param id ID of the owner of the account
	 * @param client Owner of the account
	 * @param amount value of the account
	 */
	public CurrentAccount(String id, Client client, double amount){
		super(id, client, amount);
	}
	
	/**
	 * Returns the minimum balance of the account
	 * @return
	 */
	public double getMinimumBalance() {
		return minimumBalance;
	}

	@Override
	public String toString() {
		String out = "";
		out += "Current account (with a minimum balance of $"+minimumBalance+")";
		out += super.toString();
		return out;
		
	}
}
