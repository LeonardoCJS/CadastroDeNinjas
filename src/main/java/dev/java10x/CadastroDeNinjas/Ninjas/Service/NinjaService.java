package dev.java10x.CadastroDeNinjas.Ninjas.Service;

import dev.java10x.CadastroDeNinjas.Ninjas.Model.Ninja;
import dev.java10x.CadastroDeNinjas.Ninjas.Repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Listar todos os meus ninjas
    public List<Ninja> findAll() {
        return ninjaRepository.findAll();
    }

    // Listar ninjas por ID
    public Ninja findNinjaById(long id){
        Optional<Ninja> ninja = ninjaRepository.findById(id);
        return ninja.orElse(null);
    }
}
