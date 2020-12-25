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
    private ArrayList<Casilla> lista_tablero= new ArrayList<Casilla>();
    private ArrayList<Casilla> lista_fichas= new ArrayList<Casilla>();

    public ArrayList<Casilla> getLista_fichas() {
        return lista_fichas;
    }

    public void setLista_fichas(ArrayList<Casilla> lista_fichas) {
        this.lista_fichas = lista_fichas;
    }

    public Tablero() {
    }

    public ArrayList<Casilla> getLista_tablero() {
        return lista_tablero;
    }

    public void setLista_tablero(ArrayList<Casilla> lista_tablero) {
        this.lista_tablero = lista_tablero;
    }

    
    
    public void Agregar_Casilla (Casilla casilla){
        lista_tablero.add(casilla);
    }
    
    public Casilla Retorna_Casilla(int i){
        for (int j = 0; j < lista_tablero.size(); j++) {
            
            if (i==j){
               return lista_tablero.get(i); 
               
            }
                
            
        }
        System.out.println("No existe Casilla");
        return null;
    }

    @Override
    public String toString() {
        return "Tablero: " + "\nlista de casillas: " + lista_tablero;
    }
    
    
}
