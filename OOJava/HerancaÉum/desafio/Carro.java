package HerancaÉum.desafio;

import HerancaÉum.Esportivo;

public class Carro  {
    public  final double VELOCIDADE_MAXIMA;
    public double velocidadeAtual;
    private int delta = 5;
    public int getDelta(){
        return this.delta;
    }
    public void setDelta(int valor){
         this.delta = valor;
    }
   Carro(double velocidadeMaxima){
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }
    
    public double acelerar(){
        if(this.velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA){/*tem que ser < e nao <= pq se for igual a tal numero, ele continua acelerando, tipo
            se eu colocar <=50, se ele chegar a 50 ele acelera mais 1 vez mas chega no limite de 55, pq ele
            passa do range q eu defini de so acelerar se for menor ou igual a 50(<=50)*/
        return this.velocidadeAtual= VELOCIDADE_MAXIMA;
    }
        else return this.velocidadeAtual+=getDelta();
    }
    /*usei os getDelta ai pra inferir que é o delta atual, nao precisava fzr na classe carro pq como eu sobrescrevi
    * o da ferrari ele usa o da ferrari*/
    public double frear(){
        if(this.velocidadeAtual>=5.0){
           return this.velocidadeAtual-=5.0;
        }
        else return this.velocidadeAtual;
    }
    @Override
    public String toString() {
        return "Velocidade atual é " + velocidadeAtual;    }


}
