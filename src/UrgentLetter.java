
public class UrgentLetter<T extends Letter<?>> extends LetterDecorator<T> {
	
	private final int ratio = 2;
	
	public UrgentLetter(Inhabitant s, Inhabitant r, T t) {
		super(s, r, t);
	}

	@Override
	public int getCost() {
		return this.content.getCost()*this.ratio;
	}

	@Override
	public void doAction() {
		this.content.doAction();
		System.out.println("As an Urgent Letter");
		
	}


}
