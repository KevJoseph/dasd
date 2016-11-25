/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.NuevoPersonal;
import vista.Vista;

/**
 *
 * @author UNDC-USI
 */
public class Controlador implements ActionListener{
    
    private Modelo modelo;
    private Vista vista;
    private NuevoPersonal np = new NuevoPersonal();
    
    public Controlador(Modelo modelo,Vista vprincipal) {
        this.modelo = modelo;
        this.vista = vprincipal;
        this.vista.btnNuevoPersonal.addActionListener(this);
    }
    
    public void inicio(){
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(vista.btnNuevoPersonal == e.getSource()){
            vista.escritorio.add(np); // Agregando al componente desktopk de la vista Principal 
            np.show(); // Haciendo visible el formulario Nuevo personal
        }
    }
    
    public NuevoPersonal getNuevoPersonal(){
        return this.np;
    }
    
    
}
