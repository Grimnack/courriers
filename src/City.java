import java.util.ArrayList;
import java.util.List;


public class City {

	public void distributeLetters(){
		List<Letter<?>> bag = new ArrayList<Letter<?>>(postbox):
		for(Letter<?> letter: bag){
			letter.getReceiver().receiveletter(letter);
			postbox.remove(letter);
		}
	}

	public void sendLetter(Letter<?>letter){
		postBox.add(letter);
	}
}
