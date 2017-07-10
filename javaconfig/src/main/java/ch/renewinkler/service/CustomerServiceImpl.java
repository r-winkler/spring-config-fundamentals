package ch.renewinkler.service;

import ch.renewinkler.model.Customer;
import ch.renewinkler.repository.CustomerRepository;
import ch.renewinkler.repository.CustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
