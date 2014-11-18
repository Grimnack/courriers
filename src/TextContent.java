
public class TextContent implements Content {

	private String text ;
	
	public TextContent(String s){
		this.text = s ;
	}
	
	public String getText(){
		return this.text ;
	}
	
	@Override
	public String getDefinition() {
		return "Text";
	}

}
