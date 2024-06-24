public class Main {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(new Cliente("Luis"));
        Conta contaDestino = new ContaPoupanca(new Cliente("Luis"));
        conta.depositar(1);
        conta.depositar(149);
        conta.transferir(contaDestino,20);
        conta.imprimirExtrato();
        contaDestino.imprimirExtrato();
        
    }
}
