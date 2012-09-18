
public class TrackPopulation {
	
	public static void main(String args[]) {
		
		int smackoverARpop = 2232;
		
		smackoverARpop = birth(smackoverARpop); //passing int variable by value to birth method
		//birth(smackoverARpop); makes new value with no ref point for og int
		System.out.println(smackoverARpop);
				
	}
	static int birth(int cityPop) {
		//cityPop++;  increments new int cityPop value but doesn't associate new value with og int
		return cityPop + 1;
	}

}
