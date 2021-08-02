package com.desafio.digitalgradle.repository;

import com.desafio.digitalgradle.model.BancoHoras;
import com.desafio.digitalgradle.model.BancoHorasId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BancoHorasRepository extends JpaRepository<BancoHoras, BancoHorasId> {

}
