package cnh;

import infracao.Infracao;
import java.util.ArrayList;
import java.util.List;

public class Cnh {

    private String categoria;
    private String ufEmissao;
    private String dataValidade;
    private String dataEmissao;
    private int pontuacao;
    private String status;
    private List<Infracao> infracoes = new ArrayList<>();
    private String numCnh;

    public Cnh(String categoria, String ufEmissao, String dataValidade, String dataEmissao, int pontuacao,
               String status, String numCnh) {
        this.categoria = categoria;
        this.ufEmissao = ufEmissao;
        this.dataValidade = dataValidade;
        this.dataEmissao = dataEmissao;
        this.pontuacao = pontuacao;
        this.status = status;
        this.numCnh = numCnh;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getUfEmissao() {
        return ufEmissao;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public String getStatus() {
        return status;
    }


    public String getNumCnh() {
        return numCnh;
    }

    public List<Infracao> getInfracoes() {
        return infracoes;
    }

    public void addInfracao(Infracao infracao) {
        this.infracoes.add(infracao);
    }
}
