package dev.java10x.CadastroDeNinjas.Missoes.Model;

import dev.java10x.CadastroDeNinjas.Ninjas.Model.Ninja;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "missao")
public class Missao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    public Missao(String nome, String dificuldade) {
        this.nome = nome;
        this.dificuldade = dificuldade;
    }

    public Missao() {

    }

    public Long getId() {
        return id;
    }

    public Missao setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Missao setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public Missao setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
        return this;
    }

    // @OneToMany - uma missao tem varios ninjas
    @OneToMany(mappedBy = "missao")
    private List<Ninja> ninjas;
}
