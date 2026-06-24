package dev.java10x.CadastroDeNinjas.Ninjas.Repository;

import dev.java10x.CadastroDeNinjas.Ninjas.Model.Ninja;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface NinjaRepository extends JpaRepositoryImplementation<Ninja, Long> {
}
