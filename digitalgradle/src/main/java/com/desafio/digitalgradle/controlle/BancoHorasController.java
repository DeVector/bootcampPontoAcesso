package com.desafio.digitalgradle.controlle;

import com.desafio.digitalgradle.model.BancoHoras;
import com.desafio.digitalgradle.model.BancoHorasId;
import com.desafio.digitalgradle.service.BancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bancohoras")
public class BancoHorasController {

    @Autowired
    BancoHorasService bancoHorasService;

    @PostMapping
    public BancoHoras createBanco(@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.save(bancoHoras);
    }
    @PutMapping
    public BancoHoras updateBanco(@RequestBody BancoHoras bancoHoras) {
        return bancoHorasService.update(bancoHoras);
    }

    public List<BancoHoras> findAll(){
        return bancoHorasService.findAll();
    }

    @GetMapping(value = "/{idBanco}")
    public ResponseEntity<BancoHoras> findById(@PathVariable BancoHorasId idBanco) throws Exception {
        return ResponseEntity.ok(bancoHorasService.getById(idBanco).orElseThrow(() -> new Exception("Banco de Horas não encontrado")));
    }

    @DeleteMapping(value = "/{idBanco}")
    public ResponseEntity<BancoHoras> deleteById(@PathVariable BancoHorasId idBanco) throws Exception {
        try{
            bancoHorasService.deleteById(idBanco);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<BancoHoras>) ResponseEntity.ok();
    }

}
