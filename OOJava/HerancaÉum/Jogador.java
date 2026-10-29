package HerancaÉum;
/*essa ideia do professor é criar uma classe generica de jogador onde ele vai ter atributos de posicao
dentro de um tabuleiro(como um grafico cartesiano, de coordenadas) e dependendo da direção pra onde ele anda, o X vai ser encrementado
ou decrementado, e a mesma coisa pro Y. */
public class Jogador {
   protected int posicaoX;//coluna
    protected int posicaoY;//linha
  protected int vida = 100;

  public int getVida(){
    return this.vida;
  }
   


/*metodo que faz o objeto jogador que chamou o metodo atacar o outro */
  public boolean atacar(Jogador oponente){
    int deltaX = Math.abs(this.posicaoX - oponente.posicaoX);/*calculei a distancia entre o objt q chamou o metodo e seu oponente */
    int deltaY = Math.abs(this.posicaoY - oponente.posicaoY);/*o math.abs é pra pegar o valor absoluto do calculo, se der um numero -1
    por exemplo, ele me da um 1, pq nesse caso n tinha necessidade de ser negativo,  */
    if(deltaX == 0 && deltaY ==1){/*se deltaX for 0, ou seja a distancia deles na coluna, eles estao na mesma coluna, se deltaY for 1, 
        eles tao em linhas diferentes, um em cima do outro pela diferença ser 1, ent poderao se atacar */
        oponente.vida-=10;
        return true;
    }
    else if( deltaX ==1 && deltaY == 0 ){/*se deltaX for 1(a diferença da distancia deles na coluna) que dizer que eles estao em colunas
        diferentes mas lado a lado pela diferenca ser 1, e se o deltay for 0, quer dizer que eles estao na msm linha*/
        oponente.vida-=10;
        return true;
    }
    else {
        return false;}/*se eles nao tiverem um ao lado do outro(colunas diferentes, msm linha) ou um em cima do outro(mesma coluna,
        linhas diferentes), eles vao estar distantes, ent n vai dar pra atacar */
        
   }



    /*esse metodo vai retornar true ou false dependendo do limite q eu estabeler do tabuleiro, se o jogador ultrapassar ou tentar ir
    em negativo -100, nao acontece nada, ele nao anda */
   public boolean andar(EnumTeste direcao){
        if(direcao == EnumTeste.NORTE){/*essa igualdade ai da certo pq o objeto ja ta instanciado e eu to acessando ele
            pela classe qnd eu passo o parametro, ent msm q ele esteja comparando endereços de meoria, é o padrao. */
            posicaoY--;
             return true;
        }
        else if(direcao == EnumTeste.LESTE){
            posicaoX++;
            return true;
        }
        else if(direcao == EnumTeste.OESTE){
            posicaoX--;
            return true;
        }
        else if(direcao == EnumTeste.SUL){
            posicaoY++;
            return true;
        }
            return false;

    }
    public int getPosicaoX(){
return this.posicaoX;
    }
    public int getPosicaoY(){
return this.posicaoY;}

public int setValorX(int i){
this.posicaoX = Math.abs(i);
return posicaoX;
}
public int setValorY(int i){
this.posicaoY = Math.abs(i);
return posicaoX;
}
}


