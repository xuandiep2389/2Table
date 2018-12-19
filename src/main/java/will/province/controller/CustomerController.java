package will.province.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import will.province.model.Province;
import will.province.service.CustomerService;
import will.province.service.ProvinceService;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProvinceService provinceService;

    @ModelAttribute("provinces")
    public Page<Province> provinces(Pageable pageable) {
        return provinceService.findAll(pageable);
    }
}
