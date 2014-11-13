
public class BankAccount {
	protected Inhabitant inhabitant ;
	protected int balance;
	/**
	 * Constructor of the BankAccount
	 * @param i = the Inhabitant
	 * @param b = the amount to set in the BankAccount
	 */
	public BankAccount(Inhabitant i, int b){
		this.inhabitant = i ;
		this.balance = b ;
	}
/**
 * credited the BankAccount of the people
 * @param i = the amount to credit
 */
	public void credit(int i) {
		this.balance = this.balance + i ; 
	}
/**
 * debited the BankAccount of the people	
 * @param i = the amount to debit
 */
	public void debit(int i){
		this.balance = this.balance - i ;
	}
/**
 * get the current amount of the BankAccount
 * @return the amount in the BankAccount
 */
	public int getBalance() {
		return this.balance;
	}
}
