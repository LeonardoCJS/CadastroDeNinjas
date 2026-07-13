package dev.java10x.CadastroDeNinjas.Missoes.Controller;

import dev.java10x.CadastroDeNinjas.Missoes.DTO.MissaoDTO;
import dev.java10x.CadastroDeNinjas.Missoes.Model.Missao;
import dev.java10x.CadastroDeNinjas.Missoes.Repository.MissaoRepository;
import dev.java10x.CadastroDeNinjas.Missoes.Service.MissaoService;
import dev.java10x.CadastroDeNinjas.Ninjas.Model.Ninja;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missao")
public class MissaoController {

    @Autowired
    private MissaoService missaoService;

    // Adicinar missao (CREATE)
    @PostMapping("/create")
    public MissaoDTO create(@RequestBody MissaoDTO missaoDTO) {
        return missaoService.create(missaoDTO);
    }

    // Mostrar todos os missoes (READ)
    @GetMapping("/findall")
    public List<MissaoDTO> findAll() {
        return missaoService.findAll();
    }

    // Procurar missao por Id (READ)
    @GetMapping("/findbyID/{id}")
    public MissaoDTO findById(@PathVariable long id) {
        return missaoService.findById(id);
    }

    // Alterar dados das missoes (UPDATE)
    @PutMapping("/update/{id}")
    public MissaoDTO update(@PathVariable long id, @RequestBody MissaoDTO missaoDTO) {
        return missaoService.update(id, missaoDTO);
    }

    // Deletar missao (DELETE)
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        missaoService.delete(id);
    }
}
