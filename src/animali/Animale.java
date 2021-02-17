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
public abstract class Animale {
    int età;
    int peso;
     public abstract void muovi();
    @Override
    public String toString() {
        return "Animale{" + "et\u00e0=" + età + ", peso=" + peso + '}';
    }

    public int getEtà() {
        return età;
    }

    public void setEtà(int età) {
        this.età = età;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Animale(int età, int peso) {
        this.età = età;
        this.peso = peso;
    }
    public abstract void verso();
}
