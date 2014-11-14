
public abstract class Letter<T> {
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected Content content;
	
	/**
	 * Constructor of the Letter class
	 * @param s Inhabitant who send letter
	 * @param r Inhabitant who receive letter
	 */
	public Letter(Inhabitant s, Inhabitant r){
		this.sender = s;
		this.receiver = r;
		
	}
	
	/**
	 * Abstract method who return the price that cost a letter
	 * @return the price
	 */
	public abstract int getCost();
	
	/**
	 * Abstract method to do the letter action
	 */
	public abstract void doAction();
	
	/**
	 * getter for the receiver
	 * @return the receiver
	 */
	public Inhabitant getReceiver(){
		return this.receiver;
	}
	
	/**
	 * getter for the sender
	 * @return the sender
	 */
	public Content getSender(){
		return this.content;
	}
	
	
}
