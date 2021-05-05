import java.util.LinkedList;
import java.util.Collections;

public class School_Escola{
    private String nome;
    private String telefone;
    LinkedList<People_Pessoa> pessoas = new LinkedList<People_Pessoa>();
    LinkedList<School_Curso> cursos = new LinkedList<School_Curso>();

    public School_Escola(String s, String t){ nome = s; telefone = t; }

    public String getNome(){ return nome; }

    public String getTelefone(){ return telefone; }

    public String toString(){ return String.format(getNome() + " | Telefone => " + getTelefone()); }

    public void addPessoa(People_Pessoa pessoa) throws Exceção_InsertedPessoa{
        for(People_Pessoa p:pessoas){
            if(p instanceof People_Aluno && pessoa instanceof People_Aluno){
                if(((People_Aluno)p).getMatrícula() == ((People_Aluno)pessoa).getMatrícula()){
                    throw new Exceção_InsertedPessoa(((People_Aluno)pessoa).getMatrícula());
                }
            }
            
            if(p instanceof People_Instrutor && pessoa instanceof People_Instrutor){
                if(((People_Instrutor)p).getCódigo() == ((People_Instrutor)pessoa).getCódigo()){
                    throw new Exceção_InsertedPessoa(((People_Instrutor)pessoa).getCódigo());
                }
            }
        }

        pessoas.add(pessoa);
    }

    public void addCurso(School_Curso curso) throws Exceção_InsertedCurso{
        for(School_Curso c:cursos){
            if(c.getCódigoCurso() == curso.getCódigoCurso()){
                throw new Exceção_InsertedCurso(curso.getCódigoCurso());
            }
        }

        cursos.add(curso);
    }

    public void listarPessoas(){
        Collections.sort(pessoas);
        for(People_Pessoa p:pessoas){
            if(p instanceof People_Aluno){ System.out.println(((People_Aluno)p).toString()); }
            if(p instanceof People_Instrutor){ System.out.println(((People_Instrutor)p).toString()); }
        }
    }

    public void listarCursos(){
        for(School_Curso c:cursos){ System.out.println(c.toString()); }
    }

    public void listarTurmas(){
        for(School_Curso c:cursos){
            System.out.println();
            System.out.println(c.toString());
            System.out.println("Turmas");
            c.listarTurmas();
        }
    }

    public School_Curso buscarCurso(long l) throws Exceção_NotFoundCurso{
        for(School_Curso c:cursos){
            if(c.getCódigoCurso() == l){
                return c;
            }
        }
        throw new Exceção_NotFoundCurso(l);
    }

    public School_Turma buscarTurma(long l) throws Exceção_NotFoundTurma{
        School_Turma t;
        for(School_Curso c:cursos){
            t = c.buscarTurma(l);
            if(t.getCódigoTurma() == l){
                return t;
            }
        }
        throw new Exceção_NotFoundTurma(l);
    }

    public People_Aluno buscarAluno(long l) throws Exceção_NotFoundPessoa{
        for(People_Pessoa p:pessoas){
            if(p instanceof People_Aluno){
                if(((People_Aluno)p).getMatrícula() == l){
                    return (People_Aluno)p;
                }
            }
        }
        throw new Exceção_NotFoundPessoa(l);
    }

    public People_Instrutor buscarInstrutor(long l) throws Exceção_NotFoundPessoa{
        for(People_Pessoa p:pessoas){
            if(p instanceof People_Instrutor){
                if(((People_Instrutor)p).getCódigo() == l){
                    return (People_Instrutor)p;
                }
            }
        }
        throw new Exceção_NotFoundPessoa(l);
    }

    public void buscarTurmaAluno(long l){
        for(School_Curso c:cursos){
            c.buscarTurmaAluno(l);
        }
    }

    public void buscarTurmaInstrutor(long l){
        for(School_Curso c:cursos){
            c.buscarTurmaInstrutor(l);
        }
    }

    public void verificarTurma(long l) throws Exceção_InsertedTurma{
        School_Turma t;
        for(School_Curso c:cursos){
            t = c.buscarTurma(l);
            if(t.getCódigoTurma() == l){
                throw new Exceção_InsertedTurma(l);
            }
        }
    }
}