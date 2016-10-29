package application;

public class Vehicle implements java.io.Serializable {
	private String make;
	private String model;
	private int year;
	private double price;

	public String VehicleToString() {
		String output = "Make = " + make + ", Model = " + model + ", Year = " + year + ", Price = " + price + "\r";
		return output;
	}

	public Vehicle(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
}
