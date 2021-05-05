public class Exceção_NotFoundTurma extends Exception{
    private static final long serialVersionUID = 6L;
    public Exceção_NotFoundTurma(long l){
        System.out.println("Não existe turma com o código " + l + " registrado !");
    }  
}