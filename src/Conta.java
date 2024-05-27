public abstract class Conta {
    protected String agencia;
    protected int numero;
    protected double saldo;
    private static final String AGENCIA_PADRAO = "0001";
    private static int SEQUENCIAL = 1;
    // protected Cliente cliente;
    
    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL++;
    }
    
    public String getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirIformacoesComuns(){
        System.out.println(String.format("Agênca: %s", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
