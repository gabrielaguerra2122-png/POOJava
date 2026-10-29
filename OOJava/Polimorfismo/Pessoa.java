package Polimorfismo;

public class Pessoa {
   private double peso;
   
   public Pessoa(double peso){
    setPeso(peso);
   }

   public double getPeso(){
    return this.peso;
   }

   public void setPeso(double peso){
    if(peso>=0){
        this.peso = peso;
    }
   }

//polimorfismo dinamico pq esse metodo vai aceitar toda classe q herdar de comida
   public void comer(Comida comida){
    this.peso += comida.getPeso();

   }

//polimorfismos estaticos
   public void comer1(Feijao feijao){
    this.peso += feijao.getPeso();
   }
   public void comer1(Sorvete sorvete){
    this.peso += sorvete.getPeso();
   }

}
