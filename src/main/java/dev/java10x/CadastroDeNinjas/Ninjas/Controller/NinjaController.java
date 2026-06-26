package dev.java10x.CadastroDeNinjas.Ninjas.Controller;

import dev.java10x.CadastroDeNinjas.Ninjas.Model.Ninja;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

    // Adicinar ninja (CREATE)
    @PostMapping("/create")
    public String createNinja() {
        return "Ninja foi criada com sucesso";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/all")
    public String allNinjas() {
        return "Mostrar todos os ninjas";
    }

    // Procurar ninja por Id (READ)
    @GetMapping("/findbyID")
    public String findByIdNinja(@RequestParam int id) {
        return "Mostrar ninja por ID";
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
