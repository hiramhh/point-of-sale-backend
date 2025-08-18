package dev.hiram.point_of_sale.persistence.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "store")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //No debe ser nulleable
    // debe tener un maximo de 150
    // debe ser un dato unico
    @Column(nullable = false, length = 150, unique = true)
    private String categoria;

    // No debe ser nulleable
    // Debe de ser un numero maximo de 3 caracteres
    @Column(nullable = false, precision = 3)
    private Integer existencia;


    @Column(nullable = false, length = 200)
    private String descripcion;

    @Column(nullable = false)
    private String imagen;

    //Maximo 7 caracteres
    // Mximo 2 decimales
    @Column(nullable = false,  precision = 7, scale = 2)
    private BigDecimal precio;

    @Column(nullable = false, length = 200)
    private String titulo;


    // Agregar un fechamovto
    @Column(nullable = false)
    private LocalDate fechaCompra;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

}
