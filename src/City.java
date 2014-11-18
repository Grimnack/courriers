import java.util.LinkedList;
import java.util.List;


public class City {
	
	protected String name;
	protected List<Letter<?>> post;
	protected List<Letter<?>> mailbox;
	/**
	 * Constructor of the class City
	 * @param name = the name of the city
	 */
	public City(String name){
		this.name = name;
		this.post=new LinkedList<Letter<?>>();
		this.mailbox=new LinkedList<Letter<?>>();
	}

	/**
	 * distribute letters that are in the post
	 */
	public void distributeLetters(){
		for(Letter<?> letter: this.post){
			letter.getReceiver().receiveLetter(letter);
		}
		post.clear();
	}
	/**
	 * add a letter in the mailbox
	 */
	public void sendLetter(Letter<?> letter){
		mailbox.add(letter);
	}
	
	/**
	 * Throws all the letters in the mailbox to the post
	 */
	public void collectLetters(){
		for(Letter<?> letter: this.mailbox){
			this.post.add(letter);
		}
		mailbox.clear();
	}
}
