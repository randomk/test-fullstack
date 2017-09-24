package com.test.model;

import com.sun.istack.internal.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Rodrigo Melgar on 24/09/17.
 */
@Entity
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "Campo nome não pode ser nulo")
    private String nome;

    @NotNull(message = "Campo email não pode ser nulo")
    private String email;

    @NotNull(message="Campo telefone não pode ser nulo")
    private String telefone;

    @NotNull(message="Campo sexo não pode ser nulo")
    private String sexo;

}
