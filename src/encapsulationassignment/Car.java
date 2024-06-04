package encapsulationassignment;

public class Car {
	
	private String licensePlate;
	private String model;
	private String brand;
	private int year;
	private boolean available;
	
	
	public Car(String licensePlate, String model, String brand, int year) {
		if(licensePlate == null || licensePlate.isEmpty()) {
			System.out.println("License plate cannot be null or empty");
		}
		if (year <= 0) {
			System.out.println("Year must be a positive number");
		}
		
		this.licensePlate = licensePlate;
		this.model = model;
		this.brand = brand;
		this.year = year;
		this.available = true;
	}


	public String getLicensePlate() {
		return licensePlate;
	}


	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public boolean isAvailable() {
		return available;
	}


	public void setAvailable(boolean available) {
		this.available = available;
	}

	
	
	
	
	public void returnCar() {
		if(available) {
			System.out.println("Caar is already available");
		}
		this.available = true;
	}


	public void rentCar() {
		if(!available) {
			System.out.println("Car is a lready rented");
		}
		this.available = false;
		
	}
	
}
