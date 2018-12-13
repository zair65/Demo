
public class Car extends Vehicle {

	private int numseats;
	private String typeofdrive;

	public Car(int numseats, String typeofdrive, int tires, int engineSize, String numberplate) {
		super(engineSize, numberplate,tires);
		this.numseats = numseats;
		this.typeofdrive = typeofdrive;

	}

	public int getnumseats() {
		this.numseats = numseats;
		return numseats;
	}

	public void setnumseats(int numseats) {
		this.numseats = numseats;

	}

	public String gettypeofdrive() {
		this.typeofdrive = typeofdrive;
		return typeofdrive;
	}

	public void settypeofdrive(String typeofdrive) {
		this.numseats = numseats;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getnumseats() + ", " + gettypeofdrive() + gettires() + getenginesize();
	}
}
