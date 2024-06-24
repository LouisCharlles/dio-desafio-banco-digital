public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("======= A seguir as informações da sua Conta Poupança =======");
        imprimirInformacoesDaConta();
    }
}
