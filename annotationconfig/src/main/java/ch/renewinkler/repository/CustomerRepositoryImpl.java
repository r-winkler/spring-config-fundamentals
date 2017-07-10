package ch.renewinkler.repository;

import ch.renewinkler.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository {

    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstname("René");
        customer.setLastname("Winkler");

        customers.add(customer);
        return customers;
    }
}
