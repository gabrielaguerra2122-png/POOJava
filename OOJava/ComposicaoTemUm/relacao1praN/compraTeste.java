package ComposicaoTemUm.relacao1praN;
public class compraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente="Britney";
        c1.itens.add(new Item("Escova de cabelo", 2, 20.0));/*no construtor eu coloquei 
        pra inserir logo os dados no parametro pra eu n precisar ficar criando um obj item separad e dps adicionar
        na lista q é um atributo do obj compras */
        c1.adicionarItem("Leave-in", 1, 70.65);
        c1.adicionarItem(new Item("Oleo pra cabelo", 2, 55.43));
        System.out.println(c1.itens.size());
        System.out.println();
        System.out.println(c1.totalDaCompra());
        
    }
}
