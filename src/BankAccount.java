
public class BankAccount {
	protected Inhabitant inhabitant ;
	protected int balance;
	
	public BankAccount(Inhabitant i, int b){
		this.inhabitant = i ;
		this.balance = b ;
	}

	public void credit(int i) {
		this.balance = this.balance + i ; 
	}
	
	public void debit(int i){
		this.balance = this.balance - i ;
	}
	
	public int getBalance() {
		return this.balance;
	}
}
