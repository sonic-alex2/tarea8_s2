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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alumno af = new Alumno("123", "Jorge", 10);
        Alumno bf = new Alumno("456", "Alexander", 11);
        
        //af.igualQue(af);
        
        System.out.println("Valores iguales? : "+af.igualQue(af));
        System.out.println("El alumno: "+bf.toString()+"\n Es mayor que "+af.toString()+" ?\n"+bf.mayorQue(af));
        
        Producto paf = new Producto(1,"Arroz",10.00);
        Producto bbf = new Producto(2, "Cerveza", 11);
        
        //af.igualQue(af);
        
        System.out.println("Valores iguales? : "+af.igualQue(af));
        System.out.println("El alumno: "+bf.toString()+"\n Es mayor que "+af.toString()+" ?\n"+bf.mayorQue(af));
    }
    
}
