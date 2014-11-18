
public class MoneyContent implements Content {
	
	private int amount;
	/**
	 * Constructor of the MoneyContent class
	 * @param a the amount send in the PromissaryNote
	 */
	public MoneyContent(int a){
		this.amount = a;
	}
	/**
	 * get the money from the MoneyContent
	 * @return the amount in the PromissaryNote
	 */
	public int getMoneyContent(){
		return this.amount;
	}
	
	@Override
	public String getDefinition() {
		return "Money";
	}

}
