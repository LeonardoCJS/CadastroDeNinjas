package dev.java10x.CadastroDeNinjas.Missoes.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.CadastroDeNinjas.Ninjas.Model.Ninja;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MissaoDTO {
    private Long id;
    private String nome;
    private String dificuldade;
    private List<Ninja> ninjas;
}
