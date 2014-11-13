
public class UrgentLetter extends LetterDecorator {
	
	public int getCost(){
		return this.letter.getCost()*2;
	}
	
	public void doAction(){
		super.doAction();
	}
}
