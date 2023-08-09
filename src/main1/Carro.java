package main1;

import javax.swing.JOptionPane;

public class Carro {
    private String modelo;
    private String marca;
    private double valorPorKm;

    public void cadastrarCarro() {
        // Leitura das informações através do JOptionPane
        this.modelo = JOptionPane.showInputDialog("Digite o modelo do carro:");
        this.marca = JOptionPane.showInputDialog("Digite a marca do carro:");
        this.valorPorKm = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por Km do carro:"));
    }

    public String mostrarDadosCarro() {
        // Preparação da string para exibir as informações do carro
        String dadosCarro = "Modelo: " + modelo + "\n"
                          + "Marca: " + marca + "\n"
                          + "Valor por Km: " + valorPorKm + "\n";

        // Exibição das informações através do JOptionPane
        JOptionPane.showMessageDialog(null, dadosCarro);
        return dadosCarro;
    }

    public double getValorPorKm() {
        return valorPorKm;
    }
}
