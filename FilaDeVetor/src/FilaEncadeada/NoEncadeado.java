/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilaEncadeada;

/**
 *
 * @author COMPUTECH 3027-0039
 */
public class NoEncadeado {
    private int valor;
   private NoEncadeado proximo;
   
    public NoEncadeado(int valor) {
        this.valor = valor;
        this.proximo = proximo;
    }

    NoEncadeado(int i, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getValor() {
        return valor;
    }

    public NoEncadeado getProximo() {
        return proximo;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setProximo(NoEncadeado proximo) {
        this.proximo = proximo;
    }
    
}
    

