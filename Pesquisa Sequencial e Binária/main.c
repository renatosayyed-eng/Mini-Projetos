#include "PCD.h"

int main(){
listatemp = (NO*)malloc(1000*sizeof(NO));
ele = 0;
count = 0;
ins_rem = 0;
shad = 0;
cc = 0;
strcpy(valid,"ABCDEFGHIJKLMNOPQRSTUVWXYZ ");
long int num;
int op, op2,ooo, j=2;
while(op!=6){
  printf("1 - Inserir\n2 - Consultar\n3 - Excluir\n4 - Exibir tudo\n5 - Inserir em lote\n6 - Encerrar\n");
  scanf("%d",&op);

  switch(op){
    case 1:
    if(j==1){
      printf("Nao e possivel inserir mais registros. Reinicie o programa.\n");
    }
    if(j==2){
    insere();
    }
    break;

    case 2:
    cc = 0;
    printf("1 - Pesquisa Sequencial\n2 - Pesquisa Binaria\n");
    scanf("%d", &op2);
    printf("Informe a matricula a ser buscada:\n");
    scanf("%ld", &num);
    if(op == 1){
    if(j==2){
    half_seq(num);
    }
    if(j==1){
    consulta_seq(num);
    }  
    }
    if(op == 2){
    if(j==2){
    half_bin(num);
    }
    if(j==1){
    consulta_bin(num);  
    }
    }
    break;

    case 3:
    printf("Informe o registro que deseja remover:\n");
    scanf("%ld", &num);
    remocao(num);
    break;

    case 4:
    imprime(j);
    break;

    case 5:
    if(j==1){printf("Nao e possivel inserir mais registros. Reinicie o programa.\n");}
    if(j==2){
    printf("Após a inserção em lote nao sera possivel realizar mais insercoes.\n Continuar:\n 1 - Sim\n 2 - Nao\n");
    scanf("%d", &op2);
    if(op2 == 2){printf("\n");}
    else{
    j = 1;
    printf("Informe a quantidade de registros:\n");
    scanf("%d", &ooo);
    lote(ooo);
    }}
    break;

    case 6:
    free(lista);
    free(listatemp);
    op = 6;
    break;

    default:
    printf("Opção invalida!\n");
    break;
}
}
return 0;}