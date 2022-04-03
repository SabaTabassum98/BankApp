package application1;

import framework1.BankFactory;
import framework1.CurrentAcc; // imported these 2
import framework1.SavingAcc; //

public class MMBankFactory extends BankFactory {
	public SavingAcc getNewSavingAccount(int AccNo,String accNm,float accBal, boolean	isSalaried) {
		return null;
	}
	
	public CurrentAcc getNewCurrentAccount(int AccNo,String accNm,float accBal,float creditLimit) {
		return null;
	}
	
}
