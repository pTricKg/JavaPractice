import static java.lang.System.out;

public class EnglishSpeakingWorld {
	String mars = "   red planet";  //instance variable of class and belongs to object"English**"
	//above is also a field
	void visitPennsylvania() {
		out.println("visitPA is running:");
		
		String mars = "   Janine's home town";  //method-local variable = belongs to method visitPenn**
		
		out.println(mars);
		out.println(this.mars);  //refering to field.  this.* makes connection outside containing method
		
	}

}
