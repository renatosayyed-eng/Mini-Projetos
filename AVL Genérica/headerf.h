#ifndef HEADERF_H
#define HEADERF_H

#include <stdio.h>
#include <stdlib.h>

typedef struct arv{
    struct arv *esq;
    struct arv *dir;
    void* dado;
    int rotacao;
} NO, *PONT;

FILE *arq;
char text[10];
int num;

PONT Cria();
PONT Busca(PONT raiz, int valor);
PONT Balanceamento(PONT raiz);
void Corrigir(PONT raiz, int valor);
void Insere(PONT *raiz, int valor);
int Maior(int a, int b);
int Altura(PONT raiz);
void Pre_imprime(PONT raiz, void (*cb)(void*));
void Ord_imprime(PONT raiz, void (*cb)(void*));
void Pos_imprime(PONT raiz, void (*cb)(void*));
void Pre_texto(PONT raiz, void (*cb)(void*));
void Ord_texto(PONT raiz, void (*cb)(void*));
void Pos_texto(PONT raiz, void (*cb)(void*));
PONT Remove(PONT raiz, int valor);

#endif