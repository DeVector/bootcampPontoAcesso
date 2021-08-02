package com.desafio.digitalgradle.service;

import com.desafio.digitalgradle.model.JornadaTrabalho;
import com.desafio.digitalgradle.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class JornadaTrabalhoService {

    @Autowired
    JornadaTrabalhoRepository jornadaTrabalhoRepository;

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return jornadaTrabalhoRepository.findAll();
    }

    public Optional<JornadaTrabalho> findById(Long jornadaId){
        return jornadaTrabalhoRepository.findById(jornadaId);
    }

    public void deleteById(Long jornadaId){
        jornadaTrabalhoRepository.deleteById(jornadaId);
    }

}
