import java.util.InputMismatchException;
import java.util.Scanner;

//Universidade Federal do Pampa || 5332403600
public class EscolaAPP{

    public static void main(String[] args){ 
        School_Escola e; School_Curso c; School_Turma t;
        People_Aluno a; People_Instrutor i;

        Scanner input = new Scanner(System.in);

        int iaux1, iaux2, iaux3, iaux4, iaux5, iaux6, op=1;
        long laux;
        String saux1, saux2;

        System.out.println("Informe o nome da escola:");
        saux1 = input.nextLine();
        
        System.out.println("Informe o telefone da escola:");
        saux2 = input.nextLine();

        e = new School_Escola(saux1, saux2);

        System.out.println("Administração | " + e.toString());

        while(op!=0){
            try{
                System.out.println("\n==================== MENU ====================");
                System.out.println("(1) Adicionar / Buscar Curso [Escola]");
                System.out.println("(2) Adicionar / Buscar Turma [Escola]");
                System.out.println("(3) Adicionar / Buscar Aluno [Escola]");
                System.out.println("(4) Adicionar / Buscar Instrutor [Escola]");
                System.out.println("(5) Inserir Aluno [Turma]");
                System.out.println("(6) Inserir Instrutor [Turma]");
                System.out.println("(7) Listar Cursos");
                System.out.println("(8) Listar Turmas");
                System.out.println("(9) Listar Pessoas");
                System.out.println("(0) Sair");
                op = input.nextInt();

                switch(op){
                    
                    case 1: // CURSO (OK)
                    System.out.println("(1) Adicionar / (2) Buscar");
                    iaux1 = input.nextInt();
                    input.nextLine();
                    if(iaux1 == 1) //adicionar
                    {
                        System.out.println("Informe o nome do curso:");
                        saux1 = input.nextLine();
                        System.out.println("Informe o código do curso:");
                        laux = input.nextLong();
                        System.out.println("Informe a carga horária do curso:");
                        iaux2 = input.nextInt();
                        c = new School_Curso(saux1, laux, iaux2);
                        e.addCurso(c);
                    }
                    if(iaux1 == 2) //buscar
                    {
                        System.out.println("Informe o código do curso:");
                        laux = input.nextLong();
                        c = e.buscarCurso(laux);
                        System.out.println(c.toString());
                        System.out.println("\nTurmas:");
                        c.listarTurmas();
                    }
                    break;

                    case 2: // TURMA (OK)
                    System.out.println("(1) Adicionar / (2) Buscar");
                    iaux1 = input.nextInt();
                    if(iaux1 == 1) //adicionar
                    {   
                        System.out.println("Informe o código do curso que a matéria faz parte:");
                        laux = input.nextLong();
                        input.nextLine();
                        c = e.buscarCurso(laux);
                        System.out.println("Informe o nome da matéria:");
                        saux1 = input.nextLine();
                        System.out.println("Informe o código da turma");
                        laux = input.nextLong();
                        e.verificarTurma(laux);
                        System.out.println("Informe o data do início da turma:");
                        System.out.println("Dia Incial:");
                        iaux1 = input.nextInt();
                        System.out.println("Mês Inicial:");
                        iaux2 = input.nextInt();
                        System.out.println("Ano Inicial");
                        iaux3 = input.nextInt();
                        System.out.println("Informe o data do término da turma:");
                        System.out.println("Dia Final:");
                        iaux4 = input.nextInt();
                        System.out.println("Mês Final:");
                        iaux5 = input.nextInt();
                        System.out.println("Ano Final");
                        iaux6 = input.nextInt();
                        t = new School_Turma(saux1, laux, iaux1, iaux2, iaux3, iaux4, iaux5, iaux6);
                        c.addTurma(t);
                    }
                    if(iaux1 == 2) //buscar
                    {
                        System.out.println("Informe o código da turma");
                        laux = input.nextLong();
                        t = e.buscarTurma(laux);
                        System.out.println(t.toString());
                        System.out.println("\nAlunos:");
                        t.listarAlunos();
                        System.out.println("Instrutores:");
                        t.listarInstrutores();
                    }
                    break;

                    case 3: // ALUNO (OK)
                    System.out.println("(1) Adicionar / (2) Buscar");
                    iaux1 = input.nextInt();
                    input.nextLine();
                    if(iaux1 == 1) //adicionar
                    {
                        System.out.println("Informe o nome do aluno:");
                        saux1 = input.nextLine();
                        System.out.println("Informe a matrícula do aluno:");
                        laux = input.nextLong();
                        a = new People_Aluno(saux1,laux);
                        e.addPessoa(a);
                    }
                    if(iaux1 == 2) //buscar
                    {
                        System.out.println("Informe a matrícula do aluno:");
                        laux = input.nextLong();
                        a = e.buscarAluno(laux);
                        System.out.println(a.toString());
                        System.out.println("\nTurmas:");
                        e.buscarTurmaAluno(laux);
                    }
                    break;

                    case 4: // INSTRUTOR (OK)
                    System.out.println("(1) Adicionar / (2) Buscar");
                    iaux1 = input.nextInt();
                    input.nextLine();
                    if(iaux1 == 1) //adicionar
                    {
                        System.out.println("Informe o nome do instrutor:");
                        saux1 = input.nextLine();
                        System.out.println("Informe o código do instrutor:");
                        laux = input.nextLong();
                        i = new People_Instrutor(saux1,laux);
                        e.addPessoa(i);
                    }
                    if(iaux1 == 2) //buscar
                    {
                        System.out.println("Informe o código do professor:");
                        laux = input.nextLong();
                        i = e.buscarInstrutor(laux);
                        System.out.println(i.toString());
                        System.out.println("\nTurmas:");
                        e.buscarTurmaInstrutor(laux);
                    }
                    break;

                    case 5: // INSERIR ALUNO (OK)
                    System.out.println("Informe a matrícula do aluno:");
                    laux = input.nextLong();
                    a = e.buscarAluno(laux);
                    System.out.println("Informe o código da turma:");
                    laux = input.nextLong();
                    t = e.buscarTurma(laux);
                    t.addAluno(a);
                    break;

                    case 6: //INSERIR INSTRUTOR (OK)
                    System.out.println("Informe o código do instrutor:");
                    laux = input.nextLong();
                    i = e.buscarInstrutor(laux);
                    System.out.println("Informe o código da turma:");
                    laux = input.nextLong();
                    t = e.buscarTurma(laux);
                    t.addInstrutor(i);
                    break;

                    case 7: //LISTAR CURSOS (OK)
                    e.listarCursos();
                    break;

                    case 8: //LISTAR TURMAS (OK)
                    e.listarTurmas();
                    break;
                    case 9: //LISTAR PESSOAS (OK)
                    e.listarPessoas();
                    break;

                    case 0: //SAIR (OK)
                    input.close();
                    System.out.println(">< BYE BYE ><");
                    break;

                }
            }
            catch(Exceção_InsertedCurso ic){
                System.err.println(ic);
                ic.printStackTrace();
                op = 1;
            }
            catch(Exceção_InsertedPessoa ip){
                System.err.println(ip);
                ip.printStackTrace();
                op = 1;
            }
            catch(Exceção_InsertedTurma it){
                System.err.println(it);
                it.printStackTrace();
                op = 1;
            }
            catch(Exceção_NotFoundCurso nfc){
                System.err.println(nfc);
                nfc.printStackTrace();
                op = 1;
            }
            catch(Exceção_NotFoundPessoa nfp){
                System.err.println(nfp);
                nfp.printStackTrace();
                op = 1;
            }
            catch(Exceção_NotFoundTurma nft){
                System.err.println(nft);
                nft.printStackTrace();
                op = 1;
            }
            catch(InputMismatchException ime){
                System.err.println("Opção de menu inválida !");
                ime.printStackTrace();
                op = 1;
            }
        }
    }
}