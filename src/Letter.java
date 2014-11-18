
public abstract class Letter<T> {
	
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
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Letter<?> other = (Letter<?>) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (receiver == null) {
			if (other.receiver != null)
				return false;
		} else if (!receiver.equals(other.receiver))
			return false;
		if (sender == null) {
			if (other.sender != null)
				return false;
		} else if (!sender.equals(other.sender))
			return false;
		return true;
	}
	
}
