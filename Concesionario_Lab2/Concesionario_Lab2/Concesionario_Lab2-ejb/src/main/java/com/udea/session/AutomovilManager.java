/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.session;

import com.udea.entity.Automovil;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author alejandro
 */
@Stateless
public class AutomovilManager implements AutomovilManagerLocal {
    
    @Override
    public List<Automovil> getAllAutomoviles() {
        return null;
    }
    
    @Override
    public Automovil update(Automovil automovil) {
        return null;
    }

    @Override
    public Automovil insert(Automovil automovil) {
        return null;
    }

    @Override
    public Automovil delete(Automovil automovil) {
        return null;
    }

    @Override
    public Automovil findById(int id) {
        return null;
    }
    
}
