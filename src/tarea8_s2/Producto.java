package tarea8_s2;


import tarea8_s2.Comparador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alx-pc
 */
public class Producto implements Comparador{
    private int identificador;
    private String nombre;
    private double precio;

    public Producto(int identificador, String nombre, double precio) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     *
     * @param q
     * @return
     */
    @Override
    public boolean igualQue(Object q) {
        Producto p;
        p = (Producto)q;
        return this.precio == p.precio;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param q
     * @return
     */
    @Override
    public boolean menorQue(Object q) {
        Producto p;
        p = (Producto)q;
        return this.precio < p.precio;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param q
     * @return
     */
    @Override
    public boolean menorIgualQue(Object q) {
        Producto p;
        p = (Producto)q;
        return this.precio <= p.precio;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param q
     * @return
     */
    @Override
    public boolean mayorQue(Object q) {
        Producto p;
        p = (Producto)q;
        return this.precio > p.precio;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param q
     * @return
     */
    @Override
    public boolean mayorIgualQue(Object q) {
        Producto p;
        p = (Producto)q;
        return this.precio >= p.precio;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Producto{" + "identificador=" + identificador + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
    
}
