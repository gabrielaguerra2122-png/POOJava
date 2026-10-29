package HerancaÉum.desafio;

import HerancaÉum.Esportivo;
import HerancaÉum.Luxo;

public class Ferrari extends Carro implements Esportivo, Luxo {
    private boolean ligarTurbo;//Por padrao os 2 atributos boolean sao false
    private boolean ligarAr;
    public Ferrari(double max){
        super(max);
    }


   @Override /*o override nada mais é que so uma validação pra java ter ctz q vc ta sobrescrevendo um metodo/codigo da classe pai
   msm sem ele, vc continua sobrescrevendo, isso é mais visual */
   public double acelerar(){/*sobrescrevi o metodo inteiro da classe pai */
        if(this.velocidadeAtual + getDelta()> VELOCIDADE_MAXIMA){/*se a velocidade atual somado a 15 ultrapassar a velocidade maxima,
            eu automaticamente digo que a velocidade atual é e ssempre vai ser igual a velocidade max */
                return this.velocidadeAtual=VELOCIDADE_MAXIMA;
    }
        else return this.velocidadeAtual+=getDelta();/*caso contrario, se for menor q v.max ele acrescenta 15 */
    }
    public double frear(){
        if(this.velocidadeAtual>=15.0){/*se a velocidade atual for maior que 50, eu freio, se n eu nao posso mais frear pq se n o carro para */
           return this.velocidadeAtual-=15.0;
        }
        else return this.velocidadeAtual = 0;
    }

    @Override
    public void ligarTurbo() {
       ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAR() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if (ligarTurbo && !ligarAr) {/*o if sempre verifica se uma condicao é verdadeira!!
        entao se ligar turbo tiver com true, e ligar ar tiver com false(dara true por causa do !)
        ent ele da true e entra na maio potencia*/
           return 35;
        } else if (ligarTurbo && ligarAr) {/*ele sempre infere(se nao tiver !) a pergunta se isso é true,
        se for false logo no 1 ele nem entra*/
            return 30;
        } else if (!ligarTurbo && !ligarAr) {
            return 20;
        }
          else
            return 15;
   }
}
