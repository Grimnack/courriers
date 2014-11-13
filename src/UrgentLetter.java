
public class UrgentLetter extends LetterDecorator {
	protected int cout;
	
	public int getCost(){
		return this.cout;
	}
	
	public void doAction(){
		super.doAction();
		/* + un truc a rajouter ici */
	}
}
