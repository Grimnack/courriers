
public class RegisteredLetter extends LetterDecorator {
	
	public void doAction(){
		super.doAction();
	}
	
	public int getCost(){
		return this.letter.getCost()+15;
	}
}
