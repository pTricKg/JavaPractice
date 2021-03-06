import static java.lang.System.out;

class UsingTemperature {
	
	public static void main(String args[]) {
		final String format = "%5.2f degrees %s\n";
		
		//making calls to constructors in Temperature class then doing work
		Temperature temp = new Temperature();
		temp.setNumber(70.0);
		temp.setScale(TempScale.FAHRENHEIT);
		out.printf(format, temp.getNumber(), temp.getScale());
		
		temp = new Temperature(32.0);
		out.printf(format, temp.getNumber(), temp.getScale());
		
		temp = new Temperature(TempScale.CELSIUS);
		out.printf(format, temp.getNumber(), temp.getScale());
		
		temp = new Temperature(2.73, TempScale.KELVIN);
		out.printf(format, temp.getNumber(), temp.getScale());
		//(parameters)must match declaration(parameters) in Temperature class
	}
}
