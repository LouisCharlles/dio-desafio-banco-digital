
public abstract class Conta implements IConta{

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero_DaConta;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero_DaConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero_DaConta() {
        return numero_DaConta;
    }

    public double getSaldo() {
        return saldo;
    }


    @Override
    public void depositar(double valor) {
        saldo+=valor;
    }

    @Override
    public void sacar(double valor) {
        saldo-=valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    protected void imprimirInformacoesDaConta() {
        System.out.println(String.format("Titular: %s",this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("numero da Conta Corrente: %d",this.numero_DaConta));
        System.out.println(String.format("Saldo: %.2f",this.saldo));
    }


}
