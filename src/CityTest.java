import static org.junit.Assert.*;

//import java.util.LinkedList;

import org.junit.Test;


public class CityTest {

	City c = new City("test");
	@Test
	public void testCity() {
		assertEquals(c.name, "test");		
	}

	@Test
	public void testDistributeLetters() {
		c.distributeLetters();
		assertEquals(c.getPost(), new City("test").getPost());
	}

	@Test
	public void testSendLetter() {
		BankAccount b = new BankAccount(10);
		Inhabitant h = new Inhabitant(c,"InhabitantTest",b);
		Letter<?> l = new SimpleLetter<TextContent>(h,h, new TextContent("test"));
		c.sendLetter(l);
		for(Letter<?> letter: c.mailbox)
			assertEquals(letter,l);
	}

	@Test
	public void testCollectLetters() {
		c.collectLetters();
		assertEquals(c.getMailBox(), new City("test").getMailBox());
	}
	
	@Test
	public void testGetPost() {
		assertEquals(c.getPost(), c.post);
	}
	
	@Test
	public void testGetMailBox() {
		assertEquals(c.getMailBox(), c.mailbox);
	}
}
