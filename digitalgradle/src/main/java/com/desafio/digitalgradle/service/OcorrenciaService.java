package com.desafio.digitalgradle.service;

import com.desafio.digitalgradle.model.Ocorrencia;
import com.desafio.digitalgradle.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OcorrenciaService {

    @Autowired
    OcorrenciaRepository ocorrenciaRepository;

    public Ocorrencia save(Ocorrencia ocorrencia){
        return ocorrenciaRepository.save(ocorrencia);
    }

    public Ocorrencia update(Ocorrencia ocorrencia) {
        return ocorrenciaRepository.save(ocorrencia);
    }

    public List<Ocorrencia> findAll(){
        return ocorrenciaRepository.findAll();
    }

    public Optional<Ocorrencia> findById(Long id){
        return ocorrenciaRepository.findById(id);
    }

    public void deleteById(Long id) {
        ocorrenciaRepository.deleteById(id);
    }

}
