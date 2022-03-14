package framework1;

public abstract class BankFactory {

	public abstract SavingAcc getNewSavingAccount(int AccNo,String accNm,float accBal,boolean isSalaride);
	public abstract CurrentAcc getNewCurrentAccount(int AccNo,String accNm,float accBal,float creditLimit);
}