
public class PromissoryNote<T> extends Letter<T>{
	protected int amount;
	protected int cout;
	
	public PromissoryNote(Inhabitant s, Inhabitant r, int a){
		super(s,r);
		this.amount = a;
		this.cout = 1 + a/100;
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
