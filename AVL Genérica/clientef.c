#include "headerf.h"

int  max=0, min=0;

static void imp(void *info){
    num = *(int*) info;
    printf("<%i> ", num);
}
static void imp_texto(void *info){
    num = *(int*) info;
    sprintf(text, "%d", num);
    fprintf(arq, "<%s> ", text);
}

static void max_min(void *info){
    num = *(int*) info;
    if(max == 0 && min == 0){
        max = num;
        min = num;
    }
    else{
        if(num>max){
        max = num;
        }
        if(num<min){
        min = num;
        }
    }
}

int main()
{
int op = 0, valor = 0, controle = 0, pesq = 0, i;
PONT raiz, aux, aux2;
do
{
    printf("\n1 - Criar a arvore\n2 - Inserir elemento\n3 - Imprimir a arvore\n4 - Imprimir a altura da arvore\n5 - Mostrar menor valor da arvore\n6 - Mostrar maior valor da arvore\n7 - Remover valor\n8 - Sair\n");
    scanf("%d",&op);
    switch (op)
    {
    case 1:
        if(controle == 0)
        {
            raiz = Cria();
            printf("Arvore criada!\n");
            controle++;
        }
        else
        {
            printf("Ja existe uma arvore criada!\n");
        }
    break;
    
    case 2:
        if(controle != 0)
        {
            printf("Digite o valor a ser inserido\n");
            scanf("%d",&valor);
            Insere(&raiz, valor);
            raiz = Balanceamento(raiz);
            printf("O valor foi inserido!\n");
        }
        else
        {
            printf("A arvore ainda nao foi criada\n");
        }
    break;

    case 3:
    printf("1 - Imprimir na tela\n 2 - Imprimir em arquivo de texto\n");
    scanf("%d", &i);
    if(raiz != NULL && controle != 0){
        if(i==1){
        printf("Pre ordem = ");
        Pre_imprime(raiz, imp);
        printf("\nEm ordem = ");
        Ord_imprime(raiz, imp);
        printf("\nPos ordem = ");
        Pos_imprime(raiz, imp);
        printf("\n");
        }
        if(i==2){
        arq = fopen("saida.txt", "w");
        fprintf(arq, "Pre ordem:\n");
        Pre_texto(raiz, imp_texto);
        fprintf(arq, "\n");
        fprintf(arq, "Em ordem:\n");
        Ord_texto(raiz, imp_texto);
        fprintf(arq, "\n");
        fprintf(arq, "Pos ordem:\n");
        Pos_texto(raiz, imp_texto);
        fclose(arq);
        }
    }
    else
    {
        printf("Nao ha uma arvore criada ou valor inserido!\n");
    }
    break;
    
    case 4:
    if(controle!=0)
    {
        valor = Altura(raiz);
        printf("A altura da arvore e igual a %d\n", valor+1);
    }
    else
    {
        printf("A arvore ainda nao foi criada ou ainda nao existe valor inserido\n");
    }
    break;

    case 5:
    if(controle != 0){
    Pre_imprime(raiz, max_min);
    printf("O menor valor na arvore e <%d>\n", min);
    }
    else
    printf("A arvore ainda nao foi criada ou ainda nao existe valor inserido\n");
    break;

    case 6:
    if(controle != 0){
    Pre_imprime(raiz, max_min);    
    printf("O maior valor na arvore e <%d>\n", max);
    }
    else
    printf("A arvore ainda nao foi criada ou ainda nao existe valor inserido\n");
    break;

    case 7:
    if(controle != 0){
    printf("Informe o valor para remocao\n");
    scanf("%d",&pesq);

    if(aux = Remove(raiz, pesq))
    printf("Valor foi removido!\n");
    else
    printf("Valor inexistente\n");
    }
    else
    {
        printf("A arvore ainda nao foi criada ou ainda nao existe valor inserido\n");
    }
    break;

    case 8:
    printf("Sair!\n");
    op = 10;
    break;

    default:
    printf("Opcao invalida\n");
    op=0;
        break;
    }
} while (op < 10);
 
 return 0;
}