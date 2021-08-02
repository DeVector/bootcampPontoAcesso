package com.desafio.digitalgradle.controlle;

import com.desafio.digitalgradle.model.Empresa;
import com.desafio.digitalgradle.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @PostMapping
    public Empresa createEmpresa(@RequestBody Empresa empresa){
        return empresaService.save(empresa);
    }

    @PutMapping
    public Empresa UpdateEmpresa(@RequestBody Empresa empresa) {
        return empresaService.update(empresa);
    }

    @GetMapping
    public List<Empresa> findAll() {
        return empresaService.findAll();
    }

    @GetMapping(value = "/{idEmpresa}")
    public ResponseEntity<Empresa> findById(@PathVariable Long idEmpresa) throws Exception{
        return ResponseEntity.ok(empresaService.findById(idEmpresa).orElseThrow(() -> new Exception("Empresa não encontrada")));
    }

    @DeleteMapping(value = "/{idEmpresa}")
    public ResponseEntity<Empresa> deleteById(@PathVariable Long idEmpresa){
        try{
            empresaService.deleteById(idEmpresa);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Empresa>) ResponseEntity.ok();
    }
}
