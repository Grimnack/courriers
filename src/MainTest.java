import static org.junit.Assert.*;

import org.junit.Test;


public class MainTest {
	
	@Test
	public void testMain() {
		assertEquals(new Main(), new Main());
	}

	@Test
	public void testGetInhabitant() {
		City city = new City("Lille") ;
		Inhabitant[] inhabitants = new Inhabitant[100] ;
		for(int i = 0 ; i<100 ; i++)
		{
			inhabitants[i] = new Inhabitant(city, "Habitant num "+i, new BankAccount(1000));
			assertEquals(new Main().getInhabitant()[i], inhabitants[i]);
		}
	}

	/*
	 * Testing limit of the Random a hundreds time.
	 */
	@Test
	public void testGetR() {
		for (int i = 0; i<100; i++){
			int Random1 = new Main().getR().nextInt(100);
			assertTrue(Random1 < 100);
			assertTrue(Random1 >= 0);
		}	
	}

	@Test
	public void testGetCity() {
		assertEquals(new Main().getCity(), new City("Lille"));
	}

}
