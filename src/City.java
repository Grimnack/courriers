import java.util.ArrayList;
import java.util.List;


public class City {
	
	protected String name;
	protected List<Letter<?>> postbox;
	/**
	 * Constructor of the class City
	 * @param name = the name of the city
	 * @param poste = the postbox of the city
	 */
	public City(String name, List<Letter<?>> poste){
		this.name = name;
		this.postbox=poste;
	}

	/**
	 * distribute letters that are in the postbox
	 */
	public void distributeLetters(){
		List<Letter<?>> bag = new ArrayList<Letter<?>>(postbox);
		for(Letter<?> letter: bag){
			letter.getReceiver().receiveLetter(letter);
			postbox.remove(letter);
		}
	}
	/**
	 * add a letter in the postbox
	 */
	public void sendLetter(Letter<?> letter){
		postbox.add(letter);
	}
}
