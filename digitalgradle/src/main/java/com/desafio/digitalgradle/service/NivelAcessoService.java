package com.desafio.digitalgradle.service;

import com.desafio.digitalgradle.model.NivelAcesso;
import com.desafio.digitalgradle.repository.NivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {

    @Autowired
    NivelAcessoRepository nivelAcessoRepository;

    public NivelAcesso save(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public NivelAcesso update(NivelAcesso nivelAcesso) {
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public List<NivelAcesso> findAll() {
        return nivelAcessoRepository.findAll();
    }

    public Optional<NivelAcesso> findById(Long nivelId) {
        return nivelAcessoRepository.findById(nivelId);
    }

    public void deleteById(Long nivelId){
        nivelAcessoRepository.deleteById(nivelId);
    }
}
