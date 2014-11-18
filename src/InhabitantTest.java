import static org.junit.Assert.*;

import org.junit.Test;


public class InhabitantTest {

	City c = new City("test");
	BankAccount b = new BankAccount(10);
	Inhabitant h = new Inhabitant(c,"InhabitantTest",b);
	@Test
	public void testInhabitant() {
		assertEquals(h.name, "InhabitantTest");
		assertEquals(h.city, c);
		assertEquals(h.bankaccount, b);
	}



	@Test
	public void testGetCity() {
		assertEquals(h.getCity(),h.city);
	}

	@Test
	public void testDebit() {
		h.debit(10);
		assertEquals(h.bankaccount.getBalance(),0);
	}

	@Test
	public void testCredit() {
		h.credit(10);
		assertEquals(h.bankaccount.getBalance(),20);
	}

	@Test
	public void testToString() {
		assertEquals(h.toString(), h.name);
	}

}
