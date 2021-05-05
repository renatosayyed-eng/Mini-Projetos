#include "DJIKSTRA.h"

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

void inicializaD(GRAFO *gr, int *d, int *p, int s){
  int v;
  for(v=0;v<gr->vertices;v++){
    d[v] = INT_MAX/2;
    p[v] = -1;
  }
  d[s] = 0;
}

void relaxa(GRAFO *gr, int *d, int*p, int u, int v){
  int xx=0;
  ADJACENCIA *aux = gr->adj[u].cab;
  while(aux && (aux->vertice !=v))
  aux = aux->prox;
  if(aux) {
    if (d[v] > d[u] + aux->peso) {
      d[v] = d[u] + aux->peso;
      p[v] = u;
      gr->adj[xxx].dado = p[v];
      xxx++;
    }
  }
}

bool existeAberto(GRAFO *gr, int *aberto){
  int i;
  for(i=0;i<gr->vertices;i++)
  if (aberto[i]) return true;
  return false;
}

int menorDist(GRAFO *gr, int *aberto, int *d){
  int i;
  for(i=0; i<gr->vertices; i++)
  if (aberto[i]) break;
  if(i==gr->vertices) return -1;
  int menor = i;
  for(i = menor+1; i<gr->vertices; i++)
  if(aberto[i] && (d[menor]>d[i]))
  menor = i;
  return menor;
}

int *dijkstra(GRAFO *gr, int s) {
  int *d = (int *)malloc(gr->vertices*sizeof(int));
  int p[gr->vertices];
  bool aberto[gr->vertices];
  inicializaD(gr,d,p,s);
  int i;
  for(i=0; i<gr->vertices;i++)
  aberto[i] = true;

  while (existeAberto(gr, aberto)){
    int u = menorDist(gr,aberto,d);
    aberto[u] = false;
    ADJACENCIA *aux = gr->adj[u].cab;
    while(aux) {
      relaxa(gr,d,p,u,aux->vertice);
      aux = aux->prox;
    }
  }
return d;
}