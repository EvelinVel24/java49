package com.edutecno.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FORMA_PAGO")
public class FormaDePago {
    @Id
    private int idFormaDePago;
    private String descripcion;
    private double recargo;

    // Getters y setters
    // Constructor vacío requerido por Hibernate
}
