package states;

import interfaces.EstadoChamado;
import model.Chamado;

public class EstadoResolvido implements EstadoChamado {
    @Override
    public void iniciarAtendimento(Chamado chamado) {
        System.out.println("Erro: Chamamdo já reslvido.");
    }

    @Override
    public void aguardarCliente(Chamado chamado) {
        System.out.println("Erro: Chamamdo já reslvido.");
    }

    @Override
    public void responderCliente(Chamado chamado) {
        System.out.println("Erro: Chamamdo já reslvido.");
    }

    @Override
    public void resolver(Chamado chamado) {
        System.out.println("O chamado já está resolvido.");
    }

    @Override
    public void cancelar(Chamado chamado) {
        System.out.println("Não é possível cancelar um chamado já resolvido.");
    }
}
