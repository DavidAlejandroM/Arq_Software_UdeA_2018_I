/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.controller;

import com.udea.entity.TipoAutomovil;
import com.udea.session.TipoAutomovilManagerLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author alejandro
 */
@Named(value = "tipoAutomovilMBean")
@SessionScoped
public class TipoAutomovilMBean implements Serializable{

    @EJB
    private TipoAutomovilManagerLocal tipoAutomovilManager;

    private TipoAutomovil tipoAutomovil;
    private List<TipoAutomovil> tipoAutomoviles;
    
    public List<TipoAutomovil> getTipoAutomovils(){
        if (tipoAutomoviles == null || tipoAutomoviles.isEmpty())
            refresh();
            return tipoAutomoviles;
        
    }
    public TipoAutomovil getTipoAutomovil(){
        return tipoAutomovil;
    }
    
    public TipoAutomovilMBean() {
    }

    private void refresh() {
        tipoAutomoviles = tipoAutomovilManager.getAllTipos();
    }
    
    public String showDetails(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
        return "DETAILS"; // Permite enlazar a CustomerDetails.xml 
    }
    
    /**
    * Action handler - Actualiza el modelo Customer en la BD.
    * Se llama cuando se presiona el boton update del formulario
    * @return
    */
    public String update() {
        System.out.println("###UPDATE###");
        tipoAutomovil = tipoAutomovilManager.update(tipoAutomovil);
        return "SAVED"; // Para el caso navegacional
    }
    /**
    * Action handler - returno hacia la vista de la lista de clientes
    * @return
    */
    public String list() {
        System.out.println("###LIST###");
        return "LIST";
    }
    
    
}
