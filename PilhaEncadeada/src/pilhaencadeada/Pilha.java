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
public class Pilha implements PilhaEncadeada {
    
    private int capacidade;
    private No topo;

    @Override
    public void criaPlilha(int tamanho) {
        pilha = new No[tamanho];
        capacidade = tamanho;
    }

    @Override
    public boolean eVazia() {
        return topo < 0;
    }

    @Override
    public boolean eCheia() {
        return topo == capacidade -1;
    }

    @Override
    public int tamanho() {
        return topo +1;
        
    }

    @Override
    public No push(int valor) {
        if(!eCheia()){
        No aux = new No(valor);
        //topo++;
        //pilha[topo] = aux;
        pilha[++topo] = aux;
        return aux;
        }
        return null;
    }

    @Override
    public No pop() {
        No aux = pilha[topo]; 
        pilha [topo] = null;
        return aux; 
    }

    @Override
    public int pegarTopo() {
        return pilha[topo].getValor();
    }

    @Override
    public void lista() {
        for(int i = topo; i >= 0; i--){
            System.out.println(pilha[i].getValor());
        }  
    }
}

    
}
