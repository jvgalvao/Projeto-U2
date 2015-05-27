/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilaDuplamenteEncadeada;

import FilaEncadeada.NoEncadeado;

/**
 *
 * @author COMPUTECH 3027-0039
 */
public class EncadeadoDuplo implements InteFiilaEncadeadaDupla {
  private int capacidade = 0;
  private int quantidade = 0;
  private NoEncadeadoDuplo inicio;
  private NoEncadeadoDuplo fim;
  private NoEncadeadoDuplo fila[];
    @Override
    public void criarFila(int tamanho) {
      inicio = new NoEncadeadoDuplo (-1, null);  
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
    public NoEncadeadoDuplo addInicio(int valor) {
        
    }

    @Override
    public NoEncadeadoDuplo addFim(int valor) {
        
    }

    @Override
    public NoEncadeadoDuplo removeInicio() {
    for (int i = 0; i <quantidade-1; i++) {
            fila[i] = fila[i + 1];
            
        }
        quantidade--;   
      return null;
    }

    @Override
    public NoEncadeadoDuplo removeFim() {
     fila[quantidade-1]=null;
        quantidade--;   
      return null;
    }

    @Override
    public int pegarInicio() {
    return inicio.getProximo().getValor();    
    }

    @Override
    public void listar() {
       if(eVazia())
            System.out.println("fila vazia");
        else{
            NoEncadeadoDuplo aux = inicio.getProximo();
            while(aux != null){
                System.out.println(aux.getValor());
                aux = aux.getProximo();
            } 
       }    
    }
}
