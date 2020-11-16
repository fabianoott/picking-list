/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Fabiano
 */
@Entity
@Table(name = "Usuario")
public class Usuario{
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private long id;
    
    @Column(name = "permissao", nullable = false)
    private int permissao;
    
    @Column(name = "nome", nullable = false)
    private String nome;
    
    @Column(name = "senha", nullable = false)
    private String senha;
    
    @Column(name = "login", nullable = false)
    private String login;
    
    @Column(name = "email", nullable = false)
    private String email;
    
    
    
}
