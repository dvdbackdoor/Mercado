package br.com.senai.backend.sistema_mercado.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mercadoria")
public class Mercadoria {
    @Id
    @GeneratedValue(strategy=jakarta.persistence.GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "preco")
    private String preco;

    @Column(name = "nome")
    private String nome;

    @Column(name = "quantidade")
    private String quantidade;

    @Column(name = "categoria")
    private String categoria;

    public Mercadoria() {
    }

    public Mercadoria(Integer id, String preco, String nome, String quantidade, String categoria) {
        this.id = id;
        this.preco = preco;
        this.nome = nome;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    

}
