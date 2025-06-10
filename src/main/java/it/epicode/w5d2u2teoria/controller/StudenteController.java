package it.epicode.w5d2u2teoria.controller;

import it.epicode.w5d2u2teoria.exception.StudenteNotFoundException;
import it.epicode.w5d2u2teoria.model.Studente;
import it.epicode.w5d2u2teoria.service.StudenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudenteController {

    @Autowired
    private StudenteService studenteService;

    @PostMapping("/studenti")
    @ResponseStatus(HttpStatus.CREATED)
    public Studente saveStudente(@RequestBody Studente studente){
        return studenteService.saveStudente(studente);
    }

    @GetMapping("/studenti/{matricola}")
    public Studente getStudente(@PathVariable int matricola) throws StudenteNotFoundException {
        return studenteService.getStudente(matricola);
    }

    @GetMapping("/studenti")
    public List<Studente> getAllStudenti(){
        return studenteService.getAllStudenti();
    }

    @PutMapping("/studenti/{matricola}")
    public Studente updateStudente(@PathVariable int matricola, @RequestBody Studente studente) throws StudenteNotFoundException {
        return studenteService.updateStudente(matricola, studente);
    }
    @DeleteMapping("/studenti/{matricola}")
    public void deletStudente(@PathVariable int matricola) throws StudenteNotFoundException{
        studenteService.deleteStudente(matricola);
    }
}
