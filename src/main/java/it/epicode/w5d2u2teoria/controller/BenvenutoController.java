package it.epicode.w5d2u2teoria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BenvenutoController {

    @GetMapping("")
    public String Benvenuto(){
        return "Benvenuto al nostro servizio Rest";
    }
    @GetMapping("/benvenuto")
    public String Benvenuto2(@RequestParam String nome){
        return "Benvenuto "+ nome+ " al nostro servizio Rest";
    }

    @GetMapping("/{nome}")
    public String benvenuto(@PathVariable String nome){
        return "Benvenuto "+ nome+ " al nostro servizio Rest";
    }

}
