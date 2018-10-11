package bankaccount;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount("이동원", 300000, 0.1); // 초기금액 설정
		long money; // 금액
		int month; // x개월
		
		System.out.println("계좌 주인은 " + account.getName() + "이고, 잔액은 " + account.getBalance() + " 입니다.\n");
		
		// 입금 시나리오
		//money = 20000000000L; // 200억 입금
		money = 100000; // 10만원 입금
		account.deposit(money);
		System.out.println("계좌에 " + money + "원을 입금하여, 잔액이 " + account.getBalance() + "원이 되었습니다.");
		
		// 출금 시나리오
		money = 100000; // 10만원 출금
		if (account.withdraw(money) == true) {
			System.out.println("계좌에 " + money + "원을 출금하여, 잔액이 " + account.getBalance() + "원이 되었습니다.");
		}
		else {
			System.out.println("계좌 금액이 부족해 출금에 실패하였습니다.");
		} 
		
		// 적금 시나리오
		money = 10000; // 매월 10000원
		month = 12; // 12개월
		account.installmentSavingPredict(month, money);
		System.out.println("매월 " + money + "원씩 " + month + "개월 적금하면, 잔액이 " + account.getBalance() + "원이 될것입니다.");
		
		// 정기 예금 시나리오
		money = 2000000; // 2000000원
		month = 24; // 24개월
		account.fixedDepositPredict(month, money);
		System.out.println(money + "원을 " + month + "개월 정기예금하면, 잔액이 " + account.getBalance() +"원이 될것입니다.");
		
	}

}
