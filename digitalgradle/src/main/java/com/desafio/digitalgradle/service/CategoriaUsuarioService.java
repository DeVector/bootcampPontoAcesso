package com.desafio.digitalgradle.service;

import com.desafio.digitalgradle.model.CategoriaUsuario;
import com.desafio.digitalgradle.repository.CategoriaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaUsuarioService {

    @Autowired
    CategoriaUsuarioRepository categoriaUsuarioRepository;


    public CategoriaUsuario save(CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    public CategoriaUsuario update(CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    public List<CategoriaUsuario> findAll() {
        return categoriaUsuarioRepository.findAll();
    }

    public Optional<CategoriaUsuario> getById(Long idCategoria) {
        return categoriaUsuarioRepository.findById(idCategoria);
    }

    public void deleteJById(Long idCategoria) {
        categoriaUsuarioRepository.deleteById(idCategoria);
    }
}
