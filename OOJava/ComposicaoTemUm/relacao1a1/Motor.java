package ComposicaoTemUm.relacao1a1;
public class Motor {
    boolean ligado = false;
    double fatoInjecao = 1;
    Carro carro;

    Motor(Carro carro){/*no construtor do Motor, pra ele fazer uma relação bidirecional, onde o motor tb tem
        ligação com o carro e nao so o carro com o motor, ele recebe um parametro de um carro construido, e essa referencia
        de memoria desse obj carro passado por parametro é atribuido ao obj carro que ele tem como atributo.
        esse exemplo foi so feito para mostrar q se eu precisar acessar o atributo de uma classe ou o metodo
        pra modificar algo de outra, eu teria que ter uma relação bidirecional, onde as 2 classes tem algum atributo 1 da outra.
        nesse caso por enquanto nao era necessario, so o carro ter o motor q era preciso, pq o motor em nenhum momento usou
        algo dado pelo carro, mas o carro usa o metodo giros.*/
        this.carro = carro;
    }

    /*false= nao/desligado
    true=sim/ligado 
    basicamente:
    A NEGAÇÃO INVERTE O VALOR, OU SEJA SE LIGADO TIVER COM UM VALOR TRUE, entao a negação dele é falso, logo ele nao entra no if
    pq deu falso(!true=false), mas se o valor de ligado for FALSE, a NEGAÇÃO de false é TRUE(!false=true), 
    ent ele entra no if pq o if so entra qnd a condição é vdd.*/
    int giros(){
        if(!ligado){/*ele pergunta qual é o valor de ligado, se for true ele faz if(!true=false) ent nao entro pq minha condição deu falsa
            mas se for false ele faz if(!false=true) ja que a negação do valor deu true, e eu so entro em condições qnd é
            true, ent eu executo */
            return 0;
        }else{
            return (int) fatoInjecao * 3000;}
        
    }
}