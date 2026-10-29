package Teste;
import HerancaÉum.Heroi;
import HerancaÉum.Monstro;
import HerancaÉum.EnumTeste;

public class Jogo {
    public static void main(String[] args) {
        Monstro monstro = new Monstro();
        monstro.setValorX(10);
        monstro.setValorY(10);
       
        Heroi heroi = new Heroi();/*Sem eu precisar escrever nada na classe heroi e monstro, apenas dizer que ele é uma subclasse(classe filha)
         da classe generica Jogador, ele herdou tudo oq a classe Pai tem. Ele recebeu um reuso de codigo via herança
         Temos uma classe mais generica que transmitiu atributos e comportamentos para as classes filhas*/
        heroi.setValorX(10);
        heroi.setValorY(11);

       
        System.out.println("O monstro tem-> "+ monstro.getVida());
        System.out.println("O heroi tem-> " + heroi.getVida());
    

        monstro.atacar(heroi);/*o metodo continua funcionando pros tipos especificos(heroi e monstro, subclasses) pq na definicao
        do metodo eu coloquei que o parametro a ser recebido seria o tipo mais generico que tem que é o Jogador, 
        e apartir da classe generica eu consigo atribuir subclasses herdadas dele sim(polimorfismo dinamico, um metodo
        pode receber multiplos parametros)  */
        heroi.atacar(monstro);
        monstro.atacar(heroi);

        heroi.atacar(monstro);
        monstro.atacar(heroi);
        monstro.andar(EnumTeste.LESTE);
        heroi.atacar(monstro);
        monstro.atacar(heroi);


        System.out.println( monstro);
        System.out.println( heroi);

    }
}
