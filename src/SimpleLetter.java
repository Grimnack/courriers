
public class SimpleLetter<T extends TextContent> extends Letter<T>{
	protected final int coutFixe;
	
	/**
	 * Constructor of the SimpleLetter class
	 * @param s Inhabitant sender
	 * @param r Inhabitant receiver
	 */
	public SimpleLetter(Inhabitant s, Inhabitant r,T t){
		super(s, r, t);
		/* on choisit arbitrairement le cout d'une lettre simple a 1 */
		this.coutFixe = 1;
		
	}
	@Override
	public int getCost() {
		return this.coutFixe;
	}

	@Override
	public void doAction() {
		sender.debit(this.getCost());
		System.out.println("A"+this.receiver+":"+this.content);
	}
	
}
