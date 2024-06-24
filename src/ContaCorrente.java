public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("======= A seguir as informações da sua Conta Corrente =======");
        imprimirInformacoesDaConta();
    }


}
