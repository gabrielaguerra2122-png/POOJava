package Polimorfismo;

public class Sorvete extends Comida {
    
   /*Os quatro modificadores de acesso do Java controlam quem pode escrever o nome do atributo ou método diretamente no código, 
   determinando o alcance da visibilidade em relação a pacotes e à herança.
   
   private (Visibilidade Exclusiva da Classe)
    * Quem acessa diretamente: Apenas o código escrito dentro das chaves {} da própria classe em que o membro foi declarado.
    * Comportamento na Herança: A classe filha herda o espaço do atributo na memória Heap, mas nunca acessa o nome da variável 
    * diretamente. Ela é obrigada a usar a ponte fornecida pelos métodos visíveis da classe pai (como super(...), getters e setters).
   
   default ou Package-Private (Visibilidade de Pacote)
    * Quem acessa diretamente: Qualquer classe (seja ela filha ou não) que esteja dentro do mesmo pacote (package com.meusegundo.projeto;).
    * Comportamento na Herança: Depende de onde a classe filha está salva:
      * No mesmo pacote: Acessa o atributo diretamente (ex: this.peso).
      * Em outro pacote: O acesso direto é bloqueado pelo compilador. O atributo continua na memória, mas a classe filha em outro pacote
      *  precisará de um método public ou protected para interagir com ele.
      * 
   protected (Visibilidade de Pacote + Subclasses)
    * Quem acessa diretamente: Qualquer classe no mesmo pacote E qualquer classe filha, mesmo que esta esteja em um pacote totalmente 
   diferente.
    * Comportamento na Herança: É o modificador feito sob medida para a orientação a objetos. A classe filha tem total liberdade de 
   acessar o atributo direto pelo seu nome (this.peso ou super.peso), independentemente da pasta/pacote onde a classe filha foi criada.
   public (Visibilidade Irrestrita)
    * Quem acessa diretamente: Qualquer classe do projeto todo, sem restrições de pacote ou de herança.
    * Comportamento na Herança: A classe filha acessa diretamente de qualquer lugar. Porém, deixa os dados expostos para alteração 
    * indevida por qualquer outra classe externa.
    
   Regra de Ouro: O armazenamento na memória é garantido pela herança; a permissão de tocar na variável é
     garantida pelo modificador de acesso.*/
   
   public Sorvete(double peso){
    
    super(peso);
   }

  
}
