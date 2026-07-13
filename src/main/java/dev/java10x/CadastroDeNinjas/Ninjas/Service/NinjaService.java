package dev.java10x.CadastroDeNinjas.Ninjas.Service;

import dev.java10x.CadastroDeNinjas.Ninjas.DTO.NinjaDTO;
import dev.java10x.CadastroDeNinjas.Ninjas.Mapper.NinjaMapper;
import dev.java10x.CadastroDeNinjas.Ninjas.Model.Ninja;
import dev.java10x.CadastroDeNinjas.Ninjas.Repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository,  NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    // Listar todos os meus ninjas
    public List<NinjaDTO> findAll() {
        List<Ninja> ninjas = ninjaRepository.findAll();
        return ninjas.stream()
                .map(ninjaMapper::map)
                .collect(Collectors.toList());
    }

    // Listar ninjas por ID
    public NinjaDTO findById(long id){
        Optional<Ninja> ninja = ninjaRepository.findById(id);
        return ninja.map(ninjaMapper::map).orElse(null);
    }

    // Criar um novo ninja
    public NinjaDTO create(NinjaDTO ninjaDTO) {
        Ninja ninja = ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
    }

    // Deletar ninja - Tem que ser um metodo void
    public void delete (long id) {
        ninjaRepository.deleteById(id);
    }

    // Atualizar ninja
    public NinjaDTO updade(long id, NinjaDTO ninjaDTO) {
        Optional<Ninja> ninja = ninjaRepository.findById(id);
        if (ninja.isPresent()) {
            Ninja ninjaUpdate = ninjaMapper.map(ninjaDTO);
            ninjaUpdate.setId(id);
            return ninjaMapper.map(ninjaRepository.save(ninjaUpdate));
        }
        return null;
    }
}
