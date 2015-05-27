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
public class Encadeada implements InteFilaEncadeada {
    private int quantidade = 0;
    private int capacidade = 0;
    private NoEncadeado inicio;
    private NoEncadeado fim;

    @Override
    public void criarFila(int tamanho) {
        inicio = new NoEncadeado (-1, null);
    }

    @Override
    public boolean eCheia() {
        return quantidade == capacidade;
        
    }

    @Override
    public boolean eVazia() {
        return quantidade == 0;
    }

    @Override
    public int tamanho() {
        return quantidade;
    }

    @Override
    public NoEncadeado enfileirar(int valor) {
      NoEncadeado Numero = new NoEncadeado (valor, null);
      Numero.setProximo(inicio.getProximo());
      inicio.setProximo(Numero);
      quantidade++;
      return Numero; 
    }

    @Override
    public NoEncadeado desenfileirar() {
      if (eVazia()){
          System.out.println("A Fila já esta vazia");
          return null;
      }
      else{
          NoEncadeado aux = inicio.getProximo();
          inicio.setProximo(inicio.getProximo().getProximo());
          return aux;
      }
      
    }

    @Override
    public int pegarInicio() {
     return inicio.getProximo().getValor();    
    }

    @Override
    public void listar() {
        if(eVazia())
            System.out.println("Fila vazia");
        else{
            NoEncadeado aux = inicio.getProximo();
            while(aux != null){
                System.out.println(aux.getValor());
                aux = aux.getProximo();
        
            }
    
        }
    }        
}
        