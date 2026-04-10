package prueba1.fullstack.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prueba1.fullstack.model.Evento;
import prueba1.fullstack.repository.EventoRepository;

import java.util.List;

@Service
public class EventoService {

    @Autowired
    private EventoRepository repo;

    public List<Evento> listarEventos() {
        return
    }
}
