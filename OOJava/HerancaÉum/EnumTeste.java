package HerancaÉum;
/*Enum é um tipo especial de classe que serve pra criar uma quantidade definida de possibilidades(quantidade determinada de opções), 
e que sao constantes e sempre
estaticas.
O enum tambem é um tipo.,
No corpo dele eu defino nomes que automaticamente o java transforma esses nome numa instancia estatica constante, sao
estaticas porque voce acessa diretamente pelo nome do enum. Outro fato é que as instancias criadas sao automaticamente colocadas
em ordem de inserção em um Array, entao meio que um enum é um conjunto de possibilidades definidas.
Quando essa instancia tem algum atributo, eu so faço passar os valores no construtor dela, abaixo eu defino as
variaveis(constantes e estativas) que vao armazenar esse valor, e utilizo o construtor dentro do corpo do enum passando os valores
do parametro da instancia automaticamente criada para os atributos(variaveis) que vao armazenar esses valores, via construtor e usando
o .this pq essas variaveis pertencem a essas instancias definidas.
Eles tambem podem ter metodos.*/
public enum EnumTeste {
    NORTE, LESTE, SUL, OESTE;/*isso é visto como:
    public static final Enum NORTE = new Enum();
    public static final Enum LESTE = new Enum();
    public static final Enum SUL = new Enum();
    public static final Enum OESTE = new Enum();
    
    ELES(os objetos ja instanciados) SEMPREEE serao public static final, ou seja, sempre serao publicos, estaticos e constantes.
    Mas seus atributos e metodos tem os modificadores de visibilidade tambem!
    Ou seja o objeto é publico mas seus membros sao controlados.*/

   
    
}
  