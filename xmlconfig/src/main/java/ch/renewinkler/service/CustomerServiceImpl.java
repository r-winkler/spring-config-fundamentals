package ch.renewinkler.service;

import ch.renewinkler.model.Customer;
import ch.renewinkler.repository.CustomerRepository;
import ch.renewinkler.repository.CustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    CustomerRepository customerRepository;

    // used for constructor injection
//    public CustomerServiceImpl(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    // used for setter injection
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
