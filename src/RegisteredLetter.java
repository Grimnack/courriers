
public class RegisteredLetter<T extends Letter<?>> extends LetterDecorator<T> {

	protected final int taxe = 15;
	
	public RegisteredLetter(Inhabitant s, Inhabitant r, T letter){
		super(s, r, letter);
	}

	@Override
	public int getCost() {
		return this.content.getCost() + this.taxe ;
	}

	@Override
	public void doAction() {
		this.content.doAction();
	}
	
}
