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
	
	/**
	 * getter for the Post
	 * @return List Letter.
	 */
	public List<Letter<?>> getPost(){
		return this.post;
	}
	
	/**
	 * getter for the MailBox
	 * @return List Letter.
	 */
	public List<Letter<?>> getMailBox(){
		return this.mailbox;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if (mailbox == null) {
			if (other.mailbox != null)
				return false;
		} else if (!mailbox.equals(other.mailbox))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (post == null) {
			if (other.post != null)
				return false;
		} else if (!post.equals(other.post))
			return false;
		return true;
	}
}
