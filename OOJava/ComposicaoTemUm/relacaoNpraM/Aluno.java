package ComposicaoTemUm.relacaoNpraM;
import java.util.ArrayList;

public class Aluno {
  
    final String nome;
    final ArrayList<Curso> cursos = new ArrayList<>();/*qnd eu crio uma lista constante significa q eu nao posso atribuir
    a variavel q guarda o endereço de memoria dela a outra lista(cursos = new ArrayList();) oq é constante, ou seja, n muda
    é o endereço de memoria q aql variavel vai apontar(sempre vai apontar pra aql lista, nao tem como mudar), mas os elementos
    mudam sim. */

    Aluno(String nome){
        this.nome = nome;
    }

    void adicionarCurso(Curso curso){/*metodo pra adicionar um curso na lista de cursos do aluno q chamou o metodo */
        this.cursos.add(curso);/*adiciono o curso na lista de cursos do objeto aluno q chamou o metodo */
        curso.alunos.add(this);/*e adicionei na lista de alunos desse objeto curso, a referencia de memoria desse objeto aluno
        q dentro dele tem uma lista com cursos a qual ele tb ta, pode ser em qlqr indice, depende da ordem de inserção */

    }  @Override
    public String toString() {
       
        return nome;}
/*metodo pra procurar um curso pelo nome, dentro da lista de cursos de um determinado aluno */
            Curso obterCurso(String nome){
                for(Curso curso1: this.cursos){/*para cada curso dentro da lista de cursos do aluno q chamou o metodo */
                    if(curso1.nome.equalsIgnoreCase(nome)){/*se o curso atual tiver um nome q se iguala ao nome passado no parametro */
                        return curso1;/*eu retorno esse curso */

                    }
                }
                return null;/*se nao tiver, eu retorno nulo */
                /*eu coloquei curso1.nome pq nome é string ent ele vai verificar strings
                 pq eu nao defini o equals dele, ent ele verificaria o endereço de memoria */
            }

    
}
