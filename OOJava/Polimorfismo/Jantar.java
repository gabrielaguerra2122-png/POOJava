package Polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(51.7);
      System.out.println(p1.getPeso());
      /*Comida batataCozida = new Comida(0.10);*/
      Sorvete sorvete = new Sorvete(0.6);
      Feijao feijao = new Feijao(0.8);//como 1kg é 1000g, ele substitui oq falta dps da virgula por 0, ent
      //0.8 equivale à 0.800, se for 0.08= 0.080, se for 8 = 8000... isso n é so relacionado a kg, é matematica
      //toda vez q eu usar esse tipo de numero, ele faz isso

      //estaticos, sobrecarga
      p1.comer1(sorvete);
      p1.comer1(feijao);
        //generico, dinamico
     /* p1.comer(batataCozida);*/
      System.out.println(p1.getPeso());
      //feijao e sorvete sao classes q herdam de comida, enquanto batata foi criado no main
      //pq assim como ele eh generico, a partir dele eu crio outras comidas sem precisar de classes novas herdadas
      p1.comer(feijao);
      p1.comer(sorvete);
    }
}
