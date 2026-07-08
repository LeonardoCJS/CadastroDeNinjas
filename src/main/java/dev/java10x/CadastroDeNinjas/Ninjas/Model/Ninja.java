package dev.java10x.CadastroDeNinjas.Ninjas.Model;

import dev.java10x.CadastroDeNinjas.Missoes.Model.Missao;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

// Entity ele transforma uma classe em entidade do BD
// JPA = Java Persistence API
@Entity
@Table(name = "ninja")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "img_url")
    private String imgUrl;
    @Column(name = "rank")
    private String rank;
    @Column(name = "idade")
    private int idade;
    // @ManyToOne - um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missao_id") // Forain Key ou chave estrangeira
    private Missao missao;
}
