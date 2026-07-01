package dev.java10x.CadastroDeNinjas.Ninjas.Controller;

import dev.java10x.CadastroDeNinjas.Ninjas.Model.Ninja;
import dev.java10x.CadastroDeNinjas.Ninjas.Service.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

    // Adicinar ninja (CREATE)
    @PostMapping("/save")
    public Ninja save(@RequestBody Ninja ninja) {
        return ninjaService.save(ninja);
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/findall")
    public List<Ninja> findAll() {
        return ninjaService.findAll();
    }

    // Procurar ninja por Id (READ)
    @GetMapping("/findbyID/{id}")
    public Ninja findById(@PathVariable long id) {
        return ninjaService.findById(id);
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/update")
    public String updateNinja(@RequestBody Ninja ninja) {
        return "Ninja foi atualizado com sucesso";
    }

    // Deletar ninja (DELETE)
    @DeleteMapping("/delete")
    public String deleteNinja(@RequestParam int id) {
        return "Ninja foi deletado com sucesso";
    }
}
