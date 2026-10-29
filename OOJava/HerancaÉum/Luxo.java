package HerancaÉum;

public interface Luxo {
    void ligarAR();
    void desligarAr();// isso é a msm coisa de: public abstract void desligarAr
    //pq implicitamente por padrao todo metodo de interfaces sao abstratas e publicas

    /*defini um metodo padrao na interface, é como se eu tivesse um metodo opcional onde eu posso ou nao
    * sobrescrever, pq nao é obrigatorio implementar um corpo a esse metodo nas classes que
    * tiverem essa interface.
    * entao o nivel do ar por padrao se estiver ligado e o metodo nao for definido na classe explicitamente
    * pra ser sobrescrito, por padrao sempre sera 1*/
    default int nivelDoAr(){
        return 1;
    }
}
