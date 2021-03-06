package com.desafio.digitalgradle.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@Audited

@Entity

public class JornadaTrabalho {

    @Id
    @GeneratedValue
    private long id;
    private String describ;

}
