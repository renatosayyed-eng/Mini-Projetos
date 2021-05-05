#include "LISTA.h"

int matricula,mat;
char nome[50];

static LISTA* insere(LISTA *l){
  printf("Informe o numero da matricula:\n");
  scanf("%d",&matricula);
  getchar();
  puts("Digite o seu nome:");
  gets(nome);
  ALUNO *a = (ALUNO*)malloc(sizeof(ALUNO));
  a->matricula = matricula;
  strcpy (a->nome,nome);

  return LGInsere(l,a);
}

static void imprime(void *info){
   ALUNO *a = (ALUNO*)info;
   printf("matricula: %d - Nome: %s\n", a->matricula, a->nome);
}

static void compararAluno(void *estrutura, void *mat, void *cont){
    ALUNO* AuxC = (ALUNO*)estrutura;
    int* matri = (int*)mat;
    int* contador = (int*)cont;

    if(AuxC->matricula == *matri){
	printf("Matricula: %d - ", AuxC->matricula);
        printf("Nome: %s", AuxC->nome);
        *contador = 1;
    }
	printf("\n");
}

static int compApagar(void *estrutura, void *mat){
    ALUNO* AuxD = (ALUNO*)estrutura;
    int* matri = (int*)mat;
    int final=0;
	if(AuxD->matricula == *matri){
    final++;
	return final;
	}
	return final;
}

void verifica(LISTA* l){
    if(l==NULL){
        printf("Lista vazia!\n");
    }
    else{
        printf("Lista contem informações!\n");
    }
    getchar();
}

int main(){
 LISTA *l = NULL;

  int menu;

  while(menu!=6){
    printf("\n");
    printf("---------------MENU---------------");
    printf("\n1 - Inserir aluno\n");
    printf("2 - Buscar aluno (por matrícula)\n");
    printf("3 - Imprimir alunos\n");
    printf("4 - Remover aluno (por matrícula)\n");
    printf("5 - Verifica se lista está vazia\n");
    printf("6 - Sair\n");
    printf("----------------------------------\n");
    printf("Informe a opção: ");
      scanf("%d", &menu);
    printf("\n");



    switch(menu){

      case 1:
        l=insere(l);
    	break;

      case 2:
	printf("Informe a matricula\n");
	scanf("%d",&mat);
  LGBuscarpercorre(l, compararAluno, &mat);
       break;

      case 3:
  LGPercorre(l,imprime);
	    break;

      case 4:
  printf("Informe a matricula do aluno a ser apagada:\n");
    scanf("%d",&mat);
  l=LG_Apagar(l, compApagar, &mat);

      case 5:
  verifica(l);
      break;

      case 6:
  printf("Saindo...\n");
  getchar();
  exit(1);

      default:
    printf("Opcao invalida!\nDigite novamente\n");
      break;

    }
  }
  return 0;
}