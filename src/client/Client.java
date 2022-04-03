package client;

import application1.MMBankFactory;
import application1.MMCurrentAcc;
import application1.MMSavingAcc;
import framework1.BankFactory;
import framework1.CurrentAcc;
import framework1.SavingAcc;

public class Client {

	public static void main(String[] args) {
	BankFactory bf = new MMBankFactory();
	SavingAcc sa = new MMSavingAcc(21, "saba", 1000, true);
	CurrentAcc ca = new MMCurrentAcc(22,"noora",2000,25000);
	
	sa.deposit(2000);
	ca.withdraw(18000);
	ca.deposit(50000);
	//System.out.println(ca.toString());
	
	
	
	}

}