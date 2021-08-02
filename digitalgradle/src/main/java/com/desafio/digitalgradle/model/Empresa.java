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

public class Empresa {

    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String cnpj;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;

}
