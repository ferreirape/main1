package main1;
import javax.swing.JOptionPane;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;

    public void cadastrarUsuario() {
        // Leitura das informações do cliente através do JOptionPane
        this.nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
        this.cpf = JOptionPane.showInputDialog("Digite o CPF do cliente:");
        this.telefone = JOptionPane.showInputDialog("Digite o telefone do cliente:");
    }

    public String mostrarDadosUsuario() {
        // Preparação para exibir as informações do cliente
        String dadosUsuario = ""
                + "Nome: " + nome + "\n"
                + "CPF: " + cpf + "\n"
                + "Telefone: " + telefone + "\n";

        // Exibição das informações através do JOptionPane
        JOptionPane.showMessageDialog(null, dadosUsuario);
        
        return dadosUsuario;
    }
}

