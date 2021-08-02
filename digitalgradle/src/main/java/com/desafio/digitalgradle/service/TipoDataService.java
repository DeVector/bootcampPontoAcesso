package com.desafio.digitalgradle.service;

import com.desafio.digitalgradle.model.TipoData;
import com.desafio.digitalgradle.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDataService {

    @Autowired
    TipoDataRepository tipoDataRepository;

    public TipoData save(TipoData tipoData) {
        return tipoDataRepository.save(tipoData);
    }

    public TipoData update(TipoData tipoData){
        return tipoDataRepository.save(tipoData);
    }

    public List<TipoData> findAll() {
        return tipoDataRepository.findAll();
    }

    public Optional<TipoData> findById(Long id) {
        return tipoDataRepository.findById(id);
    }

    public void deleteById(Long id) {
        tipoDataRepository.deleteById(id);
    }
}
