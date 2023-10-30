package cnh;

import infracao.Infracao;

public class Cnh {

    private String categoria;
    private String ufEmissao;
    private String dataValidade;
    private String dataEmissao;
    private int pontuacao;
    private String status;
    private Infracao Infracao;
    private String numCnh;

    public Cnh(String categoria, String ufEmissao, String dataValidade, String dataEmissao, int pontuacao,
               String status, infracao.Infracao infracao, String numCnh) {
        this.categoria = categoria;
        this.ufEmissao = ufEmissao;
        this.dataValidade = dataValidade;
        this.dataEmissao = dataEmissao;
        this.pontuacao = pontuacao;
        this.status = status;
        Infracao = infracao;
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

    public infracao.Infracao getInfracao() {
        return Infracao;
    }

    public String getNumCnh() {
        return numCnh;
    }
}
