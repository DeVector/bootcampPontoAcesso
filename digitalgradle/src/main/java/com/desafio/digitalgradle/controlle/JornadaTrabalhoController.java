package com.desafio.digitalgradle.controlle;

import com.desafio.digitalgradle.model.JornadaTrabalho;
import com.desafio.digitalgradle.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaTrabalhoService jornadaTrabalhoService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoService.save(jornadaTrabalho);
    }
    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoService.update(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> findByAll() {
        return jornadaTrabalhoService.findAll();
    }

    @GetMapping(value = "/{idJornada}")
    public ResponseEntity<JornadaTrabalho> findById(@PathVariable Long idJornada) throws Exception{
        return ResponseEntity.ok(jornadaTrabalhoService.findById(idJornada).orElseThrow(() -> new Exception("Jornada não encontrada")));
    }

    @DeleteMapping(value = "/{idJornada}")
    public ResponseEntity<JornadaTrabalho> deleteById(@PathVariable Long idJornada){
        try{
            jornadaTrabalhoService.deleteById(idJornada);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }

}
