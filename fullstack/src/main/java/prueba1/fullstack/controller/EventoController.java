package prueba1.fullstack.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import prueba1.fullstack.model.Evento;
import prueba1.fullstack.service.EventoService;
import java.util.List;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    @Autowired
    private EventoService service;

    @GetMapping
    public List<Evento> listar() {
        return service.listarEventos();
    }

    @PostMapping
    public Evento crear(@RequestBody Evento evento) {
        return service.crearEvento(evento);
    }

    @GetMapping("/{id}")
    public Evento obtener(@PathVariable Long id) {
        return service.obtenerEvento(id);
    }

    @PutMapping("/{id}")
    public Evento actualizar(@PathVariable Long id, @RequestBody Evento evento) {
        return service.actualizarEvento(id, evento);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminarEvento(id);
    }

    @GetMapping("/ordenados")
    public List<Evento> ordenar() {
        return service.ordenarPorFecha();
    }
}