
public abstract class Letter<T> {
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected Content content;
	
	public Letter(Inhabitant s, Inhabitant r){
		this.sender = s;
		this.receiver = r;
		
	}
	
	public abstract int getCost();
	
	public abstract void doAction();
	
	public Inhabitant getReceiver(){
		return this.receiver;
	}
	
	public Content getSender(){
		return this.content;
	}
	
	
}
