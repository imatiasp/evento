package prueba1.fullstack.repository;

import org.springframework.stereotype.Repository;
import prueba1.fullstack.model.Evento;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EventoRepository {

    private List<Evento> listaEventos = new ArrayList<>();
    private Long contadorId = 1L;

    //Metodo que muestra todos los eventos guardados
    public List<Evento> obtenerTodos() {
        return listaEventos;
    }

    //Metodo que guarda un evento
    public Evento guardar(Evento evento){
        evento.setId(contadorId);
        contadorId++;
        listaEventos.add(evento);
        return evento;
    }

    //Metodo que busca por id
    public Evento buscarPorId(Long id){
        for (Evento e : listaEventos) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }

    //Metodo que elimina un evento por id
    public boolean eliminar(Long id){
        for (int i = 0; i < listaEventos.size(); i++) {
            if (listaEventos.get(i).getId().equals(id)){
                listaEventos.remove(i);
                return true;
            }
        }
        return false;
    }
}