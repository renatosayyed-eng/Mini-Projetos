#ifndef PCD_H
#define PCD_H

#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

typedef struct tabela
{
  long int mat;
  char nome[40];
  int faltas;
  float nota;
}NO;

NO *lista;
NO *listatemp;

char valid[28];
int ele;
int count;
int ins_rem;
int shad;
int cc;

void ordena_full(int chama, int fim);
void ordena_half(int chama, int fim);
void insere(void);
void lote(int z);
void imprime(int j);
void consulta_seq(long int matt);
void consulta_bin(long int matt);
void half_seq(long int matt);
void half_bin(long int matt);
void remocao(long int matt);

#endif