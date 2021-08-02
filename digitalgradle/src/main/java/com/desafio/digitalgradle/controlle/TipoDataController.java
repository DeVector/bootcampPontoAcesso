package com.desafio.digitalgradle.controlle;

import com.desafio.digitalgradle.model.NivelAcesso;
import com.desafio.digitalgradle.model.TipoData;
import com.desafio.digitalgradle.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/data")
public class TipoDataController {

    @Autowired
    TipoDataService tipoDataService;
    @PostMapping
    public TipoData createData(@RequestBody TipoData tipoData){
        return tipoDataService.save(tipoData);
    }
    @PutMapping
    public TipoData updateData(@RequestBody TipoData tipoData) {
        return tipoDataService.update(tipoData);
    }
    @GetMapping
    public List<TipoData> findAll() {
        return tipoDataService.findAll();
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<TipoData> findById(@PathVariable Long id) {
        return ResponseEntity.ok(tipoDataService.findById(id).orElseThrow());
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<TipoData> deleteById(@PathVariable Long id) {
        try{
            tipoDataService.deleteById(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<TipoData>) ResponseEntity.ok();
    }
}
