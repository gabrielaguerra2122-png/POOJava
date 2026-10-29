package abstrato;

public abstract class MamiferoAlien extends Animal{
    /*mesmo a classe mamifero sendo uma subclasse herdada de animal, ela nao precisa implementar
    * corpo nos metodos abstratos, pq essa classe mamifero tb é abstrato, é algo generico, os mamiferos
    * podem se mover de maneiras diferentes.
    * MAS se eu quiser eu posso sim sobrescrever(no sentido de ta adicionando corpo ao metodo da classe mae) */


    //posso criar metodos abstratos tb nessa subclasse!!

    public abstract String mamar();
    /* eu sei que todo mamifero tem o metodo(ação/comportamento) mamar
       mas por ser muito generico, eu nao sei se esse metodo, se eu definisse um corpo a ele, funcionaria
       para todos os mamiferos*/

    @Override
    public String mover() {
        return "Saindo do lugar";/*fiz uma implementação generica, para que toda subclasse de mamifero nao precise
        OBRIGATORIAMENTE implementar mover, so se quiser*/
    }
}
