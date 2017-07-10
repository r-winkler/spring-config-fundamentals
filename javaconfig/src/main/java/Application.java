import ch.renewinkler.model.Customer;
import ch.renewinkler.service.CustomerService;
import ch.renewinkler.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);
        List<Customer> customers = customerService.findAll();
        System.out.println(customers.get(0).toString());

    }
}
