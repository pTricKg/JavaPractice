import static java.lang.System.out;

public class TempExt extends Temperature {
	//subclass constructors- does not inherit from super Class 
	public TempExt() {
		super();//calling constructs from super Class
	}
	public TempExt(double number) {
		super(number);
	}
	public TempExt(TempScale scale) {
		super(scale);
	}
	public TempExt(double number, TempScale scale) {
		super(number, scale);
	}
	public void display() {
		out.printf("%5.2f degrees %s\n", getNumber(), getScale());//get to Temperature class privates
	}
}
