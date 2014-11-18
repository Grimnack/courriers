import java.util.Arrays;
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
	public Inhabitant[] getInhabitant(){
		return this.inhabitants;
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
		Inhabitant sender = this.inhabitants[r.nextInt(100)] ;
		Inhabitant receiver = this.inhabitants[r.nextInt(100)] ;
		Letter<TextContent> lettre = new SimpleLetter<TextContent>(sender, receiver, new TextContent("Bonjour tu vas bien ?")) ;
		switch (r.nextInt(4)) {
		case 0:
				letter = new PromissoryNote<MoneyContent>(sender, receiver, new MoneyContent(10)) ;
				break;
		case 1:
				letter = new SimpleLetter<TextContent>(sender, receiver, new TextContent("Bonjour tu vas bien ?")) ;
				break ;
		case 2:
				letter = new UrgentLetter<Letter<TextContent>>(sender, receiver, lettre);
				break ;
		default:
				letter = new RegisteredLetter<Letter<TextContent>>(sender, receiver, lettre);
				break ;
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
			main.getInhabitant()[main.getR().nextInt(100)].sendletter(main.createRandomLetter());
			main.getInhabitant()[main.getR().nextInt(100)].sendletter(main.createRandomLetter());
			main.getInhabitant()[main.getR().nextInt(100)].sendletter(main.createRandomLetter());
			main.getInhabitant()[main.getR().nextInt(100)].sendletter(main.createRandomLetter());
			main.getInhabitant()[main.getR().nextInt(100)].sendletter(main.createRandomLetter());
			//main.getCity().sendLetter(main.createRandomLetter());
			main.getCity().collectLetters();
		}
		
	}
	
		
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Main other = (Main) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (!Arrays.equals(inhabitants, other.inhabitants))
			return false;
		return true;
	}	
	
}
