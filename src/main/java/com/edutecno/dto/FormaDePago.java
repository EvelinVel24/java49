package com.edutecno.dto;

import javax.persistence.*;

@Entity
@Table(name = "FORMA_PAGO")
public class FormaDePago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FORMA_PAGO")
    private int idFormaDePago;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "RECARGA")
    private String recarga;

    public int getIdFormaDePago() {
        return idFormaDePago;
    }

    public void setIdFormaDePago(int idFormaDePago) {
        this.idFormaDePago = idFormaDePago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRecarga() {
        return recarga;
    }

    public void setRecarga(String recarga) {
        this.recarga = recarga;
    }
}
