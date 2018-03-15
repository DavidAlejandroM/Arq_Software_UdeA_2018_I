/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.session;

import com.udea.entity.Marca;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author alejandro
 */
@Local
public interface MarcaManagerLocal {
    
    List<Marca> getAllLineas();

    Marca update(Marca marca);

    Marca delete(Marca marca);

    Marca insert(Marca marca);

    Marca findById(int id);
}
