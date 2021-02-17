/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animali;

import java.util.ArrayList;

/**
 *
 * @author rolandosucco
 */
public class Catalogo {
    private ArrayList<Animale> catalogo=new ArrayList<>();
  public Catalogo(Animale a){
  catalogo.add(a);
  }  
  public Catalogo(){}
  public void aggiungi(Animale a){
  catalogo.add(a);
  }
  public void visualizzaCani(){
      for(Animale a:catalogo){
       if(a instanceof Cane){
        Cane b=(Cane)a;
        System.out.println(b.getNome()+" "+b.getRazza() + " "+ a.getClass());
       }
      }
  
  }
public void visualizzaVersi(){
 for(int i=0;i<catalogo.size();i++)
      catalogo.get(i).verso();
}
}
