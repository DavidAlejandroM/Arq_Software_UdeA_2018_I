/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.session;

import com.udea.entity.Venta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author alejandro
 */
@Local
public interface VentaManagerLocal {
    List<Venta> getAllLineas();

    Venta update(Venta venta);

    Venta delete(Venta venta);

    Venta insert(Venta venta);

    Venta findById(int id);      
}
