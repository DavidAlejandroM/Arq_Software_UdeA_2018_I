/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.session;

import com.udea.entity.Factura;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author alejandro
 */
@Stateless
public class FacturaManager implements FacturaManagerLocal {

    @PersistenceContext(unitName = "com.udea_Concesionario_Lab2-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;

    @Override
    public List<Factura> getAllFacturas() {
        Query query = em.createNamedQuery("Factura.findAll");
        return query.getResultList();
    }

    @Override
    public Factura update(Factura factura) {
        return null;
    }

    @Override
    public Factura delete(Factura factura) {
        return null;
    }

    @Override
    public Factura insert(Factura factura) {
        return null;
    }

    @Override
    public Factura findByNumeroFactura(int numeroFactura) {
        return null;
    }

    public void persist(Object object) {
        try {
            utx.begin();
            em.persist(object);
            utx.commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }

    
}
