package model;

import interfaces.EstadoChamado;
import states.EstatoAberto;

public class Chamado {
    private String codigo;
    private String descricao;
    private String solicitante;
    EstadoChamado estadoAtual;

    public Chamado(String codigo, String descricao, String solicitante) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.solicitante = solicitante;
        this.estadoAtual = new EstatoAberto();
    }

    public void iniciarAtendimento() {
        estadoAtual.iniciarAtendimento(this);
    }

    public void aguardarCliente() {
        estadoAtual.aguardarCliente(this);
    }

    public void responderCliente() {
        estadoAtual.responderCliente(this);
    }

    public void resolver() {
        estadoAtual.resolver(this);
    }

    public void cancelar() {
        estadoAtual.cancelar(this);
    }

    public void setEstado(EstadoChamado estado) {
        this.estadoAtual = estado;
    }
    public EstadoChamado getEstado() {
        return this.estadoAtual;
    }
}
