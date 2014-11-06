

public class Inhabitant {
	public void sendletter(letter<?>letter){
		account.debit(letter.getCost());
		getCity().sendletter(letter);
	}

	public void receiveLetter(letter<?>letter){
		letter.doAction();
	}
}
