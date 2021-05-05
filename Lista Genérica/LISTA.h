#ifndef LISTA_H
#define LISTA_H

#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct lista{
    void *info;
    struct lista *prox;
}LISTA;

typedef struct aluno{
    int matricula;
    char nome[50];
}ALUNO;


LISTA *LGInsere(LISTA *l,void *a);

void LGPercorre(LISTA *l, void (*cb)(void*));

void LGBuscarpercorre(LISTA *l, void (*cb)(void*,void*,void*), void *dado);

LISTA* LG_Apagar(LISTA* ini, int(*cb)(void*,void*),void* mat);

#endif