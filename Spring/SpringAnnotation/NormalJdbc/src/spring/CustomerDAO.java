package spring;

import spring.Customer;

public interface CustomerDAO {

    public void insert(Customer customer);
    public Customer findByCustomerId(int custId);
}
