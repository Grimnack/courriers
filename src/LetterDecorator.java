
public class LetterDecorator {
	protected Letter<?> letter;
	/**
	 * Method who return the doAction method of the letter class
	 */
	public void doAction(){
		this.letter.doAction();
	}
	
}
