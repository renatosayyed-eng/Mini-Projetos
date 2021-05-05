import java.util.LinkedList;

public class Contas {
    private LinkedList<ContaBancaria> contas;

    public Contas(){
        contas = new LinkedList<ContaBancaria>();
    }

    public void creditaJuros(){
        for(ContaBancaria cb : contas){
            if(cb instanceof ContaRentavel){
                ((ContaRentavel)cb).creditaJuros();
            }
        }
    }

    public void debitaTaxa() throws SaldoInsuficienteException{
        for(ContaBancaria cb : contas){
            cb.debitaTaxa();
        }
    }

    public void adicionar(ContaBancaria conta){
        contas.add(conta);
    }

    public String toString(){
        for(ContaBancaria cb : contas){
            System.out.println(cb.toString());
        }
        return "Concluído";
    }

    public ContaBancaria buscar(int numConta) throws ContaInexistenteException{
        for(ContaBancaria cb : contas){
            if(cb.retornaNumConta() == numConta){
                return cb;
            } 
        }
        throw new ContaInexistenteException(numConta);
    }
}