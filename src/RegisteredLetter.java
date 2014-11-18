
public class RegisteredLetter extends LetterDecorator {
	
	public void doAction(){
		super.doAction();
		this.letter.getSender().debit(15);
	}
	
}
