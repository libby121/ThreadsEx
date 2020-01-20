package fileof;

import java.io.Serializable;

public class Car implements Serializable {//means:i will take the object, scan it ,
	//and convert it  to byte representation
	//serializable=an interface with no methods. 
	private int year;
	private String model;
	private double SpeedMax;

	public Car(int year, String model, double speedMax) {


		this.year = year;
		this.model = model;
		SpeedMax = speedMax;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeedMax() {
		return SpeedMax;
	}

	public void setSpeedMax(double speedMax) {
		SpeedMax = speedMax;
	}

	@Override
	public String toString() {
		return "Car [year=" + year + ", model=" + model + ", SpeedMax="
				+ SpeedMax + "]";
	}
	
	

}
