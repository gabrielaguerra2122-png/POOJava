package abstrato;

public class CachorroAlien extends MamiferoAlien{
    /*obrigatoriamente eu preciso imprementar mamar no cachorro pq na classe mae dele, foi definido
    * como abstrato, MAS se eu definissi o metodo mover eu poderia apenas sobrescrever, pq na classe MamiferoAlien
    * que herda de animal, ele ja teria implementado um corpo pro metodo mover.*/

    @Override
    public String mover() {
        return "Usando as patas";
    }

    @Override
    public String mamar() {/*tornei o metodo concreto, implementando dentro de cachorro*/
        return "Usando leite";
    }
    /*como cachorroalien é uma classe concreta eu precisei implementar todos os metodos abstratos herdados,
     acumulados ao longo da hierarquia de TODAS as classes que vem antes dele q sao MamiferoAlien, Animal*/
}
