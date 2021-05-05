public class Exceção_NotFoundPessoa extends Exception{
    private static final long serialVersionUID = 5L;
    public Exceção_NotFoundPessoa(long l){
        System.out.println("Não existe pessoa com o código/matrícula " + l + " registrado !");
    }
}