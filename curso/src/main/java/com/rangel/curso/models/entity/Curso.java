package com.rangel.curso.models.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nombre;
    @Column(name="create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
    @PrePersist
    private void prePersist(){
        this.createAt = new Date();
    }

    public Curso(Long id, String nombre, Date createAt) {
        Id = id;
        this.nombre = nombre;
        this.createAt = createAt;
    }

    public Curso(){
        // Contructor Vacio
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Id=" + Id +
                ", nombre='" + nombre + '\'' +
                ", createAt=" + createAt +
                '}';
    }
}
