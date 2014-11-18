

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {
	
	BankAccount B = new BankAccount(10);
	
	@Test
	public void testBankAccount() {
		BankAccount B = new BankAccount(10);
		assertEquals(B.balance, 10);
	}

	@Test
	public void testCredit() {
		B.credit(10);
		assertEquals(B.balance, B.balance+10);
	}

	@Test
	public void testDebit() {
		B.debit(10);
		assertEquals(B.balance, B.balance-10);
	}

	@Test
	public void testGetBalance() {
		assertEquals(B.balance, B.getBalance());
	}

}
