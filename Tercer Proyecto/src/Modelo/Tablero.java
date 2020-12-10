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
public class Tablero {
    private ArrayList<Casilla> tablero= new ArrayList<Casilla>();

    public Tablero() {
    }

    public ArrayList<Casilla> getTablero() {
        return tablero;
    }

    public void setTablero(ArrayList<Casilla> tablero) {
        this.tablero = tablero;
    }
    
    
    
}
