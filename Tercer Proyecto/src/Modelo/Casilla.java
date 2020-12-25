/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Gerson
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Casilla {
    private JLabel lblcasilla;

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }
    private Ficha ficha;
    

    public Casilla() {
        
        this.lblcasilla=new JLabel("");
        this.ficha=null;
        this.lblcasilla.setOpaque(true);
       
        
    }
    
    public Casilla(int i) {
        
        this.lblcasilla=new JLabel(i+"");
       
        this.lblcasilla.setOpaque(true);
       
       
    }
    
    public Casilla(JLabel lblcasilla, java.awt.Color color) {
        this.lblcasilla = lblcasilla;
     ;
     
    }

    public JLabel getLblcasilla() {
        return lblcasilla;
    }

    public void setLblcasilla(JLabel lblcasilla) {
        this.lblcasilla = lblcasilla;
    }
    
    public void set_texto_Lblcasilla(String lblcasilla) {
        this.lblcasilla.setText(lblcasilla);
    }

  

  
    

    @Override
    public String toString() {
        return lblcasilla.getText();
    }

    private void lblcasilla(java.awt.event.MouseEvent evt){
        System.out.println(this.toString());
    }
    
    
    
}
