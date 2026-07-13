package dev.java10x.CadastroDeNinjas.Missoes.Mapper;

import dev.java10x.CadastroDeNinjas.Missoes.DTO.MissaoDTO;
import dev.java10x.CadastroDeNinjas.Missoes.Model.Missao;
import org.springframework.stereotype.Component;

@Component
public class MissaoMapper {

    public Missao map(MissaoDTO missaoDTO) {
        Missao missao = new Missao();
        missao.setId(missaoDTO.getId());
        missao.setNome(missaoDTO.getNome());
        missao.setDificuldade(missaoDTO.getDificuldade());
        missao.setNinjas(missaoDTO.getNinjas());
        return missao;
    }

    public MissaoDTO map(Missao missao) {
        MissaoDTO missaoDTO = new MissaoDTO();
        missaoDTO.setId(missao.getId());
        missaoDTO.setNome(missao.getNome());
        missaoDTO.setDificuldade(missao.getDificuldade());
        missaoDTO.setNinjas(missao.getNinjas());
        return missaoDTO;
    }
}
