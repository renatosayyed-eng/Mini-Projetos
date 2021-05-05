public class Exceção_NotFoundCurso extends Exception{
    private static final long serialVersionUID = 4L;
    public Exceção_NotFoundCurso(long l){
        System.out.println("Não existe curso com o código " + l + " registrado !");
    }
    public Exceção_NotFoundCurso(String s){
        System.out.println("Não existe curso com o nome " + s + " registrado !");
    }  
}