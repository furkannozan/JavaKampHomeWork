package coffeeShops;


import java.time.LocalDate;
import java.util.Date;
import abstracts.*;
import abstracts.BaseCustomerManager;
import concrete.NeroCustomerManager;
import concrete.StarbuckCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbuckCustomerManager(null);
/*	Customer customer = new Customer(1,"Furkan","Ozan",new Date(1997,8,2),"36400815456");*/
		customerManager.save(new Customer(1,"furkan","ozan",1997,(long) 123456789));
		
		

	}

}
