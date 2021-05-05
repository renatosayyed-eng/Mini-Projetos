public class ContaInexistenteException extends Exception{
    private static final long serialVersionUID = -2740772265260118938L;
    public ContaInexistenteException(int numConta){
        super(String.format("Conta %d inexistente", numConta));
    }   
}