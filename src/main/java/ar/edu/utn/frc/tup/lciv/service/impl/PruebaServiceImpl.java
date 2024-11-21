package ar.edu.utn.frc.tup.lciv.service.impl;

import ar.edu.utn.frc.tup.lciv.entities.Prueba;
import ar.edu.utn.frc.tup.lciv.repository.PruebaRepository;
import ar.edu.utn.frc.tup.lciv.service.PruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PruebaServiceImpl implements PruebaService {
    @Autowired
    private PruebaRepository pruebaRepository;
    @Override
    public Prueba savePrueba(String descripcion) {
        Prueba prueba = new Prueba();
        prueba.setPruebaDescripcion(descripcion);
        return pruebaRepository.save(prueba);
    }

    @Override
    public List<Prueba> getAllPrueba() {
        return pruebaRepository.findAll();
    }
}
