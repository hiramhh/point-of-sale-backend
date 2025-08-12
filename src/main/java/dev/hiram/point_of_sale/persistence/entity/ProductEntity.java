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
    private String category;

    @Column(nullable = false, length = 200)
    private String description;

    private String image;

    //Maximo 7 caracteres
    // Mximo 2 decimales
    @Column(nullable = false,  precision = 7, scale = 2)
    private BigDecimal price;

    @Column(nullable = false, length = 200)
    private String title;

    // Agregar un fechamovto
    private LocalDate fechaCompra;

    // No debe ser nulleable
    // Debe de ser un numero maximo de 3 caracteres
    @Column(nullable = false, precision = 3)
    private Integer count;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCatogiry() {
        return category;
    }

    public void setCatogiry(String catogiry) {
        this.category = catogiry;
    }
}
