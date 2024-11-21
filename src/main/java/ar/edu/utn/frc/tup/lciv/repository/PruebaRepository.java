package ar.edu.utn.frc.tup.lciv.repository;

import ar.edu.utn.frc.tup.lciv.entities.Prueba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface PruebaRepository extends JpaRepository<Prueba, Long> {
}
