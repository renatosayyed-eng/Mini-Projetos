#include "TOPOLOGICA.h"

int op = 0, valV = 0, valA = 0;
int VI = 0, VF = 0, ps = 0;

int main() {
	int *r;
	int i,x, z;
  xxx=0;

	while (op != 5) {
		printf("++++++MENU++++++\n");
		printf("0 - Criar Grafo\n");
		printf("1 - Inserir aresta\n");
		printf("2 - Imprimir\n");
		printf("3 - DFS\n");
		printf("4 - Ordenacao Topologica\n");
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
    for(x=0;x<TAM; x++){
      for(z=0;z<TAM;z++){
        mat[x][z] = 596450;
      }
    }
     profundidade(GI);
			break;
    
		case 4:
    printf("v0");
    for(x = 0; x<xxx; x++){
      for(z = 0; z<xxx; z++){
        if(mat[x][z]!=596450){
          printf("<-v%d", mat[x][z]);
        }
      }
    }
    printf("\n");
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