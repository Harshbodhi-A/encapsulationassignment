package encapsulationassignment;

import java.util.ArrayList;
import java.util.List;

public class Coustomer {

	private String customerId;
	private String name;
	private String email;
	private List<Car> rentedCars;
	
	public Coustomer(String customerId, String name, String email) {
		if(customerId == null || customerId.isEmpty()) {
			System.out.println("Customer ID cannot be null or empty");
		}
		if(email == null || !email.contains("@")) {
			System.out.println("Invalid email");
		}
		
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.rentedCars = new ArrayList<>();
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Car> getRentalCars() {
		return rentedCars;
	}

	public void setRentedCars(List<Car> rentedCars) {
		this.rentedCars = rentedCars;
	}
	
	
	public void addRentalCar(Car car) {
		if(rentedCars.contains(car)) {
			System.out.println("Car is already rental by this customer");
		}
		rentedCars.add(car);
	}
	
	public void removeRentedCar(Car car) {
		if(!rentedCars.contains(car)) {
			System.out.println("Car is not rented by this customer");
		}
		rentedCars.remove(car);
	}
}
