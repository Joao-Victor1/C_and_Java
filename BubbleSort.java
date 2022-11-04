import javax.swing.JOptionPane;

public class ex8 {
    public static void main(String[] args){
        /*Fazer um programa que lê um conjunto de 10 valores e
         os imprime ordenados.
         */

         //Criação do array
         int vet[] = {5,10,55,1,3,9,31,12,7,67};
         int aux;

         //Ordenação por bubble sort

         for(int i = 0; i < vet.length; i++){
            for(int j = 0; j < vet.length - 1; j++){
                if(vet[j] > vet[j + 1]){
                    aux =  vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
         }
         //Impressão do resultado
         
         for(int i = 0; i < vet.length; i++){
            JOptionPane.showMessageDialog(null, vet[i] + "");
         }
    }       
}
