#include "loc.h"

void read()
{
  FILE *ARQUIVO;

  if((ARQUIVO = fopen("loc.txt", "r+")) == NULL) 
  {
    printf("*Erro na abertura de arquivo*\n");
    system("pause");
  }
  else
  {
    char auxT[10];
    char *aux;
    fgets(auxT, 9, ARQUIVO); 
    totalAmount = atoi(auxT);
    inicio = NULL;
    termino = NULL;
    while(!feof(ARQUIVO))
    {
      ORDENACAO *no = malloc(sizeof(ORDENACAO));
      fgets(no->filme.texto, 1023, ARQUIVO); 
      aux = strtok(no->filme.texto,";"); 
      no->filme.code = atoi(aux); 
      aux = strtok(NULL,";"); 
      strcpy(no->filme.title,aux); 
      aux = strtok(NULL,";"); 
      no->filme.year = atoi(aux);
      aux = strtok(NULL,";"); 
      no->filme.amount = atoi(aux); 
      aux = strtok(NULL,"\n"); 
  
      if(strcmp(aux,"DRAMA") == 0) no->filme.genero = 1;
      else if(strcmp(aux,"ROMANCE") == 0) no->filme.genero = 2;
      else if(strcmp(aux,"DESENHO") == 0)no->filme.genero = 3;

    
      if(termino == NULL)
      {
        inicio = no;
        termino = no;
        no->last = NULL;
        no->next = NULL;
      }
     
      else
      {
        no->last = termino;
        no->next = NULL;
        termino->next = no;
        termino = no;
      }
    }
    fclose(ARQUIVO);
    }
}

ORDENACAO *search()
{
  ORDENACAO *aux = NULL;
  int c,a,j;
  char gender[15],title[100];
  
  printf("Selecione o metodo de busca:\n(1)Codigo || (2)Titulo || (3)Ano || (4)Genero\n");
  scanf("%d", &c);
  printf("\n");

  switch(c)
  {
    case 1:
    printf("Informe o codigo do filme:\n");
    scanf("%d", &j);

    
    for(aux = inicio; aux!=NULL; aux=aux->next)
    {
      if(aux->filme.code == j)
      {
        printf("(!) FILME ENCONTRADO (!)\n");
        break;
      }
    }
    if(aux == NULL){printf("(!!)CODIGO INVALIDO(!!)\n");}
    break;

    case 2:
    printf("Informe o titulo do filme:\n");
    gets(title);
    gets(title);
    for(aux = inicio; aux!=NULL; aux=aux->next)
    {
      if(strcmp(aux->filme.title, title) == 0)
      {
        printf("(!) FILME ENCONTRADO (!)\n");
        break;
      }
    }
    if(aux == NULL){printf("(!!)CODIGO INVALIDO(!!)\n");}
    break;

    case 3:
    printf("Informe o ano do filme\n");
    scanf("%d", &a);
    for(aux = inicio; aux!=NULL; aux=aux->next)
    {
      if(aux->filme.year == a)
      {
        printf("Codigo: %d <> Titulo: %s <> Ano: %d <> Quantidade: %d <> Genero:", aux->filme.code, aux->filme.title, aux->filme.year, aux->filme.amount);
        if(aux->filme.genero == 1)printf("%s\n", "DRAMA");
        else if(aux->filme.genero == 2)printf("%s\n", "ROMANCE");
        else if(aux->filme.genero == 3)printf("%s\n", "DESENHO");
        j = -1;
      }
    }
    if(j!=-1){printf("(!!) ANO INVALIDO (!!)\n");}
    break;

    case 4:
    j=0;
    printf("Informe o genero do filme\n");
    gets(gender);
    gets(gender);
    if(strcmp(gender,"DRAMA")==0){a=1; j = -1;}
    else if(strcmp(gender,"Drama")==0){a=1; j = -1;}
    else if(strcmp(gender,"drama")==0){a=1; j = -1;}
    else if(strcmp(gender,"ROMANCE")==0){a=2; j = -1;}
    else if(strcmp(gender,"Romance")==0){a=2; j = -1;}
    else if(strcmp(gender,"romance")==0){a=2; j = -1;}
    else if(strcmp(gender,"DESENHO")==0){a=3; j = -1;}
    else if(strcmp(gender,"Desenho")==0){a=3; j = -1;}
    else if(strcmp(gender,"desenho")==0){a=3; j = -1;}

    if(j == -1){
    for(aux = inicio; aux!=NULL; aux=aux->next)
    {
      if(aux->filme.genero == a)
      {
        printf("Codigo: %d <> Titulo: %s <> Ano: %d <> Quantidade: %d <> Genero:", aux->filme.code, aux->filme.title, aux->filme.year, aux->filme.amount);
        if(aux->filme.genero == 1)printf("%s\n", "DRAMA");
        else if(aux->filme.genero == 2)printf("%s\n", "ROMANCE");
        else if(aux->filme.genero == 3)printf("%s\n", "DESENHO");
      }
    }
    }
    else{
      printf("(!!) GENERO INVALIDO (!!)\n");
    }
    break;

    default:
    printf("*Invalido*\n");
    return search();
    break;
  }
  return aux;
}

void loan()
{
  ORDENACAO *aux;
  int c=0, j;
  printf("Informe o codigo do filme:\n");
  scanf("%d", &j);
 
  for(aux = inicio; aux!=NULL; aux=aux->next)
  {
    if(aux->filme.code == j)
    {
      if(aux->filme.amount == 0)
      {
        printf("*FILME INDISPONIVEL*\n");
        c=-1;
      }
      else
      {
        aux->filme.amount --;
        printf("*UMA COPIA FOI LOCADA*\n");
        c =-1;
      }
      break;
    }
  }
  if(c!=-1){printf("(!!) CODIGO INVALIDO (!!)\n");}
}

void devolution() 
{
  ORDENACAO *aux;
  int c=0,j;
  printf("Informe o codigo do filme:\n");
  scanf("%d", &j);
  for(aux = inicio; aux!=NULL; aux=aux->next)
  {
    if(aux->filme.code == j)
    {
      aux->filme.amount ++;
      printf("*UMA COPIA FOI DEVOLVIDA*\n");
      c = -1;
      break;
    }
  }
  if(c!=-1){printf("(!!) CODIGO INVALIDO (!!\n");}
}

void print()
{
  ORDENACAO *aux;
  int c, j=0;
  char title[100];
  printf("(1)Procurar filme por titulo || (2)Listar todos os filmes do acervo\n");
  scanf("%d", &c);
  if(c==1){
  printf("Informe o titulo do filme:\n");
  gets(title);
  gets(title);
  for(aux = inicio; aux!=NULL; aux=aux->next)
  {
    if(strcmp(aux->filme.title, title) == 0)
    {
      printf("(!) FILME ENCONTRADO (!)\n");
      printf("Codigo: %d <> Titulo: %s <> Ano: %d <> Quantidade: %d <> Genero:", aux->filme.code, aux->filme.title, aux->filme.year, aux->filme.amount);
      if(aux->filme.genero == 1)printf("%s\n", "DRAMA");
      else if(aux->filme.genero == 2)printf("%s\n", "ROMANCE");
      else if(aux->filme.genero == 3)printf("%s\n", "DESENHO");    
      break;
      j = -1;
    }
  }
  if(j!=-1){printf("*NOME DE FILME INVALIDO*\n");}
  }
  else if(c==2){
    for(aux = inicio; aux!=NULL; aux=aux->next)
    {
      printf("Code: %d, Title: %s, Year: %d, Amount: %d, Genero:", aux->filme.code, aux->filme.title, aux->filme.year, aux->filme.amount);
      if(aux->filme.genero == 1)printf("%s\n", "DRAMA");
      else if(aux->filme.genero == 2)printf("%s\n", "ROMANCE");
      else if(aux->filme.genero == 3)printf("%s\n", "DESENHO");
    }
  }
}

void report()
{
  FILE *ARQUIVO; 
  int a,c=0, j=0;
  char gender[50];
  ORDENACAO *aux;
  if((ARQUIVO = fopen("report.txt", "w+")) == NULL)
  {
    printf("*Erro na abertura de arquivo*\n"); 
    system("pause");
  }
  else
  {
    printf("(1)Relatorio por ano || (2)Relatorio por genero\n");
    scanf("%d", &c);
    if(c == 1)
    {
    printf("Informe o ano do filme\n");
    scanf("%d", &a);
    for(aux = inicio; aux!=NULL; aux=aux->next)
    {
      if(aux->filme.year == a)
      {
        fprintf(ARQUIVO, "Codigo: %d || Titulo: %s || Ano: %d || Quantidade: %d || Genero:", aux->filme.code, aux->filme.title, aux->filme.year, aux->filme.amount);
        if(aux->filme.genero == 1)fprintf(ARQUIVO, "%s\n", "DRAMA");
        else if(aux->filme.genero == 2)fprintf(ARQUIVO, "%s\n", "ROMANCE");
        else if(aux->filme.genero == 3)fprintf(ARQUIVO, "%s\n", "DESENHO");
        j = -1;
      }
    }
    if(j != -1){printf("*ANO INVALIDO*\n");}
    }
    else if(c == 2)
    {
    printf("Informe o genero do filme\n");
    gets(gender);
    gets(gender);
    
    if(strcmp(gender,"DRAMA")==0){a=1; c = -1;}
    else if(strcmp(gender,"Drama")==0){a=1; c = -1;}
    else if(strcmp(gender,"drama")==0){a=1; c = -1;}
    else if(strcmp(gender,"ROMANCE")==0){a=2; c = -1;}
    else if(strcmp(gender,"Romance")==0){a=2; c = -1;}
    else if(strcmp(gender,"romance")==0){a=2; c = -1;}
    else if(strcmp(gender,"DESENHO")==0){a=3; c = -1;}
    else if(strcmp(gender,"Desenho")==0){a=3; c = -1;}
    else if(strcmp(gender,"desenho")==0){a=3; c = -1;}

    if(c == -1){
    for(aux = inicio; aux!=NULL; aux=aux->next)
    {
      if(aux->filme.genero == a)
      {
        fprintf(ARQUIVO, "Codigo: %d || Titulo: %s || Ano: %d || Quantidade: %d || Genero:", aux->filme.code, aux->filme.title, aux->filme.year, aux->filme.amount);
        if(aux->filme.genero == 1)fprintf(ARQUIVO, "%s\n", "DRAMA");
        else if(aux->filme.genero == 2)fprintf(ARQUIVO, "%s\n", "ROMANCE");
        else if(aux->filme.genero == 3)fprintf(ARQUIVO, "%s\n", "DESENHO");
        j = -1;
      }
    }
    if(j != -1){printf("*GENERO INVALIDO*\n");}
  }
  }
  }
  fclose(ARQUIVO);
}

void backup()
{
  FILE *ARQUIVO;

  if((ARQUIVO = fopen("loc.txt", "r+")) == NULL) 
  {
    printf("*Erro na abertura de arquivo*\n");
    system("pause");
  }
  else
  {
    fprintf(ARQUIVO,"%d\n",totalAmount);
    for(ORDENACAO *aux = inicio; aux!=NULL;aux = aux->next){
    fprintf(ARQUIVO, "%d;%s;%d;%d;", aux->filme.code, aux->filme.title, aux->filme.year, aux->filme.amount); 
    if(aux->filme.genero == 1)fprintf(ARQUIVO, "%s\n", "DRAMA");
    else if(aux->filme.genero == 2)fprintf(ARQUIVO, "%s\n", "ROMANCE");
    else if(aux->filme.genero == 3)fprintf(ARQUIVO, "%s\n", "DESENHO");
    }
  }
  fclose(ARQUIVO);
}