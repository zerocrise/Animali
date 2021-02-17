/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animali;

/**
 *
 * @author rolandosucco
 */
public class Animali {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cane a= new Cane("lupo", "Flash", 0, 1, 10, 2, 30);
        Mammifero b=new Gatto("Siamese", "Silvestro", 0, 1, 10, 2, 10);
        Animale c=new Cane("lupo", "Flash", 0, 1, 10, 2, 30);
        
        Catalogo catalogo=new Catalogo(c);
        catalogo.aggiungi(b);
        catalogo.aggiungi(a);
        catalogo.visualizzaVersi();
    }
    
}
