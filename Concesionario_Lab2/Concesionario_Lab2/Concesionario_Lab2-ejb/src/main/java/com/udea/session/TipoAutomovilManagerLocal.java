/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.session;

import com.udea.entity.TipoAutomovil;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author alejandro
 */
@Local
public interface TipoAutomovilManagerLocal {
    
    List<TipoAutomovil> getAllTipos();

    TipoAutomovil update(TipoAutomovil tipoAutomovil);

    TipoAutomovil delete(TipoAutomovil tipoAutomovil);

    TipoAutomovil insert(TipoAutomovil tipoAutomovil);

    TipoAutomovil findById(int id);   
}
