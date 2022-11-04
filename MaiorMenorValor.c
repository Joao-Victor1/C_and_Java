#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv){

	/* Fazer um programa em "C" que lê 10 valores e imrpime o maior e menor valores lidos.*/
	int vet[10];
	int i;
	int menor = 99999; //Variáveis para armazenar posição
	int maior = -99999;

	for(i = 0; i < 10; i++){
		printf("Digite o valor da posição: %d\n", i);
		scanf("%d", &vet[i]);
	}

	//Percorer o array e armazenar as posições

	for(i = 0; i < 10; i++){
		printf("%d\n", vet[i]);
		if(menor > vet[i]){
			menor = vet[i];
		}
		if(maior < vet[i]){
			maior = vet[i];
		}
	}

	//Impressão dos resultados
	
	printf("\nO menor valor é: %d\n", menor);
	printf("\nO maior valor é: %d\n", maior);


	return 0;
}