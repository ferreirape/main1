package main1;

import javax.swing.JOptionPane;
import java.util.Locale;

public class Aluguel {
    private Carro carro;
    private Cliente cliente;
    private int qtdDias;
    private int kmInicial;
    private int kmFinal;
    private double valorTotalAluguel;

    public void iniciarLocacao() {
        // Cadastrar usuário e carro do aluguel
        cliente = new Cliente();
        cliente.cadastrarUsuario();

        carro = new Carro();
        carro.cadastrarCarro();

        // Leitura da quantidade de dias e km inicial
        this.qtdDias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias de locação:"));
        this.kmInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o Km inicial do veículo:"));
    }

    public void fecharLocacao() {
        // Leitura da informação de Km final
        this.kmFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o Km final do veículo:"));

        // Cálculo do valor total do aluguel
        double valorPorKm = carro.getValorPorKm();
        double valorTotalSemDesconto = qtdDias * valorPorKm * (kmFinal - kmInicial);
        
        if (qtdDias > 20) {
            valorTotalAluguel = valorTotalSemDesconto * 0.8; // Desconto de 20%
        } else if (qtdDias > 10) {
            valorTotalAluguel = valorTotalSemDesconto * 0.9; // Desconto de 10%
        } else {
            valorTotalAluguel = valorTotalSemDesconto;
        }
    }

   public String mostrarResumoLocacao() {
        
        // Obtem as informações do cliente e do carro em forma de strings
        String dadosCliente = cliente.mostrarDadosUsuario();
        String dadosCarro = carro.mostrarDadosCarro();
        
        // Formatar o valor total do aluguel com duas casas decimais
        String valorFormatado = String.format(Locale.US, "%.2f", valorTotalAluguel);
       
        // Preparação da string com o resumo do aluguel
        String resumoLocacao = "Resumo Aluguel\n" +
            "Cliente\n" +
            dadosCliente + "\n" +
            "Carro\n" +
            dadosCarro + "\n" +
            "Aluguel\n" +
            "Quantidade de dias: " + qtdDias + "\n" +
            "Km Inicial: " + kmInicial + "\n" +
            "Km Final: " + kmFinal + "\n" +
            "Valor Total: R$" + valorFormatado + "\n";

        return resumoLocacao;
    }
}