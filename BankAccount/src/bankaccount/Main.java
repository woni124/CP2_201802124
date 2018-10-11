package bankaccount;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount("�̵���", 300000, 0.1); // �ʱ�ݾ� ����
		long money; // �ݾ�
		int month; // x����
		
		System.out.println("���� ������ " + account.getName() + "�̰�, �ܾ��� " + account.getBalance() + " �Դϴ�.\n");
		
		// �Ա� �ó�����
		//money = 20000000000L; // 200�� �Ա�
		money = 100000; // 10���� �Ա�
		account.deposit(money);
		System.out.println("���¿� " + money + "���� �Ա��Ͽ�, �ܾ��� " + account.getBalance() + "���� �Ǿ����ϴ�.");
		
		// ��� �ó�����
		money = 100000; // 10���� ���
		if (account.withdraw(money) == true) {
			System.out.println("���¿� " + money + "���� ����Ͽ�, �ܾ��� " + account.getBalance() + "���� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("���� �ݾ��� ������ ��ݿ� �����Ͽ����ϴ�.");
		} 
		
		// ���� �ó�����
		money = 10000; // �ſ� 10000��
		month = 12; // 12����
		account.installmentSavingPredict(month, money);
		System.out.println("�ſ� " + money + "���� " + month + "���� �����ϸ�, �ܾ��� " + account.getBalance() + "���� �ɰ��Դϴ�.");
		
		// ���� ���� �ó�����
		money = 2000000; // 2000000��
		month = 24; // 24����
		account.fixedDepositPredict(month, money);
		System.out.println(money + "���� " + month + "���� ���⿹���ϸ�, �ܾ��� " + account.getBalance() +"���� �ɰ��Դϴ�.");
		
	}

}
