package dev.java10x.CadastroDeNinjas.Ninjas.Model;

import dev.java10x.CadastroDeNinjas.Missoes.Model.Missao;
import jakarta.persistence.*;

import java.util.List;

// Entity ele transforma uma classe em entidade do BD
// JPA = Java Persistence API
@Entity
@Table(name = "ninja")
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    public Ninja(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public Ninja() {
    }

    public Long getId() {
        return id;
    }

    public Ninja setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Ninja setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Ninja setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getIdade() {
        return idade;
    }

    public Ninja setIdade(int idade) {
        this.idade = idade;
        return this;
    }

    // @ManyToOne - um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missao_id") // Forain Key ou chave estrangeira
    private Missao missao;
}
