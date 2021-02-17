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
public abstract class Mammifero extends Animale{
 private int tempoA;
 private int maxProle;

    public Mammifero(int tempoA, int maxProle, int età, int peso) {
        super(età, peso);
        this.tempoA = tempoA;
        this.maxProle = maxProle;
    }

    public int getTempoA() {
        return tempoA;
    }

    public void setTempoA(int tempoA) {
        this.tempoA = tempoA;
    }

    public int getMaxProle() {
        return maxProle;
    }

    public void setMaxProle(int maxProle) {
        this.maxProle = maxProle;
    }
 //\public abstract void verso();
}
