package dev.java10x.CadastroDeNinjas;

import jakarta.persistence.*;

// Entity ele transforma uma classe em entidade do BD
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro_ninja")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public NinjaModel() {
    }

    public Long getId() {
        return id;
    }

    public NinjaModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public NinjaModel setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public NinjaModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getIdade() {
        return idade;
    }

    public NinjaModel setIdade(int idade) {
        this.idade = idade;
        return this;
    }
}
