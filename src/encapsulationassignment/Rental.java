package encapsulationassignment;

import java.time.LocalDate;
import java.util.Objects;

public class Rental {

	private Car car;
	private Coustomer customer;
	private LocalDate rentalDate;
	private LocalDate returnDate;
	
	public Rental(Car car, Coustomer customer, LocalDate rentalDate) {
		if(rentalDate.isAfter(LocalDate.now())) {
			System.out.print("Rental date cannot be in the future");
		}
		
		this.car = car;
		this.customer = customer;
		this.rentalDate = rentalDate;
		this.returnDate = null;
		
		car.rentCar();
		customer.addRentalCar(car);		
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Coustomer getCustomer() {
		return customer;
	}

	public void setCustomer(Coustomer customer) {
		this.customer = customer;
	}

	public LocalDate getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(LocalDate rentalDate) {
		this.rentalDate = rentalDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	
	public void returnCar(LocalDate returnDate) {
		if(returnDate.isBefore(rentalDate)) {
			System.out.println("Return date cannot be before rental date");
		}
		this.returnDate = returnDate;
		car.returnCar();
		customer.removeRentedCar(car);
	}
}
