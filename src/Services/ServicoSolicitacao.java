package Services;

import Models.Solicitacao;
import Models.Categoria;

import java.util.ArrayList;
import java.util.List;

public class ServicoSolicitacao {
    private List<Solicitacao> solicitacoes = new ArrayList<>();

    public Solicitacao criarSolicitacao(String descricao, String nomeCategoria) {
        Categoria categoria = new Categoria(nomeCategoria);
        Solicitacao nova = new Solicitacao(descricao, categoria);
        solicitacoes.add(nova);
        return nova;
    }

    public List<Solicitacao> listarSolicitacoes() {
        return solicitacoes;
    }

    public Solicitacao buscarPorProtocolo(int protocolo) {
        for (Solicitacao s : solicitacoes) {
            if (s.getProtocolo() == protocolo) {
                return s;
            }
        }
        return null;
    }

    public boolean atualizarStatus(int protocolo, String novoStatus, String comentario) {
        Solicitacao s = buscarPorProtocolo(protocolo);

        if (s != null) {
            s.atualizarStatus(novoStatus, comentario);
            return true;
        }
        return false;
    }
}