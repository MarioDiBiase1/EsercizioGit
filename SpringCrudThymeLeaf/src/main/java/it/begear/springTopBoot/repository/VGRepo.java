package it.begear.springTopBoot.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.begear.springTopBoot.entities.Videogioco;

@Repository
public interface VGRepo extends JpaRepository<Videogioco, Long> {
    List<Videogioco> findVideogiocoByGenere(String genere);
}
