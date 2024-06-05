
public class Main {

	public static void main(String[] args) {
		Cliente alessandra = new Cliente();
		alessandra.setNome("Alessandra");
		
		Conta cc = new ContaCorrente(alessandra);
		Conta poupanca = new ContaPoupanca(alessandra);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
