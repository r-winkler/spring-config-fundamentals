import ch.renewinkler.model.Customer;
import ch.renewinkler.service.CustomerService;
import ch.renewinkler.service.CustomerServiceImpl;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        CustomerService customerService = new CustomerServiceImpl();
        List<Customer> customers = customerService.findAll();
        System.out.println(customers.get(0).toString());

    }
}
