package dev.java10x.CadastroDeNinjas.Ninjas.Mapper;

import dev.java10x.CadastroDeNinjas.Ninjas.DTO.NinjaDTO;
import dev.java10x.CadastroDeNinjas.Ninjas.Model.Ninja;
import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

    public Ninja map(NinjaDTO ninjaDTO) {
        Ninja ninja = new Ninja();
        ninja.setId(ninjaDTO.getId());
        ninja.setNome(ninjaDTO.getNome());
        ninja.setEmail(ninjaDTO.getEmail());
        ninja.setImgUrl(ninjaDTO.getImgUrl());
        ninja.setRank(ninjaDTO.getRank());
        ninja.setIdade(ninjaDTO.getIdade());
        ninja.setMissao(ninjaDTO.getMissao());
        return ninja;
    }

    public NinjaDTO map(Ninja ninja) {
        NinjaDTO ninjaDTO = new NinjaDTO();
        ninjaDTO.setId(ninja.getId());
        ninjaDTO.setNome(ninja.getNome());
        ninjaDTO.setEmail(ninja.getEmail());
        ninjaDTO.setImgUrl(ninja.getImgUrl());
        ninjaDTO.setRank(ninja.getRank());
        ninjaDTO.setIdade(ninja.getIdade());
        ninjaDTO.setMissao(ninja.getMissao());
        return ninjaDTO;
    }
}
