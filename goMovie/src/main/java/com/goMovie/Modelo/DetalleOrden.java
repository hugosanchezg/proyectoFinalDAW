package com.goMovie.Modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detalles")
public class DetalleOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private int cantidad;
    private double precio;
    private double total;
    private String foto;

    @ManyToOne
    private Orden orden;

    @ManyToOne
    private Pelicula pelicula;

    public DetalleOrden() {

    }
    public DetalleOrden(Integer id, String nombre, int cantidad, double precio, double total) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
    }
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }


    public Orden getOrden() {
        return orden;
    }
    public void setOrden(Orden orden) {
        this.orden = orden;
    }
    public Pelicula getPelicula() {
        return pelicula;
    }
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    @Override
    public String toString() {
        return "DetalleOrden [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio
                + ", total=" + total + ", foto=" + foto + ", orden=" + orden + ", pelicula=" + pelicula + "]";
    }

}
