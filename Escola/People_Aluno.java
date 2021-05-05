public class People_Aluno extends People_Pessoa{
    private long matrícula;

    public People_Aluno(String s, long l){ super(s); matrícula = l;}

    public long getMatrícula(){ return matrícula; }

    public String toString(){ return String.format(getNome() + " | Matrícula => " + getMatrícula() + " | Aluno"); }
}