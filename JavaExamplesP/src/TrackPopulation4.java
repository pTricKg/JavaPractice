
public class TrackPopulation4 {
	public static void main(String args[]) {
		City smackoverAR = new City();
		smackoverAR.population = 2232;
		smackoverAR = doBirth(smackoverAR); //returns by whole object = replaces og int value with returned method value
		System.out.println(smackoverAR.population);
			
	}
	static City doBirth(City aCity) {
		City myCity = new City(); //creates new instance 
		myCity.population = aCity.population + 1; //increments new instance
		return myCity; //returns new instance value
	}
}
