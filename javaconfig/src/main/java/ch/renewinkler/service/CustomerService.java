package ch.renewinkler.service;

import ch.renewinkler.model.Customer;
import ch.renewinkler.repository.CustomerRepository;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();

    void setCustomerRepository(CustomerRepository customerRepository);
}
