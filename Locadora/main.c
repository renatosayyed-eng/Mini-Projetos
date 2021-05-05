#include "loc.h"

int main(void)
{
int op = -1;
inicio = termino = NULL;
read();
ORDENACAO *find;

while(op!=0)
{
 printf("(1)Locacao\n(2)Devolucao\n(3)Busca de filme\n(4)Impressao\n(5)Relatorio\n(6)Backup\n(0)Sair\n");
 scanf("%d", &op);

 switch(op)
 {
   case 1:
   loan();
   break;

   case 2:
   devolution();
   break;

   case 3:
   find = search();

  if(find == NULL){}
  else
  {
  printf("Codigo: %d <> Titulo: %s <> Ano: %d <> Quantidade: %d <> Type:", find->filme.code, find->filme.title, find->filme.year, find->filme.amount);
  if(find->filme.genero == 1)printf("%s\n", "DRAMA");
  else if(find->filme.genero == 2)printf("%s\n", "ROMANCE");
  else if(find->filme.genero == 3)printf("%s\n", "DESENHO");
  }
   break;

   case 4:
   print();
   break;

   case 5:
   report();
   break;

   case 6:
   backup();
   break;

   case 0:
   break;

   default:
   printf("*INVALIDO*\n");
   break;
 } 
}
  return 0;
}