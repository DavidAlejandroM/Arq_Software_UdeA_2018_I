/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.session;

import com.udea.entity.Factura;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author alejandro
 */
@Stateless
public class FacturaManager implements FacturaManagerLocal {

    @Override
    public List<Factura> getAllFacturas() {
        return null;
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

    
}
