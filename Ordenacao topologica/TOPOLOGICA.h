#ifndef TOPOLOGICA_H
#define TOPOLOGICA_H

#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <limits.h>

typedef int bool;
typedef int TIPOPESO;
#define BRANCO 0
#define AMARELO 1
#define VERMELHO 2
#define TAM 100

typedef struct adjacencia {
	int vertice;
	TIPOPESO peso;
	struct adjacencia *prox;
} ADJACENCIA;

typedef struct vertice {
	ADJACENCIA *cab;
} VERTICE;

typedef struct grafo {
	int vertices;
	int arestas;
	VERTICE *adj;
} GRAFO;

GRAFO *GI;
int mat[TAM][TAM];
int xxx, yyy;

GRAFO *criaGrafo(int v);
ADJACENCIA *criaAdj(int v, int peso);
bool criaAresta(GRAFO *gr, int vi, int vf, TIPOPESO p);
void imprime(GRAFO *gr);
void visitaP(GRAFO *gr, int u, int *cor);
void profundidade(GRAFO *gr);

#endif