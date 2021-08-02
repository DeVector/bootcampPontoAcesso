package com.desafio.digitalgradle.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@Audited

@Entity

public class Localidade {

    @Id
    @GeneratedValue
    private long id;
    private String describ;

    @ManyToOne
    private NivelAcesso nivelAcesso;

}
