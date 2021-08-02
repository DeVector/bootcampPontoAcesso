package com.desafio.digitalgradle.controlle;


import com.desafio.digitalgradle.model.Movimentacao;
import com.desafio.digitalgradle.model.MovimentacaoId;
import com.desafio.digitalgradle.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {

    @Autowired
    MovimentacaoService movimentacaoService;

    @PostMapping
    public Movimentacao createMovimentacao(@RequestBody Movimentacao movimentacao) {
        return movimentacaoService.save(movimentacao);
    }
    @PutMapping
    public Movimentacao update(@RequestBody Movimentacao movimentacao) {
        return movimentacaoService.update(movimentacao);
    }
    @GetMapping
    public List<Movimentacao> findAll() {
        return movimentacaoService.findAll();
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Movimentacao> findById(@PathVariable MovimentacaoId id) {
        return ResponseEntity.ok(movimentacaoService.findById(id).orElseThrow());
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Movimentacao> deleteById(@PathVariable MovimentacaoId id) {
        try {
            movimentacaoService.deleteById(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Movimentacao>) ResponseEntity.ok();
    }

}
