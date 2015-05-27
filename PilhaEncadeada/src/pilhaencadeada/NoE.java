/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhaencadeada;

/**
 *
 * @author COMPUTECH 3027-0039
 */
public class NoE {
   private int valor;
   private NoE proximo;
   
    public NoE(int valor) {
        this.valor = valor;
        this.proximo = proximo;
    }

    public int getValor() {
        return valor;
    }

    public NoE getProximo() {
        return proximo;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setProximo(NoE proximo) {
        this.proximo = proximo;
    }
    
}
