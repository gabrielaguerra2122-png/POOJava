package Teste;
import HerancaÉum.desafio.Ferrari;
import HerancaÉum.desafio.Jeep;
public class CarroTeste {
    public static void main(String[] args) {
        Ferrari f = new Ferrari(400);

        Jeep j = new Jeep(200);
        System.out.println("Velocidade da Ferrari é " + f.velocidadeAtual);

        System.out.println("Velocidade do Jeep é " + j.velocidadeAtual);
        f.ligarTurbo();
        System.out.println("Velocidade da Ferrari é " + f.acelerar());

        System.out.println("Velocidade do Jeep é " + j.acelerar());

        System.out.println("Velocidade da Ferrari é " + f.acelerar());

        System.out.println("Velocidade do Jeep é " + j.acelerar());

        System.out.println("->" + j);
        System.out.println("->" + f);//usando o to string

        
    }
}
