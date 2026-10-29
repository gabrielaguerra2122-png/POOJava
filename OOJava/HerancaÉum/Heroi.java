package HerancaÉum;

public class Heroi extends Jogador {
    
    /*a palavra extends é a palavra chave q diz que essa classe herda da outra classe
    (classe especifica/concreta(filha) que herdou da outra EXTENDS classe PAI(ou abstrata/generica))
    Sem eu precisar escrever nada na classe heroi, apenas dizer que ele é uma subclasse da classe generica
    Jogador, ele herdou tudo oq a classe Pai tem.
    Ele recebeu um reuso de codigo via herança */

    /*sobrescrevi o metodo da classe pai, e agora eu n uso mais o metodo dele e sim o q eu rescrevi .
    Quando eu copio e colo um metodo da classe pai na subclasse, por mais q eu nao mexa em nada, o codigo
    foi sobrescrito por completo, agr esse metodo n tem mais nada a ver com o metodo da classe pai.

     boolean atacar(Jogador oponente){
    int deltaX = Math.abs(this.posicaoX - oponente.posicaoX);
    int deltaY = Math.abs(this.posicaoY - oponente.posicaoY);
    if(deltaX == 0 && deltaY ==1){
        oponente.vida-=20;
        return true;
    }
    else if( deltaX ==1 && deltaY == 0 ){
        oponente.vida-=20;
        return true;
    }
    else {
        return false;}
   }*/

       public  boolean atacar(Jogador oponente){
          boolean atacar1 =  super.atacar(oponente);/*esse aqui eu sobrecrevi reutilizando(sobrescrita com REUSO de metodo) 
          o metodo da classe generica, 
          se os dois metodos darem true ent esse metodo
          sobrescrito APENAS PRO HEROI retorna true tb(dupliquei o metodo genrico pra ele dar 20 de dano).
          eu acesso coisas da classe pai apartir da palavra super 
          eu tive que atribuir pra variaveis pq o || funciona como um if, se eu colocasse:
          super.atacar(oponente) || super.atacar(oponente) logo de cara, ele veria q o 1 metodo é verdadeiro e ja retornaria
          true, sem ao menos executar o segundo ataque, q é oq eu quero pra ele dar mais danos no monstro.
          Chamando o metodo 2 vezes atraves do super e atribuindo a uma variavel, ele obrigatoriamente testa os dois, e so 
          devolve o valor dps de tentar executar os 2 metodos dentro desse metodo.
          Nesse cas como é o mesmo metodo super, o resultado de um sera o outro, entao o && é mais "indicavel" */
            boolean atacar2 = super.atacar(oponente);
            return atacar1 && atacar2;
        
   }
   @Override
   public String toString() {
       return String.format("O heroi tem-> %d ", vida);
   }
   
}
