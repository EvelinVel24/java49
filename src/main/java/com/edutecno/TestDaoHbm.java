package com.edutecno;

import org.hibernate.Session;

public class TestDaoHbm {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        FormaDePago formaDePago = new FormaDePago();
        formaDePago.setDescripcion("Pago con tarjeta de crédito");
        formaDePago.setRecarga("5.0%");

        session.save(formaDePago);
        session.getTransaction().commit();
        session.close();

        System.out.println("Forma de pago insertada con éxito: " + formaDePago.getIdFormaDePago());
    }
}
