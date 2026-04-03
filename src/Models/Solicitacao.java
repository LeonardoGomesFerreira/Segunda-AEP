package Models;

import java.util.ArrayList;
import java.util.List;

public class Solicitacao {
    private static int contador = 1;
    private int protocolo;
    private String descricao;
    private String status;
    private Categoria categoria;
    private List<HistoricoStatus> historico;

    public Solicitacao(String descricao, Categoria categoria) {
        this.protocolo = contador++;
        this.descricao = descricao;
        this.categoria = categoria;
        this.status = "ABERTA";
        this.historico = new ArrayList<>();
    }

    public int getProtocolo() {
        return protocolo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public List<HistoricoStatus> getHistorico() {
        return historico;
    }

    public void atualizarStatus(String novoStatus, String comentario) {
        this.status = novoStatus;
        this.historico.add(new HistoricoStatus(novoStatus, comentario));
    }
}