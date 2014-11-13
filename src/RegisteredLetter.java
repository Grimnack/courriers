
public class RegisteredLetter extends LetterDecorator {
	protected int cout;
	
	public void doAction(){
		super.doAction();
		/*+ un truc a rajouter ici*/
	}
	
	public int getCost(){
		return this.cout;
	}
}
