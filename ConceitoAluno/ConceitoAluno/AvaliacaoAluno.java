import interfaces.ConceitoAvaliacao;
import javax.swing.JOptionPane;

public class AvaliacaoAluno implements ConceitoAvaliacao {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Digite a nota do aluno (0-10): ", "Entrada de Nota", JOptionPane.QUESTION_MESSAGE);
        
        if (input == null || input.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma nota foi inserida. Encerrando.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double nota;
        try {
            nota = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um número.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String conceito = "";
        String descricao = "";

        if (nota >= 7.0) {
            conceito = "Excelente";
            descricao = ConceitoAvaliacao.EXCELENTE;
        } else if (nota >= 5.0) {
            conceito = "Satisfatório";
            descricao = ConceitoAvaliacao.SATISFATORIO;
        } else {
            conceito = "Insuficiente";
            descricao = ConceitoAvaliacao.INSUFICIENTE;
        }

        JOptionPane.showMessageDialog(null, "Conceito: " + conceito + "\nDescrição: " + descricao, "Resultado da Avaliação", JOptionPane.INFORMATION_MESSAGE);
    }
}

