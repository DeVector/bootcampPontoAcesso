package com.desafio.digitalgradle.repository;

import com.desafio.digitalgradle.model.Movimentacao;
import com.desafio.digitalgradle.model.MovimentacaoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, MovimentacaoId> {
}
