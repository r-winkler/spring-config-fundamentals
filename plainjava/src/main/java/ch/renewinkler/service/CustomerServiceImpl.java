package ch.renewinkler.service;

import ch.renewinkler.model.Customer;
import ch.renewinkler.repository.CustomerRepository;
import ch.renewinkler.repository.CustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    CustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
