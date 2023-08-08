/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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