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
public class Bloque {
    private Formas forma;
    private Color color;
    private int posición;
    private int velocidad=1;

    public Bloque(Formas forma, Color color) {
        this.forma = forma;
        this.color = color;
    }

    public Bloque() {
    }

    public Formas getForma() {
        return forma;
    }

    public void setForma(Formas forma) {
        this.forma = forma;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPosición() {
        return posición;
    }

    public void setPosición(int posición) {
        this.posición = posición;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
}
