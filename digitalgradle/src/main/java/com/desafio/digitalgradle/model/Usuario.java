package com.desafio.digitalgradle.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Audited

@Entity

public class Usuario {

    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private BigDecimal tolerancia;
    private LocalDateTime hrEntrada;
    private LocalDateTime hrSaida;

    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    @ManyToOne
    private Empresa empresa;
    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;
    @ManyToOne
    private NivelAcesso nivelAcesso;

}
