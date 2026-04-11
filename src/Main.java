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

            System.out.println(); // espaço

            switch (opcao) {
                case 1 -> criarSolicitacao();
                case 2 -> listarSolicitacoes();
                case 3 -> buscarSolicitacao();
                case 4 -> atualizarStatus();
                case 0 -> System.out.println("Encerrando sistema...");
                default -> System.out.println("Opção inválida!");
            }

            if (opcao != 0) {
                pausar();
            }

        } while (opcao != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n====================================");
        System.out.println("     SISTEMA DE SOLICITAÇÕES");
        System.out.println("====================================");
        System.out.println("1 - Criar solicitação");
        System.out.println("2 - Listar solicitações");
        System.out.println("3 - Buscar por protocolo");
        System.out.println("4 - Atualizar status");
        System.out.println("0 - Sair");
        System.out.println("====================================");
        System.out.print("Escolha: ");
    }

    private static void criarSolicitacao() {
        System.out.println("----------- NOVA SOLICITAÇÃO -----------");

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.print("Categoria: ");
        String categoria = scanner.nextLine();

        Solicitacao s = servico.criarSolicitacao(descricao, categoria);

        System.out.println("\n✔ Solicitação criada com sucesso!");
        System.out.println("Protocolo: " + s.getProtocolo());
        System.out.println("----------------------------------------");
    }

    private static void listarSolicitacoes() {
        System.out.println("----------- LISTA DE SOLICITAÇÕES -----------");

        for (Solicitacao s : servico.listarSolicitacoes()) {
            System.out.println("\n----------------------------------");
            System.out.println("Protocolo : " + s.getProtocolo());
            System.out.println("Descrição : " + s.getDescricao());
            System.out.println("Categoria : " + s.getCategoria().getNome());
            System.out.println("Status    : " + s.getStatus());
        }

        System.out.println("\n--------------------------------------------");
    }

    private static void buscarSolicitacao() {
        System.out.println("----------- BUSCAR SOLICITAÇÃO -----------");

        System.out.print("Protocolo: ");
        int protocolo = scanner.nextInt();
        scanner.nextLine();

        Solicitacao s = servico.buscarPorProtocolo(protocolo);

        if (s != null) {
            System.out.println("\n----------- RESULTADO -----------");
            System.out.println("Protocolo : " + s.getProtocolo());
            System.out.println("Descrição : " + s.getDescricao());
            System.out.println("Categoria : " + s.getCategoria().getNome());
            System.out.println("Status    : " + s.getStatus());
            System.out.println("--------------------------------");
        } else {
            System.out.println("\n❌ Solicitação não encontrada.");
        }
    }

    private static void atualizarStatus() {
        System.out.println("----------- ATUALIZAR STATUS -----------");

        System.out.print("Protocolo: ");
        int protocolo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Novo status: ");
        String status = scanner.nextLine();

        System.out.print("Comentário: ");
        String comentario = scanner.nextLine();

        boolean atualizado = servico.atualizarStatus(protocolo, status, comentario);

        if (atualizado) {
            System.out.println("\n✔ Status atualizado com sucesso!");
        } else {
            System.out.println("\n❌ Solicitação não encontrada.");
        }

        System.out.println("----------------------------------------");
    }

    private static void pausar() {
        System.out.println("\nPressione ENTER para continuar...");
        scanner.nextLine();
    }
}