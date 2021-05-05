import java.util.InputMismatchException;
import java.util.Scanner;

public class ContasAPP {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ContaBancaria cb;
        Contas contas = new Contas();
        int op=1;
        while(op!=0){
        try{
        System.out.println("(1) Criar conta");
        System.out.println("(2) Ver conta");
        System.out.println("(3) Listar contas");
        System.out.println("(4) Realizar depósito");
        System.out.println("(5) Realizar saque");
        System.out.println("(6) Realizar empréstimo");
        System.out.println("(7) Creditar juros");
        System.out.println("(8) Debitar taxas");
        System.out.println("(0) Sair");
        System.out.println("Informe a alternativa:");
        op = input.nextInt();

        switch(op){
            case 1:
            System.out.println("(1) Conta Corrente");
            System.out.println("(2) Conta Rentavel");
            System.out.println("(3) Conta Especial");
            System.out.println("Informe a alternativa:");
            int opC = input.nextInt();
            System.out.println("Informe o valor do depósito inicial:");
            double valor = input.nextDouble();
            if(opC == 1){
                cb = new ContaCorrente(valor);
                contas.adicionar(cb);
            }
            if(opC == 2){
                cb = new ContaRentavel(valor);
                contas.adicionar(cb);
            }
            if(opC == 3){
                cb = new ContaEspecial(valor);
                contas.adicionar(cb);
            }
            break;

            case 2:
            System.out.println("Informe o número da conta:");
            opC = input.nextInt();
            cb = contas.buscar(opC);
            System.out.println(cb.toString());
            break;

            case 3:
            contas.toString();
            break;

            case 4:
            System.out.println("Informe o número da conta:");
            opC = input.nextInt();
            cb = contas.buscar(opC);
            System.out.println("Informe o valor de depósito:");
            valor = input.nextDouble();
            cb.deposita(valor);
            break;

            case 5:
            System.out.println("Informe o número da conta:");
            opC = input.nextInt();
            cb = contas.buscar(opC);
            System.out.println("Informe o valor de saque:");
            valor = input.nextDouble();
            cb.debita(valor);
            break;
            
            case 6:
            System.out.println("Informe o número da conta:");
            opC = input.nextInt();
            cb = contas.buscar(opC);
            System.out.println("O valor de emprestimo permitido é de R$ " + cb.valorEmprestimo());
            System.out.println("Informe o valor do emprestimo");
            valor = input.nextDouble();
            if((cb.valorEmprestimo()-valor)<0){
                System.out.println("O valor excede seu limite");
            }else{
                System.out.println("Emprestimo liberado");
                System.out.println("Informe a quantidade de parcelas para pagamento (1 a 12 vezes)");
                opC = input.nextInt();
                if(opC >=1 && opC <=12){
                    double emp = valor+(valor*0.5);
                    emp /= opC;
                    System.out.printf("O emprestimo terá juros de 50 %%, sendo parcelado em %d vezes de R$ %f\n", opC, emp);   
                }
                else{
                    System.out.println("Parcelamento indisponível");
                }
            }
            break;

            case 7:
            contas.creditaJuros();
            break;

            case 8:
            contas.debitaTaxa();
            break;

            case 0:
            break;

            default:
            System.out.println("Opção Inválida");
            break;
        } 
        }
        catch(ContaInexistenteException cie){
            cie.printStackTrace();
            System.err.println("Conta Inexistente!");
            op = 11;
        }
        catch(SaldoInsuficienteException sie){
            sie.printStackTrace();
            System.err.println("Saldo Insuficiente!");
            op = 11;
        }
        catch(InputMismatchException i){
            i.printStackTrace();
            System.err.println("Opção de entrada para o menu inválida!");
            op = 11;
        }
        finally{
            if(op == 0){
            System.out.println(">< BYE BYE ><");
            input.close();
            }
        }
    }
    }
}