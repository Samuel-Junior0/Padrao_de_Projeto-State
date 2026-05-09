package states;

import interfaces.EstadoChamado;
import model.Chamado;

public class EstadoAberto implements EstadoChamado {
    @Override
    public void iniciarAtendimento(Chamado chamado) {
        System.out.println("Atendimento iniciado.");
        chamado.setEstado(new EstadoEmAtendimento());
    }

    @Override
    public void aguardarCliente(Chamado chamado) {
        System.out.println("Não é possível aguardar cliente: o chamado ainda não foi atendido.");
    }

    @Override
    public void responderCliente(Chamado chamado) {
        System.out.println("Não há pendência de cliente para um chamado aberto.");
    }

    @Override
    public void resolver(Chamado chamado) {
        System.out.println("Não é possível resolver um chamado que ainda está aberto.");
    }

    @Override
    public void cancelar(Chamado chamado) {
        System.out.println("Chamado cancelado pelo solicitante.");
        chamado.setEstado(new EstadoCancelado());
    }
}
