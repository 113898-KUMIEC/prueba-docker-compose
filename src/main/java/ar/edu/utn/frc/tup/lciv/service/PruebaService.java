package ar.edu.utn.frc.tup.lciv.service;

import ar.edu.utn.frc.tup.lciv.entities.Prueba;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PruebaService {
    Prueba savePrueba(String descripcion);
    List<Prueba> getAllPrueba();
}
