public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldoInicial){
        super(saldoInicial);
    }

    public void debitaTaxa() throws SaldoInsuficienteException{
        if(retornaSaldo() < 400){
            debita(5);
        }else{
            debita(3);
        }
    }
    
    public String toString(){
        return String.format("Conta Corrente: %d || Saldo: %f || Emprestimo Disponível: %f", retornaNumConta(), retornaSaldo(), valorEmprestimo());
    }
}