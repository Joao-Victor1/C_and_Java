import javax.swing.JOptionPane;

public class ex2 {
    public static void main(String[] args){

        /* Fazer um programa que solicita um número decimal e imprime 
        o correspondente em hexa e octal.
         */

        //Variáveis de conversão

        String octal, hexa;

        //Solicitação do valor decimal
        
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor decimal, para ser convertido em octal e hexadecimal:"));

        //Convertendo o valor decimal

        octal = Integer.toOctalString(num); //Método de conversão automático com parâmetro inteiro
        hexa = Integer.toHexString(num);

        //Impressão do resultado

        JOptionPane.showMessageDialog(null, "O valor em octal é: " +octal);
        JOptionPane.showMessageDialog(null, "O valor em hexadecimal é: " +hexa);
    }
    
}