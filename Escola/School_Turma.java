import java.util.Calendar;
import java.util.Collections;
import java.text.SimpleDateFormat;
import java.util.LinkedList;

public class School_Turma{
    private String matéria;
    private long códigoTurma;
    private Calendar dataInício = Calendar.getInstance();
    private Calendar dataFinal = Calendar.getInstance();
    LinkedList<People_Aluno> alunos = new LinkedList<People_Aluno>();
    LinkedList<People_Instrutor> instrutores = new LinkedList<People_Instrutor>();
    
    public School_Turma(String s, long l, int iD, int iM, int iA, int fD, int fM, int fA){
        matéria = s;
        códigoTurma = l;
        dataInício.set(Calendar.YEAR, iA);
        dataInício.set(Calendar.MONTH, iM-1);
        dataInício.set(Calendar.DAY_OF_MONTH, iD);
        dataFinal.set(Calendar.YEAR, fA);
        dataFinal.set(Calendar.MONTH, fM-1);
        dataFinal.set(Calendar.DAY_OF_MONTH, fD);
    }

    public String getMatéria(){ return matéria; }

    public long getCódigoTurma(){ return códigoTurma; }

    public String getDataInicial(){
        SimpleDateFormat sample = new SimpleDateFormat("dd/MM/yyyy");
        String data = sample.format(dataInício.getTime());
        return data;
    }

    public String getDataFinal(){
        SimpleDateFormat sample = new SimpleDateFormat("dd/MM/yyyy");
        String data = sample.format(dataFinal.getTime());
        return data;
    }

    public String toString(){ return String.format(getMatéria() + " | Código => " + getCódigoTurma() + " | Período: " + getDataInicial() + " à " + getDataFinal()); }

    public void addAluno(People_Aluno aluno) throws Exceção_InsertedPessoa{
        for(People_Aluno a:alunos){
            if(a.getMatrícula() == aluno.getMatrícula()){
                throw new Exceção_InsertedPessoa(aluno.getMatrícula());
            }
        }
        alunos.add(aluno);
    }

    public void addInstrutor(People_Instrutor instrutor) throws Exceção_InsertedPessoa{
        for(People_Instrutor i:instrutores){
            if(i.getCódigo() == instrutor.getCódigo()){
                throw new Exceção_InsertedPessoa(instrutor.getCódigo());
            }
        }
        instrutores.add(instrutor);
    }

    public void listarAlunos(){
        Collections.sort(alunos);
        for(People_Aluno a:alunos){ System.out.println(a.toString()); }
    }

    public void listarInstrutores(){
        Collections.sort(instrutores);
        for(People_Instrutor i:instrutores){ System.out.println(i.toString()); }
    }

    public void buscarTurmaAluno(long l){
        for(People_Aluno a:alunos){
            if(a.getMatrícula() == l){
                System.out.println(toString());
            }
        }
    }

    public void buscarTurmaInstrutor(long l){
        for(People_Instrutor i:instrutores){
            if(i.getCódigo() == l){
                System.out.println(toString());
            }
        }
    }
}