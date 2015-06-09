/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinaria;

/**
 *
 * @author COMPUTECH 3027-0039
 */
public class NoArvoreBinaria {
     private int chave;     
     private NoArvoreBinaria esquerda;     
     private NoArvoreBinaria direita;  
  
     public NoArvoreBinaria(int chave) {
        this.chave = chave;
        this.esquerda = null;
        this.direita = null;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public NoArvoreBinaria getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NoArvoreBinaria esquerda) {
        this.esquerda = esquerda;
    }

    public NoArvoreBinaria getDireita() {
        return direita;
    }

    public void setDireita(NoArvoreBinaria direita) {
        this.direita = direita;
    }

     
     
}

    