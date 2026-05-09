package states;

import interfaces.EstadoChamado;
import model.Chamado;

public class EstadoCancelado implements EstadoChamado {
    @Override public void iniciarAtendimento(Chamado c) {
        System.out.println("Não é possível atender um chamado cancelado.");
    }

    @Override public void aguardarCliente(Chamado c) {
        System.out.println("Chamado cancelado.");
    }

    @Override public void responderCliente(Chamado c) {
        System.out.println("Chamado cancelado.");
    }

    @Override public void resolver(Chamado c) {
        System.out.println("Chamado cancelado.");
    }

    @Override public void cancelar(Chamado c) {
        System.out.println("O chamado já está cancelado.");
    }
}