public class Exceção_InsertedCurso extends Exception{
    private static final long serialVersionUID = 1L;
    public Exceção_InsertedCurso(long l){
        System.out.println("O curso com o código " + l + " já está registrado !");
    }
}