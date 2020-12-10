/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Gerson
 */
public class Contenedor {
    private ArrayList<Bloque> contenedor = new ArrayList<Bloque>();

    public Contenedor() {
    }

    public ArrayList<Bloque> getContenedor() {
        return contenedor;
    }

    public void setContenedor(ArrayList<Bloque> contenedor) {
        this.contenedor = contenedor;
    }
    
}
