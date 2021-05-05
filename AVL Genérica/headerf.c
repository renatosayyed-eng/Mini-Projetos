#include "headerf.h"

PONT Cria()
{
return NULL;
}

PONT Balanceamento(PONT raiz)
{
PONT aux=NULL, aux2=NULL;
if(raiz!=NULL)
{
    Balanceamento(raiz->esq);
    Balanceamento(raiz->dir);
    if((raiz->rotacao==2)||(raiz->rotacao==-2))
    {
        if((raiz->rotacao>0)&&(raiz->esq->rotacao>0))
        {
            //Rotacao direita
            aux = raiz->esq;
            raiz->esq = aux->dir;
            aux->dir = raiz;
            raiz->rotacao = 0;
            raiz = aux;
        }
        else
        {
            if((raiz->rotacao<0)&&(raiz->dir->rotacao<0))
            {
                //Rotacao esquerda
                aux = raiz->dir;
                raiz->dir = aux->esq;
                aux->esq = raiz;
                raiz->rotacao = 0;
                raiz = aux;
            }
            else
            {
                if((raiz->rotacao>0)&&(raiz->esq->rotacao<0))
                {
                    //Rotacao Dupla Direita
                    aux = raiz->esq;
                    aux2 = aux->dir;
                    aux->dir = aux2->esq;
                    aux2->esq = aux;
                    raiz->esq = aux2->dir;
                    aux2->dir = raiz;
                    if(aux2->rotacao == -1)
                    {
                        raiz->rotacao = 1;
                    }
                    else
                    {
                        raiz->rotacao = 0;
                    }
                    if(aux2->rotacao == 1)
                    {
                        aux->rotacao = -1;
                    }
                    else
                    {
                        aux->rotacao = 0;
                    }
                    raiz = aux2;
                }
                else
                {
                    if((raiz->rotacao<0)&&(raiz->dir->rotacao>0))
                    {
                        //Rotacao Dupla Esquerda
                        aux = raiz->dir;
                        aux2 = aux->esq;
                        aux->esq = aux2->dir;
                        aux2->dir = aux;
                        raiz->dir = aux2->esq;
                        aux2->esq = raiz;
                        if(aux2->rotacao == -1)
                        {
                            raiz->rotacao = 1;
                        }
                        else
                        {
                            raiz->rotacao = 0;
                        }
                        if(aux2->rotacao == 1)
                        {
                            aux->rotacao = -1;
                        }
                        else
                        {
                            aux->rotacao = 0;
                        }
                        raiz = aux2;
                    }
                }
            }
        }
    }
    return raiz;
}
}

void Corrigir(PONT raiz, int valor)
{
    if(raiz!=NULL)
    {
        if(valor < (int*)raiz->dado)
        raiz->rotacao++;
        else
        raiz->rotacao--;
    }
}

void Insere(PONT *raiz, int valor)
{
    if((*raiz) == NULL)
    {
        (*raiz) = (PONT)malloc(sizeof(NO));
        (*raiz)->dado = valor;
        (*raiz)->esq = NULL;
        (*raiz)->dir = NULL;
        (*raiz)->rotacao = 0;
    }
    else
    {
        if(valor <= (int*)(*raiz)->dado)
        {
            (*raiz)->rotacao++;
            Insere(&(*raiz)->esq, valor);
        }
        else
        {
            (*raiz)->rotacao--;
            Insere(&(*raiz)->dir, valor);
        }
    }
}

int Maior(int a, int b)
{
return (a>b) ? a : b;
}

int Altura(PONT raiz)
{
if(raiz == NULL)
return -1;
else
return 1 + Maior(Altura(raiz->esq), Altura(raiz->dir));
}

void Pre_imprime(PONT raiz, void (*cb)(void*))
{
if(raiz != NULL)
{
    cb(&raiz->dado);
    Pre_imprime(raiz->esq, cb);
    Pre_imprime(raiz->dir, cb);
}
}

void Ord_imprime(PONT raiz, void (*cb)(void*))
{
if(raiz != NULL)
{
    Ord_imprime(raiz->esq, cb);
    cb(&raiz->dado);
    Ord_imprime(raiz->dir, cb);
}
}

void Pos_imprime(PONT raiz, void (*cb)(void*))
{
if(raiz != NULL)
{
    Pos_imprime(raiz->esq, cb);
    Pos_imprime(raiz->dir, cb);
    cb(&raiz->dado);
} 
}

void Pre_texto(PONT raiz, void (*cb)(void*))
{
if(raiz != NULL)
{
    cb(&raiz->dado);
    Pre_texto(raiz->esq, cb);
    Pre_texto(raiz->dir, cb);
}
}

void Ord_texto(PONT raiz, void (*cb)(void*))
{
if(raiz != NULL)
{
    Ord_texto(raiz->esq, cb);
    cb(&raiz->dado);
    Ord_texto(raiz->dir, cb);
}
}

void Pos_texto(PONT raiz, void (*cb)(void*))
{
if(raiz != NULL)
{
    Pos_texto(raiz->esq, cb);
    Pos_texto(raiz->dir, cb);
    cb(&raiz->dado);
} 
}

PONT Remove(PONT raiz, int valor)
{
if(raiz != NULL)
{
    if(valor < (int*)raiz->dado)
    {
        raiz->esq = Remove(raiz->esq, valor);
        if((Altura(raiz->esq)-Altura(raiz->dir)) == -2)
        {
            if((Altura(raiz->dir->esq)-Altura(raiz->dir->dir)) == -1)
            {
                //Rotacao esquerda
                raiz = Balanceamento(raiz);
            }
            else
            {
                //RotacaoDireitaEsquerda
                raiz = Balanceamento(raiz);
            }
        }
    }
    else
    {
        if(valor > (int*)raiz->dado)
        {
            raiz->dir = Remove(raiz->dir, valor);
            if((Altura(raiz->esq)-Altura(raiz->dir)) == 2)
            {
                if((Altura(raiz->esq->esq)-Altura(raiz->esq->dir)) == 1)
                {
                    //Rotacao Direita
                    raiz = Balanceamento(raiz);
                }
                else
                {
                    //RotacaoEsquerdaDireita
                    raiz = Balanceamento(raiz);
                }
            }
        }
        else
        {
            if((raiz->esq == NULL)&&(raiz->dir == NULL))
            {
                free(raiz);
                (raiz) = NULL;
            }
            else
            {
                if(raiz->dir == NULL)
                {
                    PONT aux = (raiz);
                    (raiz) = (raiz)->esq;
                    free(aux);
                }
                else
                {
                    if(raiz->esq == NULL)
                    {
                        PONT aux = raiz;
                        raiz = raiz->dir;
                        free(aux);
                    }
                    else
                    {
                        PONT temp = raiz->esq;
                        while(temp->dir != NULL)
                        {
                            temp = temp->dir;
                        }
                        raiz->dado = temp->dado;
                        temp->dado = valor;
                        raiz->esq = Remove(raiz->esq, valor);
                    }
                }
            }
            
        }
        
    }
    return raiz;
}
}