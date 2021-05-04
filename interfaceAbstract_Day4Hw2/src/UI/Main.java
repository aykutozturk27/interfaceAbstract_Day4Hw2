package UI;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer();
		customer.id = 1;
		customer.firstName = "Aykut";
		customer.lastName = "Öztürk";
		customer.dateOfBirth = LocalDate.of(1992, 4, 27);
		customer.nationalityId = "1234567891";
		customerManager.save(customer);
	}

}
