package dev.java10x.CadastroDeNinjas.Ninjas.Controller;

import dev.java10x.CadastroDeNinjas.Ninjas.DTO.NinjaDTO;
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
    @PostMapping("/create")
    public NinjaDTO create(@RequestBody NinjaDTO ninjaDTO) {
        return ninjaService.create(ninjaDTO);
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/findall")
    public List<NinjaDTO> findAll() {
        return ninjaService.findAll();
    }

    // Procurar ninja por Id (READ)
    @GetMapping("/findbyID/{id}")
    public NinjaDTO findById(@PathVariable long id) {
        return ninjaService.findById(id);
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/update/{id}")
    public NinjaDTO update(@PathVariable long id, @RequestBody NinjaDTO ninjaDTO) {
        return ninjaService.updade(id, ninjaDTO);
    }

    // Deletar ninja (DELETE)
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        ninjaService.delete(id);
    }
}
