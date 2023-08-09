
package main1;
import javax.swing.JOptionPane;

public class Main1 {
    public static void main(String[] args) {
        Aluguel aluguel = new Aluguel();
        aluguel.iniciarLocacao();
        aluguel.fecharLocacao();

        // Obtém o resumo da locação
        String resumo = aluguel.mostrarResumoLocacao();

        // Exibe o resumo em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, resumo);
    }
}