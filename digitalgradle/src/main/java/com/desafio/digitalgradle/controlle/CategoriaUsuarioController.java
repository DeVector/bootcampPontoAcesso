package com.desafio.digitalgradle.controlle;


import com.desafio.digitalgradle.model.CategoriaUsuario;
import com.desafio.digitalgradle.service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaUsuarioController {

    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;

    @PostMapping
    public CategoriaUsuario createCategoria(@RequestBody CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioService.save(categoriaUsuario);
    }

    @PutMapping
    public CategoriaUsuario updateCategoria(@RequestBody CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioService.update(categoriaUsuario);
    }

    @GetMapping
    public List<CategoriaUsuario> getCategoriaList(){
        return categoriaUsuarioService.findAll();
    }

    @GetMapping(value = "/{idCategoria}")
    public ResponseEntity<CategoriaUsuario> getCategoriaById(@PathVariable("idCategoria") Long idCategoria) throws Exception {
        return ResponseEntity.ok(categoriaUsuarioService.getById(idCategoria).orElseThrow(() -> new Exception("Jornada não encontrada.")));
    }

    @DeleteMapping(value = "/{idCategoria}")
    public ResponseEntity<CategoriaUsuario> deletById(@PathVariable Long idCategoria){
        try {
            categoriaUsuarioService.deleteJById(idCategoria);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<CategoriaUsuario>) ResponseEntity.ok();

    }

}
