#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv){

	/*
	Fazer um programa em "C" que lê o preço de um produto e inflaciona esse preço
	em 10% se ele for menor que 100 e, em 20% se ele for maior ou igual a 100.
	*/

	//Declaração de variáveis
	float preco;
	float preco10;
	float preco20;

	//Solicitação do preço do produto

	printf("Digite o valor do produto: ");
	scanf("%f", &preco);

	printf("O valor do produto é: %f\n", preco);

	//Estrutura de decisão
	
	if(preco < 100){
		preco10 = preco + 0.1;
		printf("O valor com inflação de dez porcento fica: %f\n", preco10);

	}else if(preco >= 100){
		preco20 = preco + 0.2;
		printf("O valor com inflação de vinte porcento fica: %f\n", preco20);
	}

	return 0;
}	