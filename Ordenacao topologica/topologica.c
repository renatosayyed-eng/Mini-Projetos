#include "TOPOLOGICA.h"

#define true 1
#define false 0	


GRAFO *criaGrafo(int v) {
	GRAFO *g = (GRAFO *)malloc(sizeof(GRAFO));
	g->vertices = v;
	g->arestas = 0;
	g->adj = (VERTICE *)malloc(v * sizeof(VERTICE));
	int i;
	for (i = 0; i < v; i++) {
		g->adj[i].cab = NULL;
	}
	return (g);
}

ADJACENCIA *criaAdj(int v, int peso) {
	ADJACENCIA *temp = (ADJACENCIA *)malloc(sizeof(ADJACENCIA));
	temp->vertice = v;
	temp->peso = peso;
	temp->prox = NULL;
	return (temp);
}

bool criaAresta(GRAFO *gr, int vi, int vf, TIPOPESO p) {
	if (!gr)
		return (false);
	if ((vf < 0) || (vf >= gr->vertices))
		return (false);
	ADJACENCIA *novo = criaAdj(vf, p);
	novo->prox = gr->adj[vi].cab;
	gr->adj[vi].cab = novo;
	gr->arestas++;
	return (true);
}

void imprime(GRAFO *gr) {
	printf("Vertices: %d. Arestas: %d.\n", gr->vertices, gr->arestas);
	int i;
	for (i = 0; i < gr->vertices; i++) {
		printf("v%d: ", i);
		ADJACENCIA *ad = gr->adj[i].cab;
		while (ad) {
			printf("v%d(peso %d)", ad->vertice, ad->peso);
			ad = ad->prox;
		}
	}
	printf("\n");
}

void visitaP(GRAFO *gr, int u, int *cor){

  cor[u] = AMARELO;
  ADJACENCIA *v = gr->adj[u].cab;
  while (v) {
    if(cor[v->vertice]==BRANCO){
      mat[xxx][yyy] = v->vertice;
      yyy++;
      visitaP(gr,v->vertice,cor);}
    v = v->prox;
  }
  cor[u] = VERMELHO;
  xxx++;
}

void profundidade(GRAFO *gr){
int cor[gr->vertices];
int u;
for (u=0;u<gr->vertices;u++) {
  cor[u] = BRANCO;
}

for (u=0;u<gr->vertices;u++) {
  yyy=0;
  if (cor[u] == BRANCO)
    visitaP(gr,u,cor);
}

}