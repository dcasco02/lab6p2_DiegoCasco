/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_diegocasco;

/**
 *
 * @author dcasc
 */
public class Casa {
   private String nombre;
   private int size;
   private int costo;
   private int x;
   private int y;

    public Casa() {
    }

    public Casa(String nombre, int size, int costo, int x, int y) {
        this.nombre = nombre;
        this.size = size;
        this.costo = costo;
        this.x = x;
        this.y = y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Casa{" + "nombre=" + nombre + ", size=" + size + ", costo=" + costo + ", x=" + x + ", y=" + y + '}';
    }
   
}
