import javax.swing.JOptionPane;

public class ex9 {
    public static void main(String[] args){
        /* Fazer uma rotina que recebe como parâmetro um array de 5 posições
         contendo as notas de um aluno ao longo do ano e devolve a média do aluno.
         */

         float vet[] = new float[5];
         float media;
         float soma = 0;

         //Preencher o array

         for(int i = 0; i < 5; i++){
             vet[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota da posição " +i +":"));
         }
         for(int i = 0; i < 5; i++){
             JOptionPane.showMessageDialog(null, "As notas são: " +vet[i]);
         }
         //Soma das notas 
         for(int i = 0; i < 5; i++){
            soma += vet[i];
         }
         //Cálculo da média
         media = soma / 5;

         //Impressão do resultado
         JOptionPane.showMessageDialog(null, "A média das notas é: " +media);
         
    }   
}
