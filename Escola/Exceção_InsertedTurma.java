public class Exceção_InsertedTurma extends Exception{
    private static final long serialVersionUID = 3L;
    public Exceção_InsertedTurma(long l){
        System.out.println("A turma com o código " + l + " já está registrada !");
    }  
}