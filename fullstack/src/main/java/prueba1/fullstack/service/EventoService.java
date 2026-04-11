package prueba1.fullstack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prueba1.fullstack.model.Evento;
import prueba1.fullstack.repository.EventoRepository;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class EventoService {

    @Autowired
    private EventoRepository repo;

    public List<Evento> listarEventos() {
        return repo.obtenerTodos();
    }

    //Metodo para crear un evento
    public Evento crearEvento(Evento evento) {
        if (evento.getNombre() == null || evento.getNombre().isEmpty()) {
            throw new RuntimeException("El nombre es obligatorio");
        }
        if (evento.getTipo() == null || evento.getTipo().isEmpty()) {
            throw new RuntimeException("El tipo es obligatorio");
        }
        if (evento.getFecha() == null || evento.getFecha().isEmpty()) {
            throw new RuntimeException("La fecha es obligatoria");
        }
        if (evento.getUbicacion() == null || evento.getUbicacion().isEmpty()) {
            throw new RuntimeException("La ubicacion es obligatoria");
        }
        if (evento.getTipo() == null || evento.getTipo().isEmpty()) {
            throw new RuntimeException("La tipo es obligatorio");
        }
        return repo.guardar(evento);
    }

    //Metodo para mostrar un evento por id
    public Evento obtenerEvento(Long id) {
        Evento evento = repo.buscarPorId(id);

        //Contencion de error
        if (evento == null) {
            throw new RuntimeException("Evento con ID " + id + " no fue encontrado");
        }
        return evento;
    }

    //Metodo para modificar un evento
    public Evento actualizarEvento(Long id, Evento nuevo){
        Evento evento = obtenerEvento(id);

        evento.setNombre(nuevo.getNombre());
        evento.setTipo(nuevo.getTipo());
        evento.setFecha(nuevo.getFecha());
        evento.setUbicacion(nuevo.getUbicacion());
        evento.setCapacidad(nuevo.getCapacidad());
        return evento;
    }

    //Metodo para eliminar un evento por id
    public void eliminarEvento(Long id) {
        boolean eliminado = repo.eliminar(id);
        if (!eliminado) {
            throw new RuntimeException("El evento no existe, no se puede eliminar.");
        }
    }

    //Metodo para ordenar por fecha los elementos
    public List<Evento> ordenarPorFecha(){

        List<Evento> lista = repo.obtenerTodos();

        Collections.sort(lista, new Comparator<Evento>() {
            @Override
            public int compare(Evento e1, Evento e2) {
                return e1.getFecha().compareTo(e2.getFecha());
            }
        });
        return lista;
    }
}