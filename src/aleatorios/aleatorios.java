/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorios;
import java.util.Random;
/**
 *
 * @author WINDOWS
 */
public class aleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /* Ejemplo uso clase Random() – aprenderaprogramar.com */

            float a, b, c;
            Random rnd = new Random();
            a = (rnd.nextFloat() * 10);
            b = (rnd.nextFloat() * 10);
            c = (rnd.nextFloat() * 10);
            System.out.println(a);        
            System.out.println(b);        
            System.out.println(c);        
      }

} 
    
    
}
