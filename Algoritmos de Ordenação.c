#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <math.h>

struct lista{
   int value;
   struct lista *proximo; 
};
typedef struct lista celula;


void gerador(int o){    

srand(time(0));

FILE *escrever;

if((escrever=fopen("entrada.txt", "w")) == NULL){
    printf("Permissão negada!");
    system("PAUSE");
}

celula *head;
head = malloc (sizeof (celula));
head->proximo = NULL;

int x, num;
char text[7];
for(x=0; x<o; x++){
//Lista Vazia    
if(head->proximo == NULL){
celula *no;
no = malloc (sizeof (celula));
no->value = (num = rand()%999999);
no->proximo = NULL;
head->proximo = no;
}
//Lista com algum valor
else{
celula *no;
no = malloc (sizeof (celula));
no->value = (num = rand()%999999);
no->proximo = head->proximo;
head->proximo = no;
}
//Escrever no arquivo de texto
sprintf(text,"%d",num);
fprintf(escrever,"%s\n",text); 
}
fclose(escrever);

//Excluir a lista após gerar os valores
for(x=0; x<o; x++){ 
celula *lixo;
lixo = head->proximo;
head->proximo = lixo->proximo;
free(lixo);    
}

free(head);
}

celula *scan(void){
//Funcionando //Scan dos valores de entrada   
FILE *ler;

if((ler=fopen("entrada.txt", "r")) == NULL){
    printf("Permissão negada!");
    system("PAUSE");
}

celula *head;
head = malloc (sizeof (celula));
head->proximo = NULL;

char text[8];
char *aux;

while(!feof(ler)){
celula *no;
no = malloc(sizeof(celula));

fgets(text,10,ler);
aux = strtok(text,"\n");
no->value = atoi(aux);
 
if(head->proximo == NULL){
no->proximo = NULL;
head->proximo = no;
}
else{
no->proximo = head->proximo;
head->proximo = no;
}
}
fclose(ler);

return head;
}

celula *scanord(int j){
//Funcionando //Scan dos valores de entrada   
FILE *ler;

if(j==1){
if((ler=fopen("insertion.txt", "r")) == NULL){
    printf("Permissão negada!");
    system("PAUSE");
}
}
if(j==2){
if((ler=fopen("shell.txt", "r")) == NULL){
    printf("Permissão negada!");
    system("PAUSE");
}
}
if(j==3){
if((ler=fopen("quick.txt", "r")) == NULL){
    printf("Permissão negada!");
    system("PAUSE");
}
}
celula *head;
head = malloc (sizeof (celula));
head->proximo = NULL;

char text[8];
char *aux;

while(!feof(ler)){
celula *no;
no = malloc(sizeof(celula));

fgets(text,10,ler);
aux = strtok(text,"\n");
no->value = atoi(aux);
 
if(head->proximo == NULL){
no->proximo = NULL;
head->proximo = no;
}
else{
no->proximo = head->proximo;
head->proximo = no;
}
}
fclose(ler);

return head;
}

void Insertion(int *a, int o){
   int y, x, valor;
   
   for(x=1;x<o;x++){
   valor = a[x];

    for(y = x-1; y >= 0 && a[y]>valor; y--){
      a[y+1] = a[y];
    }
a[y+1] = valor;
}
    
    
FILE *iescrever;
if((iescrever=fopen("insertion.txt", "w")) == NULL){
    printf("Permissão negada!");
    system("PAUSE");
}

celula *head;
head = malloc (sizeof (celula));
head->proximo = NULL;

char text[7];
for(x=0; x<o; x++){
//Lista Vazia    
if(head->proximo == NULL){
celula *no;
no = malloc (sizeof (celula));
no->value = a[x];
no->proximo = NULL;
head->proximo = no;
}
//Lista com algum valor
else{
celula *no;
no = malloc (sizeof (celula));
no->value = a[x];
no->proximo = head->proximo;
head->proximo = no;
}
//Escrever no arquivo de texto
sprintf(text,"%d",a[x]);
fprintf(iescrever,"%s\n",text); 
}
fclose(iescrever);

for(x=0; x<o; x++){ 
celula *lixo;
lixo = head->proximo;
head->proximo = lixo->proximo;
free(lixo);    
}

free(head);
}

void Shell(int *a, int size)
{
 int i , j , value, x;
 int troc = 1;
  
 do {
  troc = 3*troc+1;
 } while(troc < size);
  
 do {
  troc /= 3;
  for(i = troc; i < size; i++) {
   value = a[i];
   j = i - troc;
    
   while (j >= 0 && value < a[j]) {
    a[j + troc] = a[j];
    j -= troc;
   }
   a[j + troc] = value;
  }
 }while(troc > 1);
 
FILE *iescrever;
if((iescrever=fopen("shell.txt", "w")) == NULL){
    printf("Permissão negada!");
    system("PAUSE");
}

celula *head;
head = malloc (sizeof (celula));
head->proximo = NULL;

char text[7];
for(x=0; x<size; x++){
//Lista Vazia    
if(head->proximo == NULL){
celula *no;
no = malloc (sizeof (celula));
no->value = a[x];
no->proximo = NULL;
head->proximo = no;
}
//Lista com algum valor
else{
celula *no;
no = malloc (sizeof (celula));
no->value = a[x];
no->proximo = head->proximo;
head->proximo = no;
}
//Escrever no arquivo de texto
sprintf(text,"%d",a[x]);
fprintf(iescrever,"%s\n",text); 
}
fclose(iescrever);

for(x=0; x<size; x++){ 
celula *lixo;
lixo = head->proximo;
head->proximo = lixo->proximo;
free(lixo);    
}

free(head);
}

void Quick(int *vet,int ini, int fim){
    int esq, dir, pivo, aux;
    if(ini < fim){
        pivo = ini;
        esq = ini;
        dir = fim;
        while(esq < dir){
            while(vet[esq] <= vet[pivo] && esq < fim){
                esq++;
            }
        while(vet[dir] > vet[pivo]){
            dir--;
        }
        if(esq < dir){
            aux = vet[esq];
            vet[esq] = vet[dir];
            vet[dir] = aux;
        }
        }
        aux = vet[pivo];
        vet[pivo] = vet[dir];
        vet[dir] = aux;
        Quick(vet, ini, dir - 1);
        Quick(vet, dir + 1, fim);
    }
}

int main(void){
int o;
printf("Informe a quantidade de valores:\n");
scanf("%d", &o);

gerador(o);

int seletor;
printf("Informe o tipo de ordenação:\n1- Insertion Sort\n2- Shell Sort\n3- Quick Sort\n");
scanf("%d", &seletor);

celula *l;
l = malloc(sizeof(celula));

int c=0, lis[o], j=0;
clock_t tic, toc;
switch(seletor){
    case 1:
        l = scan();
        
        l=l->proximo;
        l=l->proximo;
        
        while(l->proximo!=NULL){
        lis[c]=l->value;
        l=l->proximo;
        c++;
        if(l->proximo == NULL){
        lis[c]=l->value;
        }
        }
        
        tic = clock();
        Insertion(lis, o);
        toc = clock();
       
        j=1;
        break;
    
    case 2:
        l = scan();
        
        l=l->proximo;
        l=l->proximo;
        
        while(l->proximo!=NULL){
        lis[c]=l->value;
        l=l->proximo;
        c++;
        if(l->proximo == NULL){
        lis[c]=l->value;
        }
        }
        tic = clock();
        Shell(lis, o);
        toc = clock();
    
        j=2;
        break;
        
    case 3:
        l = scan();
        
        l=l->proximo;
        l=l->proximo;
        
        while(l->proximo!=NULL){
        lis[c]=l->value;
        l=l->proximo;
        c++;
        if(l->proximo == NULL){
        lis[c]=l->value;
        }
        }
        
        tic = clock();
        Quick(lis, 0, o);
        toc = clock();
int *a = lis;
int x=0;
FILE *iescrever;
if((iescrever=fopen("quick.txt", "w")) == NULL){
    printf("Permissão negada!");
    system("PAUSE");
}

celula *head;
head = malloc (sizeof (celula));
head->proximo = NULL;

char text[7];
for(x=0; x<o; x++){
//Lista Vazia    
if(head->proximo == NULL){
celula *no;
no = malloc (sizeof (celula));
no->value = a[x];
no->proximo = NULL;
head->proximo = no;
}
//Lista com algum valor
else{
celula *no;
no = malloc (sizeof (celula));
no->value = a[x];
no->proximo = head->proximo;
head->proximo = no;
}
//Escrever no arquivo de texto
sprintf(text,"%d",a[x]);
fprintf(iescrever,"%s\n",text); 
}
fclose(iescrever);

for(x=0; x<o; x++){ 
celula *lixo;
lixo = head->proximo;
head->proximo = lixo->proximo;
free(lixo);    
}

free(head);
        j=3;
        break;
}

int seletor2, cc=0, ll[o], i=0;
printf("\n1- Mostrar os valores de entrada\n2- Mostrar os valores ordenados\n3- Mostrar o tempo de execucao\n");
scanf("%d", &seletor2);

switch(seletor2){
    case 1:
        l = scan();
        
        l=l->proximo;
        l=l->proximo;
        
        while(l->proximo!=NULL){
        ll[cc]=l->value;
        printf("%d ",ll[cc]);
        l=l->proximo;
        cc++;
        if(l->proximo == NULL){
        ll[c]=l->value;
        printf("%d\n ",ll[cc]);
        }
        }
    break;
    
    case 2:
        l = scanord(j);
        l=l->proximo;
        l=l->proximo;
        while(l->proximo!=NULL){
        ll[cc]=l->value;
        l=l->proximo;
        cc++;
        if(l->proximo == NULL){
        ll[c]=l->value;
        }
        }
        i=o-1;
        while(i>=0){
            printf("%d ", ll[i]);
        i--;
        }
    break;
    
    case 3:
    printf("Tempo levado: %f segundos\n", (double)(toc - tic) / CLOCKS_PER_SEC);
    break;
}

return 0;    
}