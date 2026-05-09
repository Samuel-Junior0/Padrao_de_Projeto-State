package states;

import interfaces.EstadoChamado;
import model.Chamado;

public class EstadoEmAtendimento implements EstadoChamado {
    @Override
    public void iniciarAtendimento(Chamado chamado) {
        System.out.println("O chamado já está em atendimento.");
    }

    @Override
    public void aguardarCliente(Chamado chamado) {
        System.out.println("Chamado pausado: aguardando retorno do cliente.");
        chamado.setEstado(new EstadoAguardandoCliente());
    }

    @Override
    public void responderCliente(Chamado chamado) {
        System.out.println("O chamado já está sendo atendido.");
    }

    @Override
    public void resolver(Chamado chamado) {
        System.out.println("Chamado resolvido com sucesso.");
        chamado.setEstado(new EstadoResolvido());
    }

    @Override
    public void cancelar(Chamado chamado) {
        System.out.println("Chamado cancelado.");
        chamado.setEstado(new EstadoCancelado());
    }
}
