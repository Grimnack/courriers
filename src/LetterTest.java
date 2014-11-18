import static org.junit.Assert.*;

import org.junit.Test;


public class LetterTest {
	City c = new City("test");
	BankAccount b = new BankAccount(10);
	TextContent t1 = new TextContent("test test");
	MoneyContent t2 = new MoneyContent(10);
	Inhabitant h1 = new Inhabitant(c,"InhabitantTest1",b);
	Inhabitant h2 = new Inhabitant(c,"InhabitantTest2",b);
	
	Letter<TextContent> l1 = new SimpleLetter<TextContent>(h1,h2,t1);
	Letter<MoneyContent> l2 = new PromissoryNote<MoneyContent>(h1,h2,t2);
	
	@Test
	public void testLetter() {
		assertEquals(l1.sender, h1);
		assertEquals(l1.receiver, h2);
		assertEquals(l1.content, t1);
		
		assertEquals(l2.sender, h1);
		assertEquals(l2.receiver, h2);
		assertEquals(l2.content, t2);
	}

	@Test
	public void testGetCost() {
		assertEquals(l1.getCost(), 1);
		assertEquals(l2.getCost(),1 + t2.getMoneyContent()/100);
	}

	@Test
	public void testDoAction() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetReceiver() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSender() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetContent() {
		fail("Not yet implemented");
	}

}
