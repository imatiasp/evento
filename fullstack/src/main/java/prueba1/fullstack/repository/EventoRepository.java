package prueba1.fullstack.repository;


import org.springframework.stereotype.Repository;
import prueba1.fullstack.model.Evento;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EventoRepository {

    //Arreglo que guardara todos los eventos
    private List<Evento> listaEventos = new ArrayList<>();

    //Metodo que retorna todos los eventos
    public List<Evento> getlistaEventos() {
        return listaEventos;
    }

    //Metodo para guardar eventos
    public void guardar(Evento evento){
        listaEventos.add(evento);
    }
}
