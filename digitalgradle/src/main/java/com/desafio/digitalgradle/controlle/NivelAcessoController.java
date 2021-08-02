package com.desafio.digitalgradle.controlle;

import com.desafio.digitalgradle.model.NivelAcesso;
import com.desafio.digitalgradle.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nivel")
public class NivelAcessoController {

    @Autowired
    NivelAcessoService nivelAcessoService;

    @PostMapping
    public NivelAcesso createNivel(@RequestBody NivelAcesso nivelAcesso) {
        return nivelAcessoService.save(nivelAcesso);
    }
    @PutMapping
    public NivelAcesso updateNivel(@RequestBody NivelAcesso nivelAcesso) {
        return nivelAcessoService.update(nivelAcesso);
    }

    @GetMapping
    public List<NivelAcesso> findAll(){
        return nivelAcessoService.findAll();
    }

    @GetMapping(value = "/{idNivel}")
    public ResponseEntity<NivelAcesso> findById(@PathVariable Long idNivel) {
        return ResponseEntity.ok(nivelAcessoService.findById(idNivel).orElseThrow());
    }

    @DeleteMapping(value = "/{idNivel}")
    public ResponseEntity<NivelAcesso> deleteById(@PathVariable Long idNivel) {
        try {
            nivelAcessoService.deleteById(idNivel);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<NivelAcesso>) ResponseEntity.ok();
    }
}
