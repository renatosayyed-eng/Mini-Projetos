public class ContaRentavel extends ContaBancaria{
    static double juroCorrente = 0.05;
    
    public ContaRentavel(double saldoInicial){
        super(saldoInicial);
    }

    public static void taxaJuros(double novaTaxa){
        juroCorrente = (novaTaxa/100);
    }

    public static double taxaJuros(){
        return (juroCorrente*100);
    }

    public void debitaTaxa() throws SaldoInsuficienteException{
        if(retornaSaldo() < 400){
            debita(4);
        }else{
            debita(2);
        }
    }

    public void creditaJuros(){
        deposita(retornaSaldo()*juroCorrente);
    }

    public String toString(){
        return String.format("Conta Rentavel: %d || Saldo: %f || Juros: %f %%|| Emprestimo Disponível: %f", retornaNumConta(), retornaSaldo(), taxaJuros(), valorEmprestimo());
    }
}