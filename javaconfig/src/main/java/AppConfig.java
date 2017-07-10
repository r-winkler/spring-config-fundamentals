import ch.renewinkler.repository.CustomerRepository;
import ch.renewinkler.repository.CustomerRepositoryImpl;
import ch.renewinkler.service.CustomerService;
import ch.renewinkler.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("customerService")
    public CustomerService getCustomerService(){
        CustomerService customerService = new CustomerServiceImpl();
        customerService.setCustomerRepository(getCustomerRepository());
        return customerService;
    }

    @Bean("customerRepository")
    public CustomerRepository getCustomerRepository() {
        return new CustomerRepositoryImpl();
    }
}
