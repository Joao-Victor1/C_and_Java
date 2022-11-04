
import javax.swing.JOptionPane;

public class ex1 {
    public static void main(String[] args){

        /*Fazer um programa que pergunta um valor em metros e imprime-o
        correspondente em decímetros, centímetros e milímetros.
         */

        //Variáveis para decímetro, centímetro e milímetro

        float d,c,mi = 0;

        //Recebendo valor

        float m = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite uma medida em metros(Apenas o número):"));
        
        //Cálculos de conversão
        d = (m * 10);
        c = (m * 100);
        mi = (m * 1000);

        //Impressão dos resultados

        JOptionPane.showMessageDialog(null, "A medida inserida,em decímetros é: " +d+ " dm");
        JOptionPane.showMessageDialog(null, "A medida inserida, em centímetros é: " +c+ " cm");
        JOptionPane.showMessageDialog(null, "A medida inserida, em milímetros é: " +mi+ " mm");

    }
    
}
