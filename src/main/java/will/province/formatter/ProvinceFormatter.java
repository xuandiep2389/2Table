package will.province.formatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;
import will.province.model.Province;
import will.province.service.ProvinceService;

import java.text.ParseException;
import java.util.Locale;

@Component
public class ProvinceFormatter implements Formatter<Province> {

    private ProvinceService provinceService;

    @Autowired
    public ProvinceFormatter(ProvinceService provinceService) {
        this.provinceService = provinceService;
    }

    @Override
    public Province parse(String text, Locale locale) throws ParseException {
        return provinceService.findById(Integer.parseInt(text));
    }

    @Override
    public String print(Province object, Locale locale) {
        return "[" + object.getId()+ "," + object.getName() +"]";
    }

}
