#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv){

	/*Fazer um programa que imprime a tabela ASCII(código decimal
	código hexa, caracter) para os códigos de 0 a 127*/

	//Declaração da variável que vai percorrer a tabela

	int a = 0;

	printf("Tabela ASCII:\n");

	//Incremento para puxar a tabela
	for(a = 0; a < 88; a++){
		printf("Decimal; %o\tHexadecimal: %x\t\t", a,a);

		if(a > 32){
			printf("Caractere: %c", a); //Caracteres (começam a partir do código 32 da tabela).

			printf("\n");
		}
	}

	return 0;
}