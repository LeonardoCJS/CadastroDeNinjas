package dev.java10x.CadastroDeNinjas.Missoes.Model;

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
    private Long id;
    private String nome;
    private String dificuldade;
    // @OneToMany - uma missao tem varios ninjas
    @OneToMany(mappedBy = "missao")
    private List<Ninja> ninjas;
}
