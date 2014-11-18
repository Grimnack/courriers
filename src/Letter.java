
public abstract class Letter<T extends Content> {
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected T content;
	
	/**
	 * Constructor of the Letter class
	 * @param s Inhabitant who send letter
	 * @param r Inhabitant who receive letter
	 */
	public Letter(Inhabitant s, Inhabitant r,T  t){
		this.sender = s;
		this.receiver = r;
		this.content = t;
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
	public Inhabitant getSender(){
		return this.sender;
	}
	public T getContent(){
		return this.content;
	}
	
}
