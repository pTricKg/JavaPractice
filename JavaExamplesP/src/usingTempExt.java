

public class usingTempExt {
	
	public static void main(String args[]) {
		//making calls to TempExt constructors
		TempExt temp = new TempExt();
		temp.setNumber(70.0);
		temp.setScale(TempScale.FAHRENHEIT);
		temp.display();
		
		temp = new TempExt(32.0);
		temp.display();
		
		temp = new TempExt(TempScale.CELSIUS);
		temp.display();
		
		temp = new TempExt(2.73, TempScale.KELVIN);
		
		temp.display();
	}

}
