
public class TrackPopulation3 {
	
	public static void main(String args[]) {
		City smackoverAR = new City();
		smackoverAR.population = 2232;
		birth(smackoverAR);  //passing to method by reference  *points to og object*
		System.out.println(smackoverAR.population);
			
	}
	static void birth(City aCity) {
		aCity.population++; //increment passed method reference to aCity
	}

}
