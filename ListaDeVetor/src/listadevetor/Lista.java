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
public class Lista  implements InterLista {
  private int capacidade = 0;
    private int tamanho = 0;
    private NoLista lista[];

    @Override
    public void criarLista(int tamanho) {
        this.lista = new NoLista[tamanho];
        this.capacidade = tamanho;
    }

    @Override
    public NoLista[] aumentarLista() {
        NoLista aux[] = new NoLista[capacidade * 2];
        for (int i = 0; i < capacidade; i++) {
            aux[i] = lista[i];
        }
        capacidade *= 2;
        return aux;
    }

    @Override
    public boolean eVazia() {
        return capacidade == 0;
    }

    @Override
    public boolean eCheia() {
        return capacidade == tamanho;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public int capacidade() {
        return capacidade;
    }

    @Override
    public boolean procurarElemento(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (lista[i].getValor() == valor) {
                return true;
            }
        }
        return false;
    }

    @Override
    public NoLista pegarElemento(int indice) {
        return lista[indice];
    }

    @Override
    public void addInicio(int valor) {
        if (!eCheia()) {
            for (int i = tamanho; i > 0; i--) {
                lista[i] = lista[i - 1];
            }
            lista[0] = new NoLista(valor);
            tamanho ++;
        }
        if (eCheia()) {
            lista = aumentarLista();
        }
    }

    @Override
    public void addFim(int valor) {
        if(!eCheia())
            lista[tamanho] = new NoLista(valor);
    }

    @Override
    public void addPosicao(int indice, int valor) {
        if (lista[indice] == null) {
            lista[indice] = new NoLista(valor);
        }
    }

    @Override
    public void removerInicio(int valor) {
        for (int i = 0; i <tamanho-1; i++) {
            lista[i] = lista[i + 1];
            
        }
        tamanho--;
    }

    @Override
    public void removerFim(int valor) {
        lista[tamanho-1]=null;
        tamanho--;
    }

    @Override
    public void removerPosicao(int indice) {
        for (int i = indice; i < tamanho-1; i++) {
            lista[i] = lista[i+1] ; 
        }
    }

    @Override
    public void listar() {
        for (int i = 0; i < tamanho-1; i++) {
            System.out.println(lista[i].getValor());
        }
    }

}


