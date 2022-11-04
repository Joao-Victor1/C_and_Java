#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv){
	/*Fazer um programa que lê valores para uma matriz do tipo
	"float" de 5 linhas por 3 colunas e imprime a diferença entre a média
	dos elementos das colunas pares e a média dos elementos das linhas ímpares.*/


	float mat[5][3];
	int i,j;
	float somapar;
	float somaimpar;
	float dif;

	//Preencher matriz

	for(int i = 0; i < 5; i++){
		for(int j = 0; j < 3; j++){
			printf("\nDigite os valores da matriz:\n");
			scanf("%f", &mat[i][j]);
		}
	}
	//Mostrar matriz

	for(int i = 0; i < 5; i++){
		for(int j = 0; j < 3; j++){
			printf("\n%f\n", mat[i][j]);
		}
	}

	//Média dos valores das colunas pares e valores das linhas ímpares da matriz

	for(int i = 0; i < 5; i++){
		for(int j = 0; j < 3; j++){
			if(j % 2 != 0){
				somapar += mat[i][j] / 5;
			}else if((i+1) % 2 != 0){
				somaimpar += mat[i][j] / 9;			
			}
		}
	}
	//Resultado das somas
	printf("\n A média dos elementos das colunas pares é: %f\n", somapar);
	printf("\n A média dos elementos das linhas ímpares é: %f\n", somaimpar);

	//Diferença entre as duas médias e impressão do resultado

	dif = somapar - somaimpar;
	printf("\n A diferença entre as duas médias é de: %f\n\n", dif);

	return 0;
}