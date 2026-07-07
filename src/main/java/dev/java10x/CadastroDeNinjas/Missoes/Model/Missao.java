package dev.java10x.CadastroDeNinjas.Missoes.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.CadastroDeNinjas.Ninjas.Model.Ninja;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "missao")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Missao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "dificuldade")
    private String dificuldade;
    // @OneToMany - uma missao tem varios ninjas
    @OneToMany(mappedBy = "missao")
    @JsonIgnore
    private List<Ninja> ninjas;
}
