package web.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCarPage(@RequestParam(value = "count", required = false) Integer count,
                             Model model) {

        int carSeries;

         String carModel;

         String transmission;


        List<Car> result = null;

        System.out.println("Количество машин в запросе - " + count);
        model.addAttribute("message", "Количество машин в запросе - " + count);

        if (count < 5) {
            result = Car.getSomeCars(count, Car.addCars());
        } else if (count >= 5) {
            result = Car.addCars();
        }

        model.addAttribute("result", result);


        return "cars";
    }

}
