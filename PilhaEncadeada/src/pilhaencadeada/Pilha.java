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
    private int tamanho = 0;
    private NoE topo;
    
    @Override
    public void criaPlilha() {
        topo = new NoE (-1, null);
    }

    @Override
    public boolean eVazia() {
        return tamanho == 0;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public void limpar() {
        topo.setProximo(null);
    }

    @Override
    public NoE push(int valor) {
         NoE novo = new NoE(valor, null);
         novo.setProximo(topo.getProximo());
         topo.setProximo(novo);
         tamanho++;
         return novo;
    }

    @Override
    public NoE pop() {
       if(eVazia()){
            System.out.println("Não possui elementos");
            return null;
       }
       else {
           NoE aux = topo.getProximo();
           topo.setProximo(topo.getProximo().getProximo());
           return aux;
       }
    }

    @Override
    public int pegaratopo() {
        return topo.getProximo().getValor();
    }

    @Override
    public void lista() {
       //for (int i = 0 ; i < tamanho; i++)
        if(eVazia())
            System.out.println("Pilha vazia");
        else{
            NoE aux = topo.getProximo();
            while(aux != null){
                System.out.println(aux.getValor());
                aux = aux.getProximo();
            }
        }
            
            
    }
 

    
}
