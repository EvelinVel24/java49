package com.edutecno;

import com.edutecno.dto.FormaDePago;
import com.edutecno.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestDaoHbm {
    public static void main(String[] args) {
        FormaDePago formaPago = new FormaDePago();
        formaPago.setIdFormaDePago(1);
        formaPago.setDescripcion("Tarjeta de crédito");
        formaPago.setRecargo(5.0);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        
        session.save(formaPago);
        
        tx.commit();
        session.close();
        
        HibernateUtil.shutdown();
    }
}
