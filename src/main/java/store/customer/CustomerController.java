package store.customer;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("store-customer")
@RequestMapping("")
public interface CustomerController {

    @GetMapping("/customer/")
    public List<CustomerOut> list();

    @GetMapping("/customer/{id}")
    public CustomerOut get(@PathVariable(required = true) String id);

    @DeleteMapping("/customer/{id}")
    public void delete(@PathVariable(required = true) String id);

    @PostMapping("/customer/")
    public ResponseEntity<Object> create(@RequestBody CustomertIn in);

}
