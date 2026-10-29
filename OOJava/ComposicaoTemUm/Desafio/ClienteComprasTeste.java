package ComposicaoTemUm.Desafio;

public class ClienteComprasTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Sirena");
        Compra compra1 = new Compra();
        Compra compra2 = new Compra();
        Produto produto1 = new Produto("Oleo capilar", 40.57);
        Produto produto2 = new Produto("Leave in", 75.34);
        Produto produto3 = new Produto("Oleo corporal", 23.45);
     //esses 2 itens pertencerao a compra 1 do cliente
        Item item1 = new Item(produto1, 4);
        Item item2 = new Item(produto2, 5);
        //esse outro item pertencera a compra 2 do cliente
        Item item3 = new Item(produto3, 2);


/*adicionei a compra 1 na lista de compras do cliente, dps adicionei na lista de itens do objeto compra1 o item1 e item2 */
        cliente.adicionarCompras(compra1);
        compra1.adicionarItensNaCompra(item1);
        cliente.adicionarCompras(compra1);
        compra1.adicionarItensNaCompra(item2);

        cliente.adicionarCompras(compra2);
        compra2.adicionarItensNaCompra(item3);

        System.out.println(cliente.getValorTotalTodasAsCompras());
        System.out.println(cliente.total);
    }
}
