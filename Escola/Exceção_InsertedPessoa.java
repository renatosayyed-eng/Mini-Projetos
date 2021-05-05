public class Exceção_InsertedPessoa extends Exception{
    private static final long serialVersionUID = 2L;
    public Exceção_InsertedPessoa(long l){
        System.out.println("A pessoa com o código/matrícula " + l + " já está registrado !");
    }
}