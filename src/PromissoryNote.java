
public class PromissoryNote<T extends MoneyContent> extends Letter<T>{
	protected int amount;
	protected int cout;
	
	/**
	 * Constructor of the PromissoryNote Class
	 * @param s Inhabitant sender
	 * @param r Inhabitant receiver
	 * @param a the amount
	 */
	public PromissoryNote(Inhabitant s, Inhabitant r,T m){
		super(s,r,m);
		this.amount = m.getMoneyContent();
		this.cout = 1 + m.getMoneyContent()/100;
	}
	@Override
	public int getCost() {
		return this.cout;
	}

	@Override
	public void doAction() {
		sender.debit(amount);
		receiver.credit(amount);
		System.out.println(this.sender + "à envoyé"+ this.amount+"à"+this.receiver);
		sender.debit(cout);
	}

}
