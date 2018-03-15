/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.session;

import com.udea.entity.Factura;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author alejandro
 */
@Local
public interface FacturaManagerLocal {

    List<Factura> getAllFacturas();

    Factura update(Factura factura);

    Factura delete(Factura factura);

    Factura insert(Factura factura);

    Factura findByNumeroFactura(int numeroFactura);
    
}
