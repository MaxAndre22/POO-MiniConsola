/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Casilla;
import Modelo.Tablero;
import Vista.Vista;
import Control.Servidor;
import java.awt.Image;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Gerson
 */
public class Consola_Conecta_4 {
    private Tablero tablero;
    //private Vista vista;
    Servidor servidor;
   
   

    public Consola_Conecta_4(Tablero tablero) {
        this.tablero = tablero;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Consola_Conecta_4() {
        this.tablero=new Tablero();
        servidor.startServer();
    }
    
    public void Jugar_Turno (){
        
        
        
    }
        
    }