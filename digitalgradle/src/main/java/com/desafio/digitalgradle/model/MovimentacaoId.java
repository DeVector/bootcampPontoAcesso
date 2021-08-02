package com.desafio.digitalgradle.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable

public class MovimentacaoId implements Serializable {

    @GeneratedValue
    private long movimentaId;
    private long usuarioid;

}
