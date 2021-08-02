package com.desafio.digitalgradle.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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

public class BancoHoras {

    @EmbeddedId
    private BancoHorasId id;
    private LocalDateTime dtTrabalho;
    private BigDecimal qtHorasTrabalho;
    private BigDecimal saldoHoras;

}
