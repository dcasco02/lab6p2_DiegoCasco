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
public class Items {
    private String nombre;
    private int precio;
    private String tipoitem;

    public Items() {
    }

    public Items(String nombre, int precio, String tipoitem) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipoitem = tipoitem;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipoitem() {
        return tipoitem;
    }

    public void setTipoitem(String tipoitem) {
        this.tipoitem = tipoitem;
    }

    @Override
    public String toString() {
        return "Items{" + "nombre=" + nombre + ", precio=" + precio + ", tipoitem=" + tipoitem + '}';
    }
    
}
