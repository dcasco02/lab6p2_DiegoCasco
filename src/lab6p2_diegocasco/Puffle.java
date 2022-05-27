/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_diegocasco;

import java.awt.Color;

/**
 *
 * @author dcasc
 */
public class Puffle {
    private String nombre;
    private String precio;
    private Color color;

    public Puffle() {
    }

    public Puffle(String nombre, String precio, Color color) {
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Items{" + "nombre=" + nombre + ", precio=" + precio + ", color=" + color + '}';
    }
    
}
