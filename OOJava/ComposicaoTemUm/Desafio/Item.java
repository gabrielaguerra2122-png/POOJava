package ComposicaoTemUm.Desafio;

public class Item {
    Produto produto;
    int quantidade;
    Compra compra;/*cada item sabera a qual compra pertence */
   Item(Produto produto, int quantidade){
    this.produto = produto;
    this.quantidade = quantidade;
   }

   double calcularPrecoItem(){
    double total = 0;
    total += this.quantidade * this.produto.preco; 
    return total;
   }
}
