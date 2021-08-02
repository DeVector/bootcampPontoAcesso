package com.desafio.digitalgradle.controlle;

import com.desafio.digitalgradle.model.Usuario;
import com.desafio.digitalgradle.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;
    @PostMapping
    public Usuario createUser(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }
    @PutMapping
    public Usuario updateUser(@RequestBody Usuario usuario) {
        return usuarioService.update(usuario);
    }
    @GetMapping
    public List<Usuario> findAll() {
        return usuarioService.findAll();
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Long id) {
        return ResponseEntity.ok(usuarioService.findById(id).orElseThrow());
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Usuario> deleteById(@PathVariable Long id) {
        try {
            usuarioService.deleteById(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Usuario>) ResponseEntity.ok();
    }
}
