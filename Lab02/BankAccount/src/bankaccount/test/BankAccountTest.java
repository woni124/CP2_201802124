package bankaccount.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bankaccount.BankAccount;

class BankAccountTest {

	@Test
	void testGetName() {
		BankAccount bank = new BankAccount("이동원", 300000, 0.1);
		assertEquals("이동원", bank.getName());
	}

	@Test
	void testGetBalance() {
		BankAccount bank = new BankAccount("이동원", 300000, 0.1);
		assertEquals(300000, bank.getBalance());
	}

	@Test
	void testDeposit() {
		BankAccount bank = new BankAccount("이동원", 300000, 0.1);
		assertTrue(bank.deposit(100000));
	}

	@Test
	void testWithdraw() {
		BankAccount bank = new BankAccount("이동원", 300000, 0.1);
		assertTrue(bank.withdraw(100000));
	}

	@Test
	void testInstallmentSavingPredict() {
		BankAccount bank = new BankAccount("이동원", 300000, 0.1);
		assertTrue(bank.installmentSavingPredict(10000, 12));
	}

	@Test
	void testFixedDepositPredict() {
		BankAccount bank = new BankAccount("이동원", 300000, 0.1);
		assertTrue(bank.fixedDepositPredict(2000000, 24));
	}

}
