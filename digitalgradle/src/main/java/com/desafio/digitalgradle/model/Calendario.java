package com.desafio.digitalgradle.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Audited

@Entity

public class Calendario {

    @Id
    @GeneratedValue
    private long id;
    private String describ;
    private LocalDateTime dataEspecial;

    @ManyToOne
    private TipoData tipoData;

}
