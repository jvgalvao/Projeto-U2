/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilaDuplamenteEncadeada;

/**
 *
 * @author COMPUTECH 3027-0039
 */
public class NoEncadeadoDuplo {
    private int valor;
    private  NoEncadeadoDuplo proximo;
    private  NoEncadeadoDuplo fim;

    public NoEncadeadoDuplo(int valor, NoEncadeadoDuplo proximo, NoEncadeadoDuplo fim) {
        this.valor = valor;
        this.proximo = proximo;
        this.fim = fim;
    }

    NoEncadeadoDuplo(int i, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoEncadeadoDuplo getProximo() {
        return proximo;
    }

    public void setProximo(NoEncadeadoDuplo proximo) {
        this.proximo = proximo;
    }

    public NoEncadeadoDuplo getFim() {
        return fim;
    }

    public void setFim(NoEncadeadoDuplo fim) {
        this.fim = fim;
    }
    
}
