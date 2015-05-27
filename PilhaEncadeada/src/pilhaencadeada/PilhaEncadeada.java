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
public interface PilhaEncadeada {
    void criaPlilha();//cria pilha     
    boolean eVazia();//verifica se a pilha possui elementos     
    int tamanho();//retorna o número de itens da pilha 
    void limpar(); //esvaziar pilha
    NoE push(int valor);//insere um valor no topo da pilha    
    NoE pop();//retira o valor no topo da pilha  
    int pegaratopo(); //retorna o valor atual do topo da pilha  
    void lista(); //retorna os elementos da pilha 
    
    
}
