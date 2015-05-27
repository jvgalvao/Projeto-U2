/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilaCircular;

/**
 *
 * @author COMPUTECH 3027-0039
 */
public class NoCircula {
    private int valor;

    public NoCircula(int valor) {
        this.valor = valor;
    }

   

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    NoCircula getProximo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
