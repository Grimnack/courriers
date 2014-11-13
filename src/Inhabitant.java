

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
	
	public void sendletter(Letter<?> l){
		this.bankaccount.debit(l.getCost());
		getCity().sendletter(l);
	}

	public void receiveLetter(Letter<?> letter){
		letter.doAction();
	}
	
	public City getCity() {
		return this.city;
	}
	
	public void debit(int i){
		this.bankaccount.debit(i);
		return ;
	}
	public void credit(int i){
		this.bankaccount.credit(i);
		return ;
	}
}
