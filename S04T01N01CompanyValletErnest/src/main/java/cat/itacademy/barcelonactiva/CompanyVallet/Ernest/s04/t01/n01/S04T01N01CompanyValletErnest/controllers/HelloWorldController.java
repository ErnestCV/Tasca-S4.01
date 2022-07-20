package cat.itacademy.barcelonactiva.CompanyVallet.Ernest.s04.t01.n01.S04T01N01CompanyValletErnest.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class HelloWorldController {

    private static final String TEMPLATE =  "Hola, %s, estàs executant un projecte Maven";

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(name = "nom", defaultValue = "UNKNOWN") String nom) {
        return String.format(TEMPLATE, nom);
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{nom}"})
    public String saluda2(@PathVariable() Optional<String> nom) {
        String nomRetorn = nom.orElse("UNKNOWN");
        return String.format(TEMPLATE, nomRetorn);
    }
}
