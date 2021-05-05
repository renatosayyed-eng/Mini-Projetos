public class ContaEspecial extends ContaRentavel{
    static double juroCorrente = 0.07;

    public ContaEspecial(double saldoInicial){
        super(saldoInicial);
    }

    public static void taxaJuros(double novaTaxa){
        juroCorrente = (novaTaxa/100);
    }

    public static double taxaJuros(){
        return (juroCorrente*100);
    }

    public void debitaTaxa() throws SaldoInsuficienteException{
            debita(2);
    }

    public void creditaJuros(){
        deposita(retornaSaldo()*juroCorrente);
    }

    public String toString(){
        return String.format("Conta Especial: %d || Saldo: %f || Juros: %f %%|| Emprestimo Disponível: %f", retornaNumConta(), retornaSaldo(), taxaJuros(), valorEmprestimo());
    }
}