package com.desafio.digitalgradle.service;

import com.desafio.digitalgradle.model.Localidade;
import com.desafio.digitalgradle.repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadeService {

    @Autowired
    LocalidadeRepository localidadeRepository;

    public Localidade save(Localidade localidade){
        return localidadeRepository.save(localidade);
    }

    public Localidade update(Localidade localidade){
        return localidadeRepository.save(localidade);
    }

    public List<Localidade> findAll(){
        return localidadeRepository.findAll();
    }

    public Optional<Localidade> findById(Long localidade){
        return localidadeRepository.findById(localidade);
    }

    public void deleteById(Long localidade) {
        localidadeRepository.deleteById(localidade);
    }

}
