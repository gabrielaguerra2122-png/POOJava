package ComposicaoTemUm.Desafio;
import java.util.ArrayList;

public class Compra {
    Cliente cliente;/*cada compra sabera a qual cliente pertence */
    ArrayList<Item> itens = new ArrayList<>();

   void adicionarItensNaCompra(Item item){
    this.itens.add(item);
    item.compra = this;}

  /*  void adicionarItensNaCompra(Produto p, int quantidade){ basicamente aqui ele pede um produto ja criado e a quantidade
    this.itens.add(new Item(p, quantidade));}  ele automaticamente instancia um item passando os parametros como os valores dos atributos de 
    item e adicona ele na lista de itens
um metodo q so funcionaria se fosse unidirecional. Nao tem como atribuir a referencia do objeto compra q chamou o metodo
 para o atributo compra do item(pq ele foi instanciado dentro, ele n foi passado no parametro.
 Isso serviria pra eu n ter o trabalho de instanciar um item pra dps adicionar na lista, ao msm tempo q eu adiciono na lista ele seria
 criado com os valores q eu passei no parametro, atributo produto dele teria a copia da referncia do objeto produto passado no parametro
 e tb teria uma copia do valor literal passado no parametro.
 */
/* */
   
   
   double obterTotalCompra(){
    double total = 0;
    for(Item item: this.itens){/*para cada objeto item dentro da lista item do objeto compra q chamou o metodo*/
        total += item.calcularPrecoItem();/*eu vou somar ao total, o calculo de TODOS os itens percorridos na lista
        o calculo que pega a quantidade de itens * o preco do produto e retorna o preco total d 1 item(2 escovas de cabelo adicionadas
        ao item1, e o preco é 20, ent 2(qnts) * 20(valor)=  40, pronto calculei o total do item 1 e atribui para a variavel total 
        que eu instanciei dentro do metodo, q vai fazer referencia ao valor total da compra q chamou o metodo).
        ou seja cada item da lista de itens vai chamar o metodo que calcula o preco q da, e atribui ao total. */
    }
    return total;

   }
   
}
