package abstrato;

public abstract class Animal {
    public String respirar(){
        return "Usando oxigenio";
    }
 public abstract String mover();/*por animal ser algo mt generico,
 se mover é diferente pra cada especie especifica(classe concreta, subclasses) pra resolver isso,
 eu defino que o metodo dessa classe generica abstrata(abstrata por ser generica) é um metodo abstrato
 entao toda subclasse que herdar dessa classe vai ter q obrigatoriamente implementar um corpo de codigo
 nesse metodo, enquanto o metodo de cima se eu quiser eu posso reescrever.
 DETALHE: so é possivel ter metodo abstrato em classe abstrata, classe concreta OBRIGATORIAMENTE tem que
 ter todos os metodos implementados. Mesmo que animal fosse generico(um modelo abstrato), ele continuaria
 sendo concreto, poderia ser instanciado, mas nao pode.*/
}
