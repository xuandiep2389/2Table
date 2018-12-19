package will.province.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import will.province.model.Province;

public interface ProvinceService {
    Page<Province> findAll(Pageable pageable);

    Province findById(int id);

    void save(Province province);

    void remove(int id);
}
