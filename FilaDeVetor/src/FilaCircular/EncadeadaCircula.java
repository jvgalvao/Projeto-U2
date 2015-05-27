/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilaCircular;

import FilaEncadeada.NoEncadeado;

/**
 *
 * @author COMPUTECH 3027-0039
 */
public class EncadeadaCircula implements InteFilaCircular{
    private int capacidade;
    private int quantidade = 0;
    private NoCircula fila[];
    private int inicio = 0;
    private int fim = 0;

    @Override
    public void criarFila(int quantidade) {
     this.fila = new NoCircula[quantidade];
     this.capacidade = quantidade;
    }

    @Override
    public boolean eCheia() {
     return capacidade == quantidade;   
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
    public NoCircula enfileirar(int valor) {
        
    }

    @Override
    public NoCircula desenfileirar() {
        
    }

    @Override
    public int pegarInicio() {
        
    }

    @Override
    public void listar() {
     for (int i = 0; i < quantidade-1; i++) {
            System.out.println(fila[i].getValor());
        }  
            
        
    }
}
