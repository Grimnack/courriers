
public class UrgentLetter extends LetterDecorator {
	
	
	public void doAction(){
		super.doAction();
		this.letter.getSender().debit(this.letter.getCost());
	}
}
