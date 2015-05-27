/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadevetor;

/**
 *
 * @author COMPUTECH 3027-0039
 */
public class NoLista {
private int valor;
private NoLista proximo;

    public NoLista(int valor, NoLista proximo) {
        this.valor = valor;
        this.proximo = proximo;
    }

    NoLista(int valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoLista getProximo() {
        return proximo;
    }

    public void setProximo(NoLista proximo) {
        this.proximo = proximo;
    }
    


}
