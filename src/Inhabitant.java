

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
	public void sendletter(Letter<?> l){
		this.bankaccount.debit(l.getCost());
		getCity().sendLetter(l);
		System.out.println(this.name+" send a letter to "+l.getReceiver());
	}
	/**
	 * receive a letter
	 * @param letter the letter received
	 */
	public void receiveLetter(Letter<?> letter){
		System.out.println(this.name+" receives a letter from "+letter.getSender());
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
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inhabitant other = (Inhabitant) obj;
		if (bankaccount == null) {
			if (other.bankaccount != null)
				return false;
		} else if (!bankaccount.equals(other.bankaccount))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
