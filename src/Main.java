import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class Main {
	/* Attributs */
	protected City city;
	protected List<Inhabitant> inhabitants;
	protected Random r;

	
	/*
	 * Constructor with the city Lille with 100 Inhabitants
	 */
	public Main()
	{
		this.r = new Random();
		List<Letter<?>> poste = new LinkedList<Letter<?>>();
		this.city = new City("Lille", poste) ;
		this.inhabitants = new LinkedList<Inhabitant>() ;
		for(int i = 1 ; i<101 ; i++)
		{
			this.inhabitants.add(new Inhabitant(this.city, "Habitant num "+i, new BankAccount(1000))) ;
		}
		
		
	}
	/*
	 * return the random of the main class 
	 */
	public Random getR() {
		return this.r;	
	}
			
	
	/*
	 * Return the city of the main class
	 */
	public City getCity() {
		return this.city;
	}
			
	/*
	 * create a Letter wich can be a simple one or a promissory with decorations or not
	 */
/*	public Letter<?> createRandomLetter() {
		Letter<?> letter;
		switch (r.nextInt(4)) {
		case 1:
			Letter<?> tmp1 = new SimpleLetter(this.inhabitants.get(r.nextInt(100)),
			this.inhabitants.get(r.nextInt(100)), new Text(""));
			letter = new UrgentLetter();
			break;
		case 2:
			Letter<?> tmp2 = new SimpleLetter(this.inhabitants.get(r.nextInt(100)),
			this.inhabitants.get(r.nextInt(100)), new Text("bla bla"));
			letter = new RegisteredLetter(tmp2.getSender(), tmp2.getReceiver(), tmp2);
		break;
		case 3:
			letter = new PromissoryNote(this.inhabitants.get(r.nextInt(100)),
			this.inhabitants.get(r.nextInt(100)), new Money(r.nextInt(10)+10));
			break;
		default :
			letter = new SimpleLetter(this.inhabitants.get(r.nextInt(100)),
			this.inhabitants.get(r.nextInt(100)), new Text("bla bla"));
		}
		return letter;
}
		
		
		
	*/	
		
		
		
		
		
		
		
		
		
	
	
}
