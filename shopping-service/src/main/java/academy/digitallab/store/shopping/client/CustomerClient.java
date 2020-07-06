package academy.digitallab.store.shopping.client;

import academy.digitallab.store.shopping.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface CustomerClient {

    @GetMapping(value = "/customers/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") long id);
}
