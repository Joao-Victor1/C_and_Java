
import javax.swing.JOptionPane;
import java.lang.Math;

public class ex3 {
    public static void main(String[] args){

        /*Fazer um programa que solicite 2 números e informe:
         * a) A soma dos números;
         * b) O produto do primeiro número pelo quadrado do segundo;
         * c) O quadrado do primeiro número 
         * d) A raiz quadrada da soma dos quadrados;
         * e) O seno da diferença do primeiro número pelo segundo;
         * f) O módulo do primeiro número.
         */

         //Declaração de variáveis
         int soma, soma2, prod, quad, dif, mod = 0;
         double raiz, sen = 0;

         //Solicitação dos números

         int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro número:"));
         int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo número:"));

         //Soma 

         soma = num1 + num2;

         //Produto do primeiro pelo quadrado do segundo

         prod = num1 * (num2 * num2);

         //Quadrado do primeiro número

         quad = num1 * num1;

         //A raiz quadrada da soma dos quadrados
        
         soma2 = (num1 * num1) + (num2 * num2);
         raiz = Math.sqrt(soma2);

         //O seno da diferença do primeiro número pelo segundo

        dif = num1 - num2;
        sen = Math.sin(dif);

        //O módulo do primeiro número

        mod = Math.abs(num1);

        //Impressão dos resultados

        JOptionPane.showMessageDialog(null, "A soma dos números digitados: " +soma);
        JOptionPane.showMessageDialog(null, "O produto do primeiro pelo quadrado do segundo: " +prod);
        JOptionPane.showMessageDialog(null, "O quadrado do primeiro número: " +quad);
        JOptionPane.showMessageDialog(null, "A raiz quadrada da soma dos quadrados: " +raiz);
        JOptionPane.showMessageDialog(null, "O seno da diferença do primeiro número pelo segundo: " +sen);
        JOptionPane.showMessageDialog(null, "O módulo do primeiro número: " +mod);


    }
    
}
