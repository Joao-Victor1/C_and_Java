
import javax.swing.JOptionPane;

public class ex4 {
    public static void main(String[] args){

        /*Faça um programa que lê dois valores e imrpime:
         * Se o primeiro valor for menor que o segundo, a lista de valores do primeiro até o segundo;
         * Se o primeiro valor for menor que o segundo, a lista de valores do segundo até o primeiro em ordem decrescente;
         * Se ambos forem iguais, a mensagem "valores iguais".
         */

        //Declaração de variáveis

         int vet[];

        //Solicitação dos valores

        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro valor: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo valor: "));
        
        //Estruturas de decisão para atender as condições

        vet = new int[num2];
        for(int i = num1; i < num2; i++){
            JOptionPane.showMessageDialog(null, "Os valores do primeiro ao segudno são: " +i);
        }

        vet = new int[num2];
        for(int i = num2; i > num1; i--){
            JOptionPane.showMessageDialog(null, "Os valores do segundo ao primeiro são: " +i);
        }

        if(num1 == num2){
            JOptionPane.showMessageDialog(null, "Os valores são iguais");
        }
    }   
}
