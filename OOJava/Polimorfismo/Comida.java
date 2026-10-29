package Polimorfismo;

public abstract class Comida {
     private double peso;
   
   public Comida(double peso){
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
}
