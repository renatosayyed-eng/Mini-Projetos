#include <stdio.h>
#include <stdlib.h>
#include <string.h>

FILE *arquivo;

struct chaves{
  int codigo;
  char *endereco;
  char *complemento;
  int qChaves;
  int situacao;
  char texto[1024];
};
struct ordem{
  struct ordem *ant;
  struct chaves dados;
  struct ordem *prox;
};
typedef struct ordem KEYS;

KEYS *inicio = NULL;
KEYS *termino = NULL;
int tKeys, cont;

void scan(){
  char *aux;
  if((arquivo = fopen("ControleChaves.txt","r+")) == NULL){
    printf("\n!!REINICIE O PROGRAMA!!\n");
    system("PAUSE");
  }else{
    while(!feof(arquivo)){
    KEYS *novo;
    novo = malloc(sizeof(KEYS));
    
    fgets(novo->dados.texto, 1023, arquivo);
    
    aux = strtok(novo->dados.texto,"|");
    novo->dados.codigo = atoi(aux);
    tKeys = novo->dados.codigo;

    aux = strtok(NULL,"|");
    novo->dados.endereco = aux;

    aux = strtok(NULL,"|");
    novo->dados.complemento = aux;

    aux = strtok(NULL,"|");
    novo->dados.qChaves = atoi(aux);

    aux = strtok(NULL,"\n");
    novo->dados.situacao = atoi(aux);

    if(termino == NULL){
      inicio = novo;
      termino = novo;
      novo->ant = NULL;
      novo->prox = NULL;
    }else{
      novo->ant = termino;
      novo->prox = NULL;
      termino->prox = novo;
      termino = novo;
    }
    }
  }
  fclose(arquivo);
}

void printAll(){
  KEYS *aux = inicio;
  while(aux!=NULL){
    printf("\nCodigo: %d | Endereco: %s, %s | Chaves: %d |", aux->dados.codigo, aux->dados.endereco, aux->dados.complemento, aux->dados.qChaves);
    if(aux->dados.situacao == 0){
      printf("Situacao: Na imobiliaria\n");
    }else if(aux->dados.situacao == 1){
      printf("Situacao: Na imobiliaria e com proprietario\n");
    }else{
      printf("Situacao: Em visita\n");
    }
    aux = aux->prox;
  }
}

void printAdress(){
  KEYS *aux = inicio;
  char end[150];
  puts("Informe o endereco:\n");
  gets(end);
  gets(end);
  while(aux!=NULL){
    if(strcmp(aux->dados.endereco,end) == 0){
    printf("\nCodigo: %d | Endereco: %s, %s | Chaves: %d |", aux->dados.codigo, aux->dados.endereco, aux->dados.complemento, aux->dados.qChaves);
    if(aux->dados.situacao == 0){
      printf("Situacao: Na imobiliaria\n");
    }else if(aux->dados.situacao == 1){
      printf("Situacao: Na imobiliaria e com proprietario\n");
    }else{
      printf("Situacao: Em visita\n");
    }
    }
    aux = aux->prox;
  }
  free(aux);
}

void printCode(){
  KEYS *aux = inicio;
  int code;
  puts("Informe o codigo\n");
  scanf("%d",&code);
  while(aux!=NULL){
    if(aux->dados.codigo == code){
    printf("\nCodigo: %d | Endereco: %s, %s | Chaves: %d |", aux->dados.codigo, aux->dados.endereco, aux->dados.complemento, aux->dados.qChaves);
    if(aux->dados.situacao == 0){
      printf("Situacao: Na imobiliaria\n");
    }else if(aux->dados.situacao == 1){
      printf("Situacao: Na imobiliaria e com proprietario\n");
    }else{
      printf("Situacao: Em visita\n");
    }
    }
    aux = aux->prox;
  }
  free(aux);
}

void situation(){
  KEYS *aux=inicio;
  int code;
  printf("Informe o codigo da chave que deseja alterar a situacao:\n");
  scanf("%d",&code);
  while(aux!=NULL){
    if(aux->dados.codigo == code){
    printf("0 => Na imobiliaria || 1 => Na imobiliaria e com o proprietario || 2 => Em visita\n");
    scanf("%d", &aux->dados.situacao);
    }
    aux = aux->prox;
  }
  free(aux);
}

void write(){
  KEYS *aux=inicio;
  if((arquivo = fopen("ControleChaves.txt","w+")) == NULL){
    printf("\n!!REINICIE O PROGRAMA!!\n");
    system("PAUSE");
  }else{
  while(aux!=NULL){
    if(aux->prox == NULL){
      fprintf(arquivo,"%d|", aux->dados.codigo);
      fprintf(arquivo,"%s|", aux->dados.endereco);
      fprintf(arquivo,"%s|", aux->dados.complemento);
      fprintf(arquivo,"%d|",aux->dados.qChaves);
      fprintf(arquivo,"%d",aux->dados.situacao);

    }
    else{
      fprintf(arquivo,"%d|", aux->dados.codigo);
      fprintf(arquivo,"%s|", aux->dados.endereco);
      fprintf(arquivo,"%s|", aux->dados.complemento);
      fprintf(arquivo,"%d|",aux->dados.qChaves);
      fprintf(arquivo,"%d\n",aux->dados.situacao);
    }
    aux = aux->prox;
  }
  }
  fclose(arquivo);
  free(aux);
}

void add(){
  KEYS *aux=inicio;
  if((arquivo = fopen("ControleChaves.txt","w+")) == NULL){
    printf("\n!!REINICIE O PROGRAMA!!\n");
    system("PAUSE");
  }else{
  while(aux!=NULL){
      fprintf(arquivo,"%d|", aux->dados.codigo);
      fprintf(arquivo,"%s|", aux->dados.endereco);
      fprintf(arquivo,"%s|", aux->dados.complemento);
      fprintf(arquivo,"%d|",aux->dados.qChaves);
      fprintf(arquivo,"%d\n",aux->dados.situacao);
    aux = aux->prox;
  }
  }
  char endereco[200];	
  int xx;
  fprintf(arquivo,"%d|", tKeys+1);
  printf("Informe o logradouro:\n");
  gets(endereco);
  gets(endereco);
  fprintf(arquivo,"%s|", endereco);
  printf("Informe o numero e complemento\n");
  gets(endereco);
  fprintf(arquivo,"%s|", endereco);
  printf("Informe a quantidade de chaves:\n");
  scanf("%d",&xx);
  fprintf(arquivo,"%d|",xx);   
  printf("Informe a situacao: 0 => Na imobiliaria || 1 => Na imobiliaria e com o proprietario || 2 => Em visita\n");
  scanf("%d", &xx);
  fprintf(arquivo,"%d",xx);

  fclose(arquivo);
  free(aux);
}

int main(void){
  int s=0;
  scan();
  while(s != 6){
  printf("\n---------------------MENU---------------------\n");
  printf("\t1 => Ver todas as chaves\n");
  printf("\t2 => Procurar chaves por endereco\n");
  printf("\t3 => Procurar chaves por codigo \n");
  printf("\t4 => Modificar situacao\n");
  printf("\t5 => Adicionar chave\n");
  printf("\t6 => Sair\n");
  scanf("%d", &s);
  printf("\n----------------------------------------------\n");

  switch(s){
    case 1:
    printAll();
    break;

    case 2:
    printAdress();
    break;

    case 3:
    printCode();
    break;

    case 4:
    situation();
    write();
    break;

    case 5:
    add();
    return 0;
    break;

    case 6:
    printf("\n>< BYE BYE ><\n");
    break;

    default:
    printf("Opcao invalida\n");
    break;
  }
  }
  return 0;
}