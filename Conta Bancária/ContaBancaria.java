public abstract class ContaBancaria implements EmprestimoFinanciavel{
    private static int proxNumConta = 1000;
    public int numConta;
    private double saldo;

    public ContaBancaria(double saldoInicial){
        saldo = saldoInicial;
        numConta = proxNumConta + 1;
        proxNumConta++;
    }

    public static void setNumContaIni(int num){
        proxNumConta = num;
    }

    public static int retornaProxNumConta(){
        return proxNumConta;
    }

    public void deposita(double valor){
        saldo += valor;
    }

    public void debita(double valor) throws SaldoInsuficienteException{
        if((saldo-valor)<0) throw new SaldoInsuficienteException();
        else saldo-=valor;
    }

    public double retornaSaldo(){
        return saldo;
    }

    public int retornaNumConta(){
        return numConta;
    }

    public double valorEmprestimo(){
        return (saldo*2);
    }

    public abstract void debitaTaxa() throws SaldoInsuficienteException;
    public abstract String toString();
}