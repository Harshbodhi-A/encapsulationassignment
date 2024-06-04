package encapsulationassignment;

import java.time.LocalDate;

public class Test {

	Car car1 = new Car("audi" , "q3 " , " Audi" , 2022);
	Car car2 = new Car("BMW" , "xyx " , " BMW" , 2024);
	
	Coustomer customer1 = new Coustomer("C1" , "Aniket" , "aaa@gmail.com");
	Coustomer customer2 = new Coustomer("C2" , "Nikhil" , "bbb@gmail.com");
	
	Rental rental1 = new Rental(car1, customer1, LocalDate.of(2023, 6, 3));
	System.out.println("Car rental by: " + rental1.getCustomer().getName());
	System.out.println("Car availability: " + rental1.getCar().isAvailable());
	
	rental1.returnCar(LocalDate.of(2024 , 6, 6));
	System.out.println("Car returned by : " + rental1.getCustomer().getName());
	System.out.println("Car availibity: " + rental1.getCar().isAvailable());
}
