import model.Chamado;

public class Main {
    public static void main(String[] args) {
        Chamado chamado1 = new Chamado(
                "COD-001", "Impressora quebrada", "Gerente do departamento de prodição");
        Chamado chamado2 = new Chamado(
                "COD-002", "Cafeteira quebrada", "Supervisor do escritório");

        System.out.println("========== Chamado 1 ==========");
        chamado1.resolver();

        chamado1.iniciarAtendimento();

        chamado1.aguardarCliente();

        chamado1.resolver();

        chamado1.responderCliente();

        chamado1.resolver();

        chamado1.cancelar();
        System.out.println();

        System.out.println("========== Chamado 2 ==========");
        chamado2.cancelar();

        chamado2.iniciarAtendimento();

    }
}
