import java.util.LinkedList;

public class School_Curso {
    private String nome;
    private long códigoCurso;
    private int cargaHorária;
    LinkedList<School_Turma> turmas = new LinkedList<School_Turma>();

    public School_Curso(String s, long l, int i){ nome = s; códigoCurso = l; cargaHorária = i; }

    public String getNome(){ return nome; }

    public long getCódigoCurso(){ return códigoCurso; }

    public int getCargaHorária(){ return cargaHorária; }

    public String toString(){ return String.format(getNome() + " | Código => " + getCódigoCurso() + " | Carga Horária => " + getCargaHorária() + " horas"); }

    public void addTurma(School_Turma turma) throws Exceção_InsertedTurma{
        for(School_Turma t:turmas){
            if(t.getCódigoTurma() == turma.getCódigoTurma()){
                throw new Exceção_InsertedTurma(turma.getCódigoTurma());
            }
        }
        turmas.add(turma);
    }

    public void listarTurmas(){
        for(School_Turma t:turmas){ System.out.println(t.toString()); }
    }

    public School_Turma buscarTurma(long l){
       School_Turma tr = new School_Turma("indefinido", 999999999, 1,1,1,1,1,1);
        for(School_Turma t:turmas){
            if(t.getCódigoTurma() == l){
                return t;
            }
        }
       return tr;
    }

    public void buscarTurmaAluno(long l){
        for(School_Turma t:turmas){
            t.buscarTurmaAluno(l);
        }
    }

    public void buscarTurmaInstrutor(long l){
        for(School_Turma t:turmas){
            t.buscarTurmaInstrutor(l);
        }
    }
}