import java.util.ArrayList;
import java.util.List;


public class City {
	
	protected String name;
	protected List<Letter<?>> postbox;
	
	public City(String name, List<Letter<?>> postbox){
		this.name = name;
		this.postbox=postbox;
	}

	public void distributeLetters(){
		List<Letter<?>> bag = new ArrayList<Letter<?>>(postbox):
		for(Letter<?> letter: bag){
			letter.getReceiver().receiveletter(letter);
			postbox.remove(letter);
		}
	}

	public void sendLetter(Letter<?> letter){
		postBox.add(letter);
	}
}
