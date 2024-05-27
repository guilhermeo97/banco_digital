public class App {
    public static void main(String[] args) throws Exception {
       Conta corrente = new ContaCorrente();
       Conta poupanca = new ContaPoupanca(); 
       Conta poupanca2 = new ContaPoupanca(); 
       Conta poupanca3 = new ContaPoupanca(); 

       corrente.depositar(100);
       poupanca.depositar(200);
       corrente.transferir(100, poupanca);

       corrente.imprimirIformacoesComuns();
       poupanca.imprimirIformacoesComuns();
    }
}
