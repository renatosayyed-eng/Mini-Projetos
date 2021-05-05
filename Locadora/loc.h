#ifndef LOC_H
#define LOC_H

#include<stdio.h>
#include<stdlib.h>
#include<string.h>


typedef enum type{ 

  DRAMA = 1,    
  ROMANCE = 2, 
  DESENHO = 3   

}TYPE;


typedef struct movie
{

int code, year, amount;

char title[100];

char texto[1024];

TYPE genero;

}MOVIE;


typedef struct ordem
{

  struct ordem *last;
 
  MOVIE filme;

  struct ordem *next;

}ORDENACAO;

int totalAmount;
ORDENACAO *inicio;
ORDENACAO *termino;

void read();
ORDENACAO *search();
void loan();
void devolution();
void print();
void report();
void backup();

#endif