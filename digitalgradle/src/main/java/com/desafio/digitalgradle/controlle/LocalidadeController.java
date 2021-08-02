package com.desafio.digitalgradle.controlle;

import com.desafio.digitalgradle.model.Localidade;
import com.desafio.digitalgradle.service.LocalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/localidade")
public class LocalidadeController {

    @Autowired
    LocalidadeService localidadeService;
    @PostMapping
    public Localidade createLocalidade(@RequestBody Localidade localidade) {
        return localidadeService.save(localidade);
    }
    @PutMapping
    public Localidade update(@RequestBody Localidade localidade) {
        return localidadeService.update(localidade);
    }
    @GetMapping
    public List<Localidade> findAll() {
        return localidadeService.findAll();
    }
    @GetMapping (value = "/{id}")
    public ResponseEntity<Localidade> findById(@PathVariable Long id){
        return ResponseEntity.ok(localidadeService.findById(id).orElseThrow());
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Localidade> deleteById(@PathVariable Long id){
        try {
            localidadeService.deleteById(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Localidade>) ResponseEntity.ok();
    }

}
