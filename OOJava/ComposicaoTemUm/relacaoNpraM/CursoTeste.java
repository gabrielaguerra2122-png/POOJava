package ComposicaoTemUm.relacaoNpraM;
public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Eleonor");
        Aluno aluno2 = new Aluno("Gregory");
        Aluno aluno3 = new Aluno("Maria");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Linux e Windows");
        Curso curso3 = new Curso("Icloud e IA");

        curso1.adicionarAluno(aluno3);/*adicionei a varriavel q guarda a referencia de memoria do objeto aluno3 na lista de alunos 
        do objeto curso1, e ao mesmo tempo, adicionei a variavel que guarda a referencia de memoria do 
        obj curso1 na lista de cursos do objeto aluno3 */
        curso1.adicionarAluno(aluno2);
        aluno2.adicionarCurso(curso2);

        aluno1.adicionarCurso(curso3);/*adicionei na lista do objeto aluno 1 o curso3, e dentro do curso 3 eu tbm adicionei o aluno3,
        q tem uma lista de cursos a qual ele tb ta dentro */
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for(Aluno aluno: curso3.alunos){
            System.out.println("Alunos matriculados no curso de " + curso3 + " são: " + aluno);
            System.out.println();
        }

        System.out.println(aluno1.cursos.get(0).alunos);/*pego o aluno1, chamo o curso do indice 0 da lista desse aluno, 
        e dps peço pra mostrar a lista de alunos desse curso de indice 0 q o aluno1 faz parte. */


       System.out.println(aluno1.obterCurso("slar")); 
       Curso cursoEncontrado = aluno2.obterCurso("Java Completo");/*como o metodo retorna um curso, eu armazeno ele numa variavel
       curso */
       if(cursoEncontrado != null){/*se o resultado do metodo q foi armazenado na variavel curso for diferente de null */
        System.out.println(cursoEncontrado.nome);
        System.out.println(cursoEncontrado.alunos);/*como ele me retorna o curso q deu true pro equals, eu imprimo o a lista
        de alunos do curso q foi armazenado na variavel cursoEncontrado */
       }
      
    }
}
