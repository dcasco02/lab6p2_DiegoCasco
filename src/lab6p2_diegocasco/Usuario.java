/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_diegocasco;

import java.util.ArrayList;

/**
 *
 * @author dcasc
 */
public class Usuario {
    private String nombre;
    private String password;
    private boolean socio;
    private int dinero;
    private ArrayList <Casa> casas=new ArrayList();
    private ArrayList <Items> items=new ArrayList();

    public Usuario() {
    }

    public Usuario(String nombre, String password, boolean socio, int dinero) {
        this.nombre = nombre;
        this.password = password;
        this.socio = socio;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isSocio() {
        return socio;
    }

    public void setSocio(boolean socio) {
        this.socio = socio;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Casa> getCasas() {
        return casas;
    }

    public void setCasas(ArrayList<Casa> casas) {
        this.casas = casas;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", password=" + password + ", socio=" + socio + ", dinero=" + dinero + ", casas=" + casas + ", items=" + items + '}';
    }
    
}
