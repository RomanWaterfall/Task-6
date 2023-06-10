package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.services.CarServicesImp;
import java.util.Optional;

@Controller
public class CarsCoontroller {

    @Autowired
    private CarServicesImp carservices;


    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count") Optional<Integer> count, ModelMap model) {
        model.addAttribute("cars", carservices.getCars(count.orElse(0)));

        return "cars";
    }
}
