package com.desafio.digitalgradle.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
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

public class Movimentacao {

    @EmbeddedId
    private MovimentacaoId id;
    private LocalDateTime dtEntrada;
    private LocalDateTime dtSaida;
    private BigDecimal periodo;
    @ManyToOne
    private Ocorrencia ocorrencia;
    @ManyToOne
    private Calendario calendario;

}
