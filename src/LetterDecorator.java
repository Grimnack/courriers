
public abstract class LetterDecorator<T extends Letter<?>> extends Letter<T>{
	
	public LetterDecorator(Inhabitant s, Inhabitant r, T t) {
		super(s, r, t);
	}
	

}
