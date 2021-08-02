package com.desafio.digitalgradle.controlle;

import com.desafio.digitalgradle.model.Calendario;
import com.desafio.digitalgradle.model.NivelAcesso;
import com.desafio.digitalgradle.service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calendario")
public class CalendarioController {

    @Autowired
    CalendarioService calendarioService;

    @PostMapping
    public Calendario createCalendario(@RequestBody Calendario calendario) {
        return calendarioService.save(calendario);
    }
    @PutMapping
    public Calendario updateCalendario(@RequestBody Calendario calendario) {
        return calendarioService.update(calendario);
    }
    @GetMapping
    public List<Calendario> findAll() {
        return calendarioService.findAll();
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Calendario> findById(@PathVariable Long id) {
        return ResponseEntity.ok(calendarioService.findById(id).orElseThrow());
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Calendario> deleteById(@PathVariable Long id) {
        try {
            calendarioService.deleteById(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Calendario>) ResponseEntity.ok();
    }

}
