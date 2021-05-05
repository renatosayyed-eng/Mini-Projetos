#ifndef DJIKSTRA_H
#define DJIKSTRA_H

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <time.h>
#include <limits.h>

typedef int bool;
typedef int TIPOPESO;

typedef struct adjacencia {
	int vertice;
	TIPOPESO peso;
	struct adjacencia *prox;
} ADJACENCIA;

typedef struct vertice {
  int dado;
	ADJACENCIA *cab;
} VERTICE;

typedef struct grafo {
	int vertices;
	int arestas;
	VERTICE *adj;
} GRAFO;

GRAFO *GI;
int xxx;

GRAFO *criaGrafo(int v);
ADJACENCIA *criaAdj(int v, int peso);
bool criaAresta(GRAFO *gr, int vi, int vf, TIPOPESO p);
void imprime(GRAFO *gr);
int *dijkstra(GRAFO *gr, int s);
int menorDist(GRAFO *gr, int *aberto, int *d);
bool existeAberto(GRAFO *gr, int *aberto); 
void relaxa(GRAFO *gr, int *d, int*p, int u, int v);
void inicializaD(GRAFO *gr, int *d, int *p, int s);

#endif