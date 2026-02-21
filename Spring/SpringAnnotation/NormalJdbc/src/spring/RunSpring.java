package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpring {
	public static void main(String []args){
		ApplicationContext context=
		new ClassPathXmlApplicationContext("SpringModule.xml");
		CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
		Customer customer = new Customer(5015, "Rashid", 651);
		Customer customer1 = new Customer(5016, "Love", 651);
		Customer customer2 = new Customer(5017, "Zoya", 351);

		customerDAO.insert(customer);
		customerDAO.insert(customer1);
		customerDAO.insert(customer2);

		Customer cust = customerDAO.findByCustomerId(5015);
		System.out.println(cust);

	}
}