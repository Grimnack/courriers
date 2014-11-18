import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class Main {
	/* Attributs */
	protected City city;
	protected Inhabitant[] inhabitants;
	protected Random r;

	
	/**
	 * Constructor with the city Lille with 100 Inhabitants
	 */
	public Main()
	{
		this.r = new Random();
		this.city = new City("Lille") ;
		this.inhabitants = new Inhabitant[100] ;
		for(int i = 0 ; i<100 ; i++)
		{
			this.inhabitants[i] = new Inhabitant(this.city, "Habitant num "+i, new BankAccount(1000)) ;
		}
		
		
	}
	/**
	 * @return the random of the main class 
	 */
	public Random getR() {
		return this.r;	
	}
			
	
	/**
	 * @Return the city of the main class
	 */
	public City getCity() {
		return this.city;
	}
			
	/**
	 * create randomly a Letter which can be a simple or a promissoryNote letter
	 */
	public Letter<?> createRandomLetter() {
		Letter<?> letter;
		switch (r.nextInt(2)) {
		case 0:
				letter = new PromissoryNote<MoneyContent>(this.inhabitants[r.nextInt(100)], this.inhabitants[r.nextInt(100)], new MoneyContent(10)) ;
				break;
		default :
				letter = new SimpleLetter<TextContent>(this.inhabitants[r.nextInt(100)], this.inhabitants[r.nextInt(100)], new TextContent("Bonjour tu vas bien ?")) ;
		}
		return letter;
	}
		
	public static void main(String[] args){
		Main main = new Main() ;
		System.out.println("Creating the City Lille");
		System.out.println("Creating 100 inhabitants");
		for(int i = 1 ; i<=5 ; i++){
			System.out.println("Day "+i);
			main.getCity().distributeLetters();
			main.getCity().sendLetter(main.createRandomLetter());
			main.getCity().sendLetter(main.createRandomLetter());
			main.getCity().sendLetter(main.createRandomLetter());
			main.getCity().sendLetter(main.createRandomLetter());
			main.getCity().collectLetters();
		}
		
	}
		
		
		
		
		
		
		
		
		
		
		
	
	
}
