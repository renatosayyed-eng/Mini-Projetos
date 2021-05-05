#include "PCD.h"

void ordena_full(int chama, int fim){
  int i, j, meio;
  long int pivo;
  NO* aux = malloc(sizeof(NO));
  i = chama;
  j = fim; 
  meio = (int) ((i + j) / 2);
  pivo = lista[meio].mat;
  do{
    while (lista[i].mat < pivo) i = i + 1;
    while (lista[j].mat > pivo) j = j - 1;
    if(i <= j){
       aux[0] = lista[i];
       lista[i] = lista[j];
       lista[j] = aux[0];
       i = i + 1;
       j = j - 1;
    }
  }while(j > i);
   
  if(chama < j) ordena_full(chama, j);
  if(i < fim) ordena_full(i, fim);   
}

void ordena_half(int chama, int fim){
  int i, j, meio;
  long int pivo;
  NO* aux = malloc(sizeof(NO));
  i = chama;
  j = fim; 
  meio = (int) ((i + j) / 2);
  pivo = listatemp[meio].mat;
  do{
    while (listatemp[i].mat < pivo) i = i + 1;
    while (listatemp[j].mat > pivo) j = j - 1;
    if(i <= j){
       aux[0] = listatemp[i];
       listatemp[i] = listatemp[j];
       listatemp[j] = aux[0];
       ins_rem++;
       i = i + 1;
       j = j - 1;
    }
  }while(j > i);
   
  if(chama < j) ordena_half(chama, j);
  if(i < fim) ordena_half(i, fim);   
}

void contador(){
  cc++;
}
void insere(){
shad++;
printf("Informe a matricula\n");
scanf("%ld", &listatemp[ele].mat);
printf("Informe o nome aluno\n");
scanf("%s", listatemp[ele].nome);
printf("Informe a nota\n");
scanf("%f", &listatemp[ele].nota);
printf("Informe as faltas\n");
scanf("%d", &listatemp[ele].faltas);
ins_rem=0;
ordena_half(0,ele);
printf("Foram necessarias %d movimentacoes.\n", ins_rem);
ele++;
}

void lote(int z){
srand(time(NULL));
z=z+ele;
lista = (NO*)(malloc(z * sizeof(NO)));
lista = listatemp;
int n,x,i,y;
for(x=ele; x<z; x++){
lista[x].mat = rand()%1000000 + 10000000;
lista[x].nota = 10.0*((float)(rand())/RAND_MAX);
lista[x].faltas = rand()%60;
n = rand()%39;
if(n<3){n=3;}
for(i=0; i<n; i++){
y = rand()%27;
lista[x].nome[i] = valid[y]; 
}}
ordena_full(0, z);
ele = ele + (x-ele);
}

void imprime(int j){
int xx=0;
if(j==1){
for(int i=1;i<=ele;i++){
printf("Matricula:<%ld> Nome:<%s> Faltas:<%d> Nota:<%f>\n",lista[i].mat,lista[i].nome, lista[i].faltas, lista[i].nota);
xx++;
}}
if(j==2){
for(int i=0;i<shad;i++){
printf("Matricula:<%ld> Nome:<%s> Faltas:<%d> Nota:<%f>\n",listatemp[i].mat,listatemp[i].nome, listatemp[i].faltas, listatemp[i].nota);
xx++;
}
}
printf("Foram realizados %d acessos.\n", xx);
}

void remocao(long int matt){
int i=0, x=0, xx=0;
for(i=0; i<=ele; i++){
  if(lista[i].mat == matt){
  for(x=i; x<=ele; x++){
    lista[x] = lista[x+1];
    xx++;
  }
  lista = (NO*) realloc( lista, ele * sizeof(NO));  
  ele--;
  }
}
printf("Foram necessarias %d movimentacoes\n",xx);
}

void consulta_seq(long int matt){
int i=0;
for(i=0; i<=ele; i++){
  if(lista[i].mat == matt){
  printf("Matricula:<%ld> Nome:<%s> Faltas:<%d> Nota:<%f>\n",lista[i].mat,lista[i].nome, lista[i].faltas, lista[i].nota);
  printf("Foram realizados %d acessos.\n", cc+1);
  i=ele+1;
  }
  cc++;
}
}

void consulta_bin(long int matt){
    int xx=0;
    int begin = 0, i = 0;
    int end = ele;

    while (begin <= end) {  
        i = (begin + end) / 2;  
        xx++;
        if (lista[i].mat == matt) {  
          printf("Matricula:<%ld> Nome:<%s> Faltas:<%d> Nota:<%f>\n",lista[i].mat,lista[i].nome, lista[i].faltas, lista[i].nota);
          printf("Foram realizados %d acessos\n", xx);
          begin = end+10;
        }
        if (lista[i].mat < matt) {  
            begin = i++;
        } 
        if(lista[i].mat > matt) { 
            end = i;
        }       
    } 
}

void half_seq(long int matt){
  int xx = 0, x = 0;
  for(x = 0 ; x <= shad ; x++){
    if(listatemp[x].mat == matt){
        printf("Matricula:<%ld> Nome:<%s> Faltas:<%d> Nota:<%f>\n",listatemp[x].mat,listatemp[x].nome, listatemp[x].faltas, listatemp[x].nota);
        printf("Foram realizados %d acessos\n",cc+1);
        x=ele+10;
    }
    cc++;
  }
}

void half_bin(long int matt){
    int xx=0;
    int begin = 0, i = 0;
    int end = ele;

    while (begin <= end) {  
        i = (begin + end) / 2;  
        xx++;
        if (listatemp[i].mat == matt) {  
          printf("Matricula:<%ld> Nome:<%s> Faltas:<%d> Nota:<%f>\n",listatemp[i].mat,listatemp[i].nome, listatemp[i].faltas, listatemp[i].nota);
          printf("Foram realizados %d acessos\n", xx);
          begin = end+10;
        }
        if (listatemp[i].mat < matt) {  
            begin = i++;
        } 
        if(listatemp[i].mat > matt) { 
            end = i;
        }       
    } 
}