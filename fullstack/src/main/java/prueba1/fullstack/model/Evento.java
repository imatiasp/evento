package prueba1.fullstack.model;

public class Evento {
    private String nombre;
    private String tipo;
    private String fecha;
    private String ubicacion;
    private int capacidad;
    private Long id;

    public Evento() {}

    public Evento(Long id, String nombre, String tipo, String fecha, String ubicacion, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
    }
}
