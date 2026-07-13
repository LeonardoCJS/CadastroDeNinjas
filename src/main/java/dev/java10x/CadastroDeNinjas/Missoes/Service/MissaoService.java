package dev.java10x.CadastroDeNinjas.Missoes.Service;

import dev.java10x.CadastroDeNinjas.Missoes.DTO.MissaoDTO;
import dev.java10x.CadastroDeNinjas.Missoes.Mapper.MissaoMapper;
import dev.java10x.CadastroDeNinjas.Missoes.Model.Missao;
import dev.java10x.CadastroDeNinjas.Missoes.Repository.MissaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MissaoService {

    private MissaoRepository missaoRepository;
    private MissaoMapper missaoMapper;

    public MissaoService(MissaoRepository missaoRepository) {
        this.missaoRepository = missaoRepository;
    }

    // Listar todas as missoes
    public List<MissaoDTO> findAll() {
        List<Missao> missoes = missaoRepository.findAll();
        return missoes.stream()
                .map(missaoMapper::map)
                .collect(Collectors.toList());
    }

    // Listar missoes por ID
    public MissaoDTO findById(long id) {
        Optional<Missao> missao = missaoRepository.findById(id);
        return missao.map(missaoMapper::map).orElse(null);
    }

    // Criar uma nova missao
    public MissaoDTO create(MissaoDTO missaoDTO) {
        Missao missao = missaoMapper.map(missaoDTO);
        return missaoMapper.map(missaoRepository.save(missao));
    }

    // Deletar missao - Tem que ser um metodo void
    public void delete (long id) {
        missaoRepository.deleteById(id);
    }

    public MissaoDTO update(long id, MissaoDTO missaoDTO) {
        Optional<Missao> missao = missaoRepository.findById(id);
        if (missao.isPresent()) {
            Missao missaoUpdate = missaoMapper.map(missaoDTO);
            missaoUpdate.setId(id);
            return missaoMapper.map(missaoRepository.save(missaoUpdate));
        }
        return null;
    }
}
