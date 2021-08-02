package com.desafio.digitalgradle.controlle;

import com.desafio.digitalgradle.model.NivelAcesso;
import com.desafio.digitalgradle.model.Ocorrencia;
import com.desafio.digitalgradle.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController {

    @Autowired
    OcorrenciaService ocorrenciaService;
    @PostMapping
    public Ocorrencia createOcorrencia(@RequestBody Ocorrencia ocorrencia) {
        return ocorrenciaService.save(ocorrencia);
    }
    @PutMapping
    public Ocorrencia updateOcorrencia(@RequestBody Ocorrencia ocorrencia) {
        return ocorrenciaService.update(ocorrencia);
    }
    @GetMapping
    public List<Ocorrencia> findAll(){
        return ocorrenciaService.findAll();
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Ocorrencia> findById(@PathVariable Long id) {
        return ResponseEntity.ok(ocorrenciaService.findById(id).orElseThrow());
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Ocorrencia> deleteById(@PathVariable Long id) {
        try {
            ocorrenciaService.deleteById(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Ocorrencia>) ResponseEntity.ok();
    }
}
