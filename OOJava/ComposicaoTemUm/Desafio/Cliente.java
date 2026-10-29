package ComposicaoTemUm.Desafio;
import java.util.ArrayList;

public class Cliente {
    String nome;
    double total;/*por padrao o total se inicia em zero, toda vez q eu chamar o metodo de calculo o total vai acrescentando
    e evoluindo de acordo com as compras. */
    final ArrayList<Compra> compras = new ArrayList<>();/*todo cliente instanciado tem uma lista do objeto compra, e todo objeto compra
    tem uma lista dentro dele como atributo que guarda objetos do tipo item, e cada objeto item tem um porduto associado a ele */

   /* double obterValorTotal(){
        double total = 0;
        for(Compra cadaCompra: compras){para cada compra na lista de compras do cliente, 1 rodada ele ta com a 1 compra da lista
            for(Item itens: cadaCompra.itens){/*para cada item na lista de itens dentro da compra da rodada atual 
                total+= Math.round(itens.quantidade * itens.produto.preco); /*para cada item percorrido, da 1 compra, eu vou pegar a quantidade
                dos produtos armazenado no item e multiplicar pelo preço do produto q ta no proprio produto. 
            }
        }
        return total;
    }*/

        double getValorTotalTodasAsCompras(){
            for(Compra compra: this.compras){/*para cada compra na lista de compras do cliente q chamou o metodo */
                total+= compra.obterTotalCompra();/*eu vou atribuir a variavel total o TOTAL de cada compra q esse cliente fez. Basica
                mente cada compra da lista q o for pegar, vai chamar o metodo q eu fiz separado que pega todos os itens dentro
                da lista da compra, faz um calculo e da o total da compra, e cada total de cada compra vai ser atribuido ao
                total q qnt o cliente gastou em todas as compras. */
            }

            return total;
        }    

        /* */
        
        @Override
    public String toString() {
        
        return nome;
    }
    Cliente(String nome){
        this.nome = nome;

    }
    void adicionarCompras(Compra compra){/*criei um metodo pra facilitar a relação bidirecional, ao adicionar a compra passada por parametro
        na lista de compraas do cliente atual, eu tbm atribuo ao atributo cliente da compra q eu adicionei na lista de compras do cliente,
        o proprio cliente, assim, cada compra sabera a qual cliente pertence, e pra nao gerar tantos erros, eu vou dizer q é
        final a lista de compras */
        this.compras.add(compra);
        compra.cliente = this;
    }
}
