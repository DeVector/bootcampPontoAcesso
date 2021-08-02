package com.desafio.digitalgradle.service;

import com.desafio.digitalgradle.model.Empresa;
import com.desafio.digitalgradle.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository;

    public Empresa save(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public Empresa update(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    public Optional<Empresa> findById(Long empresa) {
        return empresaRepository.findById(empresa);
    }

    public void deleteById(Long empresa){
        empresaRepository.deleteById(empresa);
    }

}
