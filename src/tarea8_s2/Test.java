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
        
        
        
        System.out.println("Valores iguales de alumno en comparacion? : "+af.igualQue(bf)+"\n");
        System.out.println("La EDAD del alumno: "+bf.toString()+"\n Es mayor que "+af.toString()+" ?\n"+bf.mayorQue(af));
        System.out.println("La EDAD del alumno: "+bf.toString()+"\n Es menor que "+af.toString()+" ?\n"+bf.menorQue(af)+"\n\n");
        
        Producto paf = new Producto(1,"Arroz",10.00);
        Producto pbf = new Producto(2, "Cerveza", 11);
        
        
        System.out.println("Valores iguales de producto en comparacion? : "+paf.igualQue(pbf)+"\n");
        System.out.println("El PRECIO del producto: "+pbf.toString()+"\n Es MAYOR que "+paf.toString()+" ?\n"+pbf.mayorQue(paf));
        System.out.println("El PRECIO del producto: "+pbf.toString()+"\n Es MENOR que "+paf.toString()+" ?\n"+pbf.menorQue(paf));
    }
    
}
