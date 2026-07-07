package dev.java10x.CadastroDeNinjas.Missoes.Controller;

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
    public String createMissao() {
        return "Missão foi criada com sucesso";
    }

    // Mostrar todos os missoes (READ)
    @GetMapping("/findall")
    public List<Missao> findAll() {
        return missaoService.findAll();
    }

    // Procurar missao por Id (READ)
    @GetMapping("/findbyID/{id}")
    public Missao findByIdMissao(@PathVariable long id) {
        return missaoService.findById(id);
    }

    // Alterar dados das missoes (UPDATE)
    @PutMapping("/update")
    public String updateMissoes(@RequestBody Ninja ninja) {
        return "Missão foi atualizada com sucesso";
    }

    // Deletar missao (DELETE)
    @DeleteMapping("/delete")
    public String deleteMissao(@RequestParam int id) {
        return "Missão foi deletada com sucesso";
    }
}
