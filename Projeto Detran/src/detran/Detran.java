package detran;

import infracao.Infracao;
import usuario.Usuario;

public class Detran {
    private Usuario Usuario;
    private Infracao Infracao;

    public Detran(usuario.Usuario usuario, infracao.Infracao infracao) {
        Usuario = usuario;
        Infracao = infracao;
    }

    public usuario.Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(usuario.Usuario usuario) {
        Usuario = usuario;
    }

    public infracao.Infracao getInfracao() {
        return Infracao;
    }

    public void setInfracao(infracao.Infracao infracao) {
        Infracao = infracao;
    }

}
