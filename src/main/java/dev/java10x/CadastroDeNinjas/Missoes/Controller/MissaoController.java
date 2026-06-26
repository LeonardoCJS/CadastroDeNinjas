package dev.java10x.CadastroDeNinjas.Missoes.Controller;

import dev.java10x.CadastroDeNinjas.Ninjas.Model.Ninja;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missao")
public class MissaoController {
    // Adicinar missao (CREATE)
    @PostMapping("/create")
    public String createMissao() {
        return "Missão foi criada com sucesso";
    }

    // Mostrar todos os missoes (READ)
    @GetMapping("/all")
    public String allMissoes() {
        return "Mostrar todos as missões";
    }

    // Procurar missao por Id (READ)
    @GetMapping("/findbyID")
    public String findByIdMissao(@RequestParam int id) {
        return "Mostrar Missão por ID";
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
