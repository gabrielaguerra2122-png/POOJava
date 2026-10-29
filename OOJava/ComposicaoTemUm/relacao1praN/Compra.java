package ComposicaoTemUm.relacao1praN;
import java.util.ArrayList;
/*relação 1 pra N, uma compra tem varios itens */
public class Compra {
    String cliente;
    
    ArrayList<Item> itens = new ArrayList<>();

    double totalDaCompra(){//chamo o metodo com um obj compra tipo compra1.totalDaCompra
        double total = 0;
for(Item itens: itens){/*ele percorre o atributo lista do objeto compra que chamou o metodo */
    total+= itens.preco * itens.quantidade;/*multiplica a quantidade e o valor de cada item e soma no total */
}
        return total;
    }

    //vou criar um metodo pra adicionar o item, e o item receber a referencia de memoria do obj compra no atributo compra dela

    void adicionarItem(Item item){//adiciono o item no parametro do metodo
        itens.add(item);//o metodo adiciona o item e seus atributos dentro do atributo lista do objeto compra q chamou o metodo
        item.compra = this;    }/*e tbm, pega o item q acabou de ser adicionado, acessa o atributo Compra do item, e 
        atribui a ele A PROPRIA COMPRA q chamou o metodo
        (agora o atributo Compra do item criado e adicionado tem a mesma referencia de memoria pro obj Compra
        que adicionou esse item no atributo lista dele) q chamou o metodo(usando this pra fzr referencia ao obj compra q chamou o metodo).
        ou seja, agr o item q for adicionado por meio do metodo, tera uma relação bidirecional com a compra(
        a compra tem os itens, e o item sabe a qual compra pertence) continua sendo 1 pra n pq compra tem varios itens
        mas o item tem so 1 compra(do item pra compra seria 1 pra 1, 1 item tem 1 compra mas na compra é diferente, 
        1 compra tem varios itens ent é 1 pra n) se eu adicionar um item na lista logo de cara itens.add o item adicionado n vai ter 
        relação com a compra, ela n vai saber a qual compra pertence, apenas os q forem adicionados pelo metodo.*/

//tbm da pra facilitar usando um metodo com outro

    void adicionarItem(String nome, int quantidade, double preco ){/*criei uma variante do metodo onde eu passo apenas os parametros
de nome, qntdd e preço *//*fiz isso pra nao precisar instanciar, atribuir valores aos atributos */
        this.adicionarItem(new Item(nome, quantidade, preco));/*aqui dentro como o outro metodo pedia um
        Item instanciado, se eu chamar o metodo de cima q pede so os valores dos atributos, o metodo de baixo ja instancia o 
        item pra mim, adiciona os valores respectivos a cada um, adiciona o Item no atributo lista do obj compra q chamou o metodo, 
        e ainda atribui a referencia de memoria do objeto Compra
        q chamou o metodo, para o atributo Compra do item adicionado na lista */
        /*o this.adicionarItem faz referencia ao proprio obj q chamou o metodo, como os 2 sao metodos de instanca, pra acionar
        o metodo q tem Item o parametro eu chamo o THISSS. */
    }
}
