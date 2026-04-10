package prueba1.fullstack.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Evento {
    private String nombre;
    private String tipo;
    private String fecha;
    private String ubicacion;
    private int capacidad;
    private Long id;

    public Evento() {}
}