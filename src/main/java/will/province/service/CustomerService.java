package will.province.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import will.province.model.Customer;
import will.province.model.Province;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    Customer findById(int id);

    void save(Customer customer);

    void remove(int id);

    Page<Customer> findAllByProvince(Province province, Pageable pageable);
}
