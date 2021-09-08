/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea8_s2;

/**
 *
 * @author alx-pc
 */
public class Alumno implements Comparador{
    
    private String carne;
    private String nombre;
    private int edad;

    public Alumno(String carne, String nombre, int edad) {
        this.carne = carne;
        this.nombre = nombre;
        this.edad = edad;
    }
 
   
  @Override
    public boolean igualQue(Object q) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        Alumno a;
        a = (Alumno)q;
        return this.edad == a.edad;
    }

    
    
    
    @Override
    public boolean menorQue(Object q) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Alumno a;
        a = (Alumno)q;
        return this.edad < a.edad;
    }

    @Override
    public boolean menorIgualQue(Object q) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       Alumno a;
        a = (Alumno)q;
        return this.edad <= a.edad;
    }

    @Override
    public boolean mayorQue(Object q) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Alumno a;
        a = (Alumno)q;
        return this.edad > a.edad;
    }

    @Override
    public boolean mayorIgualQue(Object q) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Alumno a;
        a = (Alumno)q;
        return this.edad >= a.edad;
    
    }

    @Override
    public String toString() {
        return "Alumno{" + "carne=" + carne + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
    
}
