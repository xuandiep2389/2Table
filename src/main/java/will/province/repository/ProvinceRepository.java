package will.province.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import will.province.model.Province;

public interface ProvinceRepository extends PagingAndSortingRepository<Province, Integer> {
}
