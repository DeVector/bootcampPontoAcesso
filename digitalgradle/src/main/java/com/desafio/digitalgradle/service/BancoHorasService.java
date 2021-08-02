package com.desafio.digitalgradle.service;

import com.desafio.digitalgradle.model.BancoHoras;
import com.desafio.digitalgradle.model.BancoHorasId;
import com.desafio.digitalgradle.repository.BancoHorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {

    @Autowired
    BancoHorasRepository bancoHorasRepository;

    public BancoHoras save(BancoHoras bancoHoras) {
        return bancoHorasRepository.save(bancoHoras);
    }

    public BancoHoras update(BancoHoras bancoHoras) {
        return bancoHorasRepository.save(bancoHoras);
    }

    public List<BancoHoras> findAll() {
        return bancoHorasRepository.findAll();
    }

    public Optional<BancoHoras> getById(BancoHorasId idBancoHoras) {
        return bancoHorasRepository.findById(idBancoHoras);
    }

    public void deleteById(BancoHorasId idBancoHoras){
        bancoHorasRepository.deleteById(idBancoHoras);
    }
}
