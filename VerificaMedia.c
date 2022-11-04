#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv){

	/*Fazer um programa em "C" que lê um conjunto de 10 valores
	inteiros e verifica se algum dos valores é igual a média do mesmos.*/

	//Declaração de variáveis

	int vet[10] = {2,25,4,3,8,15,72,99,12,10};
	int i;
	int media;
	int soma;
	int posx;

	//Impressão do vetor

	for(int i = 0; i < 10; i++){
		printf("%d\n", vet[i]);
	}
	
	//Soma dos valores de cada posição do vetor

	soma = vet[0] + vet[1] + vet[2] + vet[3] + vet[4] + vet[5] + vet[6] + vet[7] + vet[8] + vet[9];

	//Média dos valores

	media = soma / 10;

	//Impressão da média

	printf("\nA média dos valores é: %d\n", media);

	//Comparação da média com os valores do vetor

	for(int i = 0; i < 10; i++){
		if(media == vet[i]){
			printf("\nA média é igual ao valor: %d do vetor\n", vet[i]); //Impressão do resultado
		}
	}

	return 0;
}