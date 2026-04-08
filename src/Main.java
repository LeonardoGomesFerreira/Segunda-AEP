import Central.ServicoSolicitacao;
import Dominio.Solicitacao;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final ServicoSolicitacao servico = new ServicoSolicitacao();

    public static void main(String[] args) {
        int opcao;

        do {
            mostrarMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> criarSolicitacao();
                case 2 -> listarSolicitacoes();
                case 3 -> buscarSolicitacao();
                case 4 -> atualizarStatus();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n===== SISTEMA DE SOLICITAÇÕES =====");
        System.out.println("1 - Criar solicitação");
        System.out.println("2 - Listar solicitações");
        System.out.println("3 - Buscar por protocolo");
        System.out.println("4 - Atualizar status");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
    }

    private static void criarSolicitacao() {
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.print("Categoria: ");
        String categoria = scanner.nextLine();

        Solicitacao s = servico.criarSolicitacao(descricao, categoria);

        System.out.println("Criado com protocolo: " + s.getProtocolo());
    }

    private static void listarSolicitacoes() {
        for (Solicitacao s : servico.listarSolicitacoes()) {
            System.out.println("----------------------------------");
            System.out.println("Protocolo: " + s.getProtocolo());
            System.out.println("Descrição: " + s.getDescricao());
            System.out.println("Categoria: " + s.getCategoria().getNome());
            System.out.println("Status: " + s.getStatus());
        }
    }

    private static void buscarSolicitacao() {
        System.out.print("Protocolo: ");
        int protocolo = scanner.nextInt();

        Solicitacao s = servico.buscarPorProtocolo(protocolo);

        if (s != null) {
            System.out.println("Descrição: " + s.getDescricao());
            System.out.println("Status: " + s.getStatus());
        } else {
            System.out.println("Solicitação não encontrada.");
        }
    }

    private static void atualizarStatus() {
        System.out.print("Protocolo: ");
        int protocolo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Novo status: ");
        String status = scanner.nextLine();

        System.out.print("Comentário: ");
        String comentario = scanner.nextLine();

        boolean atualizado = servico.atualizarStatus(protocolo, status, comentario);

        if (atualizado) {
            System.out.println("Status atualizado!");
        } else {
            System.out.println("Solicitação não encontrada.");
        }
    }
}