package com.desafio.digitalgradle.service;

import com.desafio.digitalgradle.model.Movimentacao;
import com.desafio.digitalgradle.model.MovimentacaoId;
import com.desafio.digitalgradle.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {

    @Autowired
    MovimentacaoRepository movimentacaoRepository;

    public Movimentacao save(Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }

    public Movimentacao update(Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }

    public List<Movimentacao> findAll(){
        return movimentacaoRepository.findAll();
    }

    public Optional<Movimentacao> findById(MovimentacaoId movimentacaoId) {
        return movimentacaoRepository.findById(movimentacaoId);
    }

    public void deleteById(MovimentacaoId movimentacaoId) {
        movimentacaoRepository.deleteById(movimentacaoId);
    }


}
