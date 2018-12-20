package will.province.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import will.province.model.Customer;
import will.province.model.Province;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Integer> {
    Page<Customer> findAllByProvince(Province province, Pageable pageable);
}
