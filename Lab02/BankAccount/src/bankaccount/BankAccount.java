package bankaccount;

public class BankAccount {

	String name; // 이름
	int account; // 계좌 번호
	long Balance; // 잔액
	double rate; // 이자율
	
	public String getName() {return name;}
	public long getBalance() {return Balance;}
	public double getRate() {return rate;}
	
	public void setName(String name) {this.name = name;}
	public void setBalance(long Balance) {this.Balance = Balance;}
	public void setRate(double rate) {this.rate = rate;}

	public BankAccount (String name, long Balance, double rate) {
		this.name = name;
		this.Balance = Balance;
		this.rate = rate;
	}	// 생성자 생성

	public boolean deposit(long money) {
		Balance = Balance + money;
		return true;
	} // 입금 
	public boolean withdraw(long money) {
		if (Balance >= money) {
			Balance = Balance - money;
			return true;}
		else {return false;}
	} // 출금. 잔액이상 금액 출금시 출금 불가능
	
	public boolean installmentSavingPredict(int month, long money){
		Balance = (int) (Balance + (money * rate/12 * (month * (month + 1)/2) + money * month));
		return true;
	} // 적금 
	
	public boolean fixedDepositPredict(int month, long money){
		Balance = (long) (money + (money * (Math.pow(1 + (rate/12), month)-1)));
		//Balance = (long) (money * (((1+(rate/12))*month * month)-1));
		return true;
	} // 정기예금
	
}

