#include "DJIKSTRA.h"

int op = 0, valV = 0, valA = 0;
int VI = 0, VF = 0, ps = 0;

int main() {
	int *r;
	int i,x;
  xxx=0;

	while (op != 5) {
		printf("++++++MENU++++++\n");
		printf("0 - Criar Grafo\n");
		printf("1 - Inserir aresta\n");
		printf("2 - Imprimir\n");
		printf("3 - Gerar o caminho minimo\n");
		printf("4 - Imprimir o caminho minimo\n");
		printf("5 - Sair\n");

		scanf("%i", &op);

		switch (op) {
		case 0:
			printf("Digite numero de vertices desejado\n");
			scanf("%i", &valV);
			GI = criaGrafo(valV);
			if (GI != NULL) {
				printf("Grafo criado com sucesso\n");
				printf("Vertices criados\n");
				for (int x = 0; x < valV; x++) {
					printf("%i ; ", x);
				}
				printf("\n");
			}
			break;

		case 1:
			printf("Digite numero de arestas desejado\n");
			scanf("%i", &valA);
			for (int x = 0; x < valA; x++) {
				printf("Digite Vertice inicial\n");
				scanf("%i", &VI);
				printf("Digite Vertice final\n");
				scanf("%i", &VF);
				printf("Digite Peso da aresta\n");
				scanf("%i", &ps);
				criaAresta(GI, VI, VF, ps);
			}
			break;

		case 2:
			imprime(GI);
			break;

		case 3:
		 r = dijkstra(GI, 0);
			break;
    
		case 4:
      for(i=0; i<GI->vertices; i++){
        printf("D(v0 -> v%d) = PESO %d\n", i, r[i]);
        printf("Caminho minimo: ");
        printf("<0> ");
        if(i>0){
        for(x=1; x<=i+1; x++){
          if(GI->adj[x].dado == i){break;}
          printf("<%d> ", GI->adj[x].dado);
        }
        printf("<%d>", i);
        printf("\n");
      }
      else{printf("\n");
      }}
			break;
    
		case 5:
			printf("Saindo\n");
			break;
		default:
			printf("Opcao invalida\n");
			break;
		}
	}

	return 0;
}