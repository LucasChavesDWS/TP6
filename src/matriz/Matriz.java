/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;


public class Matriz {
    private int Numeros[][];
    
    public void armar(){
        int Numeros[][] = 
        {
            {3,6,9,12},
            {15,18,21},
            {24,27,30,33,36},
            {39,42}
        
        };
        
        System.out.println("Los valores pares de la matriz son:");
        for(int x=0;x< Numeros.length;x++){
            for (int i = 0; i < Numeros[x].length; i++) {
                {
                    if(Numeros[x][i] %2 == 0){
                        System.out.print("|"+Numeros[x][i]+"|");
                    }
                    }
                
            }
        System.out.println(" ");    
        }
        
    }
  
    public static void main(String[] args) {
        Matriz m = new Matriz ();
        m.armar();
        
    }
    
}
