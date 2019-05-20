package fr.wcs.AtelierSpring.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtelierController {

    @GetMapping("/Atelier")
    public String sendTo() {
        return "Introduction à Spring";
    }

}
