package bankaccount;

public class BankAccount {

	String name; // �̸�
	int account; // ���� ��ȣ
	long Balance; // �ܾ�
	double rate; // ������
	
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
	}	// ������ ����

	public boolean deposit(long money) {
		Balance = Balance + money;
		return true;
	} // �Ա� 
	public boolean withdraw(long money) {
		if (Balance >= money) {
			Balance = Balance - money;
			return true;}
		else {return false;}
	} // ���. �ܾ��̻� �ݾ� ��ݽ� ��� �Ұ���
	
	public boolean installmentSavingPredict(int month, long money){
		Balance = (int) (Balance + (money * rate/12 * (month * (month + 1)/2) + money * month));
		return true;
	} // ���� 
	
	public boolean fixedDepositPredict(int month, long money){
		Balance = (long) (money + (money * (Math.pow(1 + (rate/12), month)-1)));
		//Balance = (long) (money * (((1+(rate/12))*month * month)-1));
		return true;
	} // ���⿹��
	
}

