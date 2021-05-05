import java.util.Scanner;
import java.util.LinkedList;

public class ContactBookAPP{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        LinkedList<ContactPerson> agenda = new LinkedList<ContactPerson>();
        int op = 0;
        while(op != 5){
        System.out.println("-----------------------------");
        System.out.println("1 => Cadastrar novo contato");
        System.out.println("2 => Procurar contato por nome");
        System.out.println("3 => Procurar contato por telefone");
        System.out.println("4 => Mostrar todos os contatos");
        System.out.println("5 => Sair");
        System.out.println("-----------------------------");
        op = input.nextInt();
        
        String fn,mn,ln,ddd,telefone,rua,numero,cidade,estado,cep,desc,user,domain;
        ContactPerson contato;
        Name nome;
        Address endereço;
        Phone number;
        Email login;
        
        switch(op){
            case 1:
            System.out.println("Informe o primeiro nome");
            fn = input.next();
            input.nextLine();
            System.out.println("Informe o primeiro sobrenome");
            mn = input.next();
            input.nextLine();
            System.out.println("Informe o segundo sobrenome");
            ln = input.next();
            input.nextLine();
            System.out.println("Informe o DDD:");
            ddd = input.next();
            input.nextLine();
            System.out.println("Informe o Telefone:");
            telefone = input.next();
            input.nextLine();
            System.out.println("Informe o dominio do E-mail: Ex.: gmail.com");
            domain = input.next();
            input.nextLine();
            System.out.println("Informe o user do E-mail: Ex.: alexandro22@gmail.com => alexandro22");
            user = input.next();
            input.nextLine();
            System.out.println("Informe o logradouro:");
            rua = input.next();
            input.nextLine();
            System.out.println("Informe o número:");
            numero = input.next();
            input.nextLine();
            System.out.println("Informe a cidade:");
            cidade = input.next();
            input.nextLine();
            System.out.println("Informe a sigla do estado:");
            estado = input.next();
            input.nextLine();
            System.out.println("Informe o CEP:");
            cep = input.next();
            input.nextLine();
            System.out.println("Informe a descrição do contato:");
            desc = input.next();
            input.nextLine();
            nome = new Name(fn,mn,ln);
            endereço = new Address(rua, numero, cidade, estado, cep);
            number = new Phone(telefone, ddd);
            login = new Email(user, domain);
            contato = new ContactPerson(nome, endereço, number, login);
            contato.setDescription(desc);
            agenda.add(contato);
            break;
            case 2:
                String nana;
                System.out.println("Digite 1º nome:");
                nana = input.next();
                input.nextLine();
                
                for(ContactPerson i:agenda){
                    System.out.println(i.nome.getFirstName());
                    if(nana.equals(i.nome.getFirstName())){
                        System.out.println(i.toString());
                    }   
            }

            break;
            case 3:
               String tel;
                System.out.println("Digite telefone sem DDD:");
                tel = input.next();
                input.nextLine();
                
                for(ContactPerson i:agenda){
                    System.out.println(i.telefone.getNumber());
                    if(tel.equals(i.telefone.getNumber())){
                        System.out.println(i.toString());
                    }   
            }

            break;
            case 4:
            for(ContactPerson i:agenda){
                System.out.println(i.toString());
            }
            break;
            case 5:
            System.out.println(">< BYE BYE ><");
            input.close();
            break;
        }
        }
    }
}