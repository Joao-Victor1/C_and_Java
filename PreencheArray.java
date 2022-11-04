import javax.swing.JOptionPane;

public class ex10 {
    public static void main(String[] args){
        /* Fazer uma rotina que recebe um array do tipo double 
         * e o número de valores que devem ser solicitados ao usuário e devolve
         * o array preenchido com os valores digitados.
         */

        double vet[];

        //Definir o tamanho do array

        int tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho do array: "));

        //Preencher o array
         vet = new double[tam];
         for(int i = 0; i < vet.length; i++){
            vet[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da posição: " +i));
        }
        //Impressão do resultado
        for(int i = 0; i < vet.length; i++){
            JOptionPane.showMessageDialog(null, "O valor da posição " +i +" é: " +vet[i]);
        }
         

    }    
}
