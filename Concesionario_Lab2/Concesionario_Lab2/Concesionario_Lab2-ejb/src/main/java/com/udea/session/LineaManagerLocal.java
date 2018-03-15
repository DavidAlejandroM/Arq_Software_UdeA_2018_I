/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.session;

import com.udea.entity.Linea;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author alejandro
 */
@Local
public interface LineaManagerLocal {

    List<Linea> getAllLineas();

    Linea update(Linea linea);

    Linea delete(Linea linea);

    Linea insert(Linea linea);

    Linea findById(int id);
    
}
