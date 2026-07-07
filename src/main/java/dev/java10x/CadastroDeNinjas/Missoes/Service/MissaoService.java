package dev.java10x.CadastroDeNinjas.Missoes.Service;

import dev.java10x.CadastroDeNinjas.Missoes.Model.Missao;
import dev.java10x.CadastroDeNinjas.Missoes.Repository.MissaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissaoService {

    private MissaoRepository missaoRepository;

    public MissaoService(MissaoRepository missaoRepository) {
        this.missaoRepository = missaoRepository;
    }

    // Listar todas as missoes
    public List<Missao> findAll() {
        return missaoRepository.findAll();
    }

    // Listar missoes por ID
    public Missao findById(long id) {
        Optional<Missao> missao = missaoRepository.findById(id);
        return missao.orElse(null);
    }
}
