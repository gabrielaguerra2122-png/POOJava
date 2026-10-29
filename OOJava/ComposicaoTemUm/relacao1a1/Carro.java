package ComposicaoTemUm.relacao1a1;
public class Carro {

    Motor motor;

    Carro(){/*pro carro assim que for instanciado ter seu proprio motor, eu pego o atributo motor do tipo MOTOR, da classe carro
        e assim q instancio um carro o motor tbm é intanciado(new motor) e como no construtor do motor eu defini q
        ele recebe um carro como parametro e eu to criando o motor dentro do carro, eu coloco o this no parametro(oou seja,
        eu coloquei o proprio carro q acabou de ser instanciado) */
        this.motor = new Motor(this);
    }
    
    
    
    void acelerar(){
        if(motor.fatoInjecao<2.5){
            motor.fatoInjecao +=0.4;}
        
    }
    void frear(){
        if(motor.fatoInjecao>0.5)
        {motor.fatoInjecao -= 0.4;}}

        void ligar(){
            motor.ligado = true;
        }
        void desligar(){
            motor.ligado = false;
        }
        boolean estaLigado(){
            return motor.ligado;
        }
    
}