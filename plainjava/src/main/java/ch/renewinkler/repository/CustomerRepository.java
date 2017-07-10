package ch.renewinkler.repository;

import ch.renewinkler.model.Customer;

import java.util.List;

public interface CustomerRepository {

    List<Customer> findAll();

}
