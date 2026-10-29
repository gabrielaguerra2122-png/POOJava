package abstrato;

public class Teste {
    static void main(String[] args) {
        Animal a = new CachorroAlien();
        System.out.println(a.mover());

        MamiferoAlien b = new CachorroAlien();
        System.out.println(b.mamar());
        /*por mais que eu nao tenha definido COMO o metodo vai executar essa ação(ou seja a implementação do corpo)
        * eu sei que todo mamifero tera esses metodos, so nao sei como, entao quando eu defini na classe cachorro e
        *             instanciei ele, ele chama os metodos implementados do OBJETO instanciado e nao do tipo
        * da variavel.*/


    }
}
