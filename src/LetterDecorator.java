
public class LetterDecorator {
	protected Letter<?> letter;
	
	public void doAction(){
		this.letter.doAction();
	}
	
}
