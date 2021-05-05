#include "LISTA.h"

LISTA *LGInsere(LISTA *l,void *a){
    LISTA *novo = (LISTA*) malloc(sizeof(LISTA));
    novo->info = a;
    novo->prox = l;
    return novo;
}

void LGPercorre(LISTA *l, void (*cb)(void*)){
    LISTA *aux;
    for(aux=l; aux!=NULL; aux=aux->prox){
        cb(aux->info);
    }
}

void LGBuscarpercorre(LISTA *l, void (*cb)(void*,void*,void*), void *dado){
   int comp=0;
   void *c = &comp;
 LISTA *aux2;
   for(aux2=l; aux2!=NULL; aux2=aux2->prox){
        cb(aux2->info,dado,c);
    }if(comp==0){
       printf("Aluno não encontrado\n");
    }
}

LISTA* LG_Apagar(LISTA* ini, int(*cb)(void*,void*),void* mat){
	LISTA* aux = ini;
	LISTA* ant = NULL;
	int l;
	if(ini==NULL){
		printf("Lista vazia\n");
	return aux;
	}
	while(aux!=NULL){
	l = cb(aux->info,mat);
	if (l == 1){
	break;
}

	ant = aux;
	aux = aux->prox;
	}
	if(ant == NULL){
	ini = ini->prox;
	free(aux);
	printf("Aluno removido com sucesso!\n");
	return ini;
    }

	if(aux != NULL){
		ant->prox = aux->prox;
	    free(aux);
	    printf("Aluno removido com sucesso!\n");
	   return ini;
	}
	if(aux == NULL){
		printf("Aluno inexistente\n");
	}
	return ini;
}