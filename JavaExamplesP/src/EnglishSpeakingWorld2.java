import static java.lang.System.out;

public class EnglishSpeakingWorld2 {

	String mars;  //field =  can be accessed by all methods in class
	
	void visitIdaho() {
		out.println("visitID is running:");
		
		mars = "   red planet";
		String atomicCity = "   Poplulation: 25";  //method-local variable *only accessed inside method*
		
		out.println(mars);
		out.println(atomicCity);
	}
	
	void visitNewJersey() {
		out.println("visitNJ is running:");
		
		out.println(mars);
		//out.println(atomicCity);
		//  cannot resolve symbol
	}
}
