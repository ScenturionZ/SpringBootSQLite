package com.example.springbootsqlite.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "cliente")
public class Cliente {

    @Id
    //@GeneratedValue(strategy= GenerationType.IDENTITY) //NO FUNCIONA EN SQLITE
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_id_seq")
    @SequenceGenerator(name = "cliente_id_seq", sequenceName = "cliente_id_seq",  allocationSize=1)
    private Integer id;

    @Column(nullable = false, length = 255)
    private String razonSocial;

    @Column(nullable = false, length = 20)
    private String cuit;

    @Column(nullable = false, length = 255)
    private String mail;

}
