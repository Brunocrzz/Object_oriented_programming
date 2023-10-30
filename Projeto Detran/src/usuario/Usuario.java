package usuario;

import cnh.Cnh;
import veiculo.Veiculo;

public class Usuario {
    private String nome;
    private String cpf;
    private String sexo;
    private String email;
    private Cnh cng;
    private  Veiculo Veiculo;

    public Usuario(String nome, String cpf, String sexo, String email, Cnh cng, veiculo.Veiculo veiculo) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.email = email;
        this.cng = cng;
        Veiculo = veiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cnh getCng() {
        return cng;
    }

    public void setCng(Cnh cng) {
        this.cng = cng;
    }

    public veiculo.Veiculo getVeiculo() {
        return Veiculo;
    }

    public void setVeiculo(veiculo.Veiculo veiculo) {
        Veiculo = veiculo;
    }

}


