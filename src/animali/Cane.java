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
public class Cane extends Mammifero {
    private String razza;
    private String nome;
    private int chip;

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getChip() {
        return chip;
    }

    public void setChip(int chip) {
        this.chip = chip;
    }

    public Cane(String razza, String nome, int chip, int tempoA, int maxProle, int età, int peso) {
        super(tempoA, maxProle, età, peso);
        this.razza = razza;
        this.nome = nome;
        this.chip = chip;
    }

    @Override
    public void verso() {
    System.out.println("bau");    
    }

    @Override
    public void muovi() {
        
    }
    
}
