

public class Inhabitant {
	
	//Attributes
	protected String name ; 
	protected City city;
	protected BankAccount bankaccount ;
	
	public Inhabitant(City c,String n,BankAccount b){
		this.name=n;
		this.city = c;
		this.bankaccount = b;
	}
	
	public void sendletter(letter<?>letter){
		account.debit(letter.getCost());
		getCity().sendletter(letter);
	}

	public void receiveLetter(letter<?>letter){
		letter.doAction();
	}
}
