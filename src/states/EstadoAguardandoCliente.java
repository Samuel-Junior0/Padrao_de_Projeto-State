package states;

import interfaces.EstadoChamado;
import model.Chamado;

public class EstadoAguardandoCliente implements EstadoChamado {
    @Override
    public void iniciarAtendimento(Chamado chamado) {
        System.out.println("Para iniciar, o cliente precisa responder primeiro.");
    }

    @Override
    public void aguardarCliente(Chamado chamado) {
        System.out.println("O chamado já está aguardando o cliente.");
    }

    @Override
    public void responderCliente(Chamado chamado) {
        System.out.println("Cliente respondeu. Retornando para Em Atendimento.");
        chamado.setEstado(new EstadoEmAtendimento());
    }

    @Override
    public void resolver(Chamado chamado) {
        System.out.println("Não é possível resolver enquanto aguarda o cliente.");
    }

    @Override
    public void cancelar(Chamado chamado) {
        System.out.println("Chamado cancelado.");
        chamado.setEstado(new EstadoCancelado());
    }
}
