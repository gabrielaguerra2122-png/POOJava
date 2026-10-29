package ComposicaoTemUm.relacaoNpraM;
import java.util.ArrayList;

public class Curso {
    
    /*cada curso criado tera sua propria lista de alunos, assim como cada aluno criado tera sua propria lista de cursos
    ou seja, as variaveis armazenadas na lista ou de cursos ou de alunos, cada uma aponta pra um objeto na memoria, q tbm
    tem uma lista como atriuto, e quando eu adiciono um aluno na lista de um objeto curso, a variavel desse objeto curso é
    tbm adicionado na lista de cursos desse objeto aluno q eu acabei de adicionar na lista de alunos do objeto curso */
    final String nome;
    final ArrayList<Aluno> alunos = new ArrayList<>();
            Curso(String nome){
                this.nome = nome;
            }

    void adicionarAluno(Aluno aluno){/*criei um metodo pra adicionar um aluno no atributo lista de alunos do objeto 
        curso q chamou o metodo */
        this.alunos.add(aluno);/*ele pega a lista do obj q chamou o metodo e adiciona o aluno */
        aluno.cursos.add(this);}/*dps ele pega o atributo lista de cursos do objeto aluno adicionado(cada aluno tem uma lista dos cursos
        q ele faz parte) e adiciona no indice da lista a referencia de memoria do objeto Curso, que dentro dele tem uma lista
      de alunos a qual ele faz parte*/
    @Override
    public String toString() {
        return nome;
    }
}
