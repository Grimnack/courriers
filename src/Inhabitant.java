

public class Inhabitant {
	
	//Attributes
	protected String name ; 
	protected City city;
	protected BankAccount bankaccount ;
	
	/**
	 * Constructor of the class Inhabitant
	 * @param c the city where person comes from.
	 * @param n the name of the person
	 * @param b the BankAccount of the person
	 */
	public Inhabitant(City c,String n,BankAccount b){
		this.name=n;
		this.city = c;
		this.bankaccount = b;
	}
	/**
	 * send a letter
	 * @param l the letter to send
	 */
	public void sendletter(Letter<Content> l){
		this.bankaccount.debit(l.getCost());
		getCity().sendLetter(l);
	}
	/**
	 * receive a letter
	 * @param letter the letter received
	 */
	public void receiveLetter(Letter<?> letter){
		letter.doAction();
	}
	/**
	 * getter to know where the person comes from
	 * @return the city
	 */
	public City getCity() {
		return this.city;
	}
	/**
	 * debit a person
	 * @param i the amount to debit
	 */
	public void debit(int i){
		this.bankaccount.debit(i);
		return ;
	}
	
	/**
	 * credit a person
	 * @param i the person to credit
	 */
	public void credit(int i){
		this.bankaccount.credit(i);
		return ;
	}
	
	/**
	 * toString method for the name of the person
	 * @return the name
	 */
	public String toString(){
		return this.name;
	}
}
