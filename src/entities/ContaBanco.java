package entities;

public class ContaBanco {
	private int numConta;
	private String titular;
	private double saldo;
	
	public ContaBanco() {
		
	}
	
	public ContaBanco(int numConta, String titular) {
		this.numConta = numConta;
		this.titular = titular;
	}
	
	public ContaBanco(int numConta, String titular, double depInicial) {
		this.numConta = numConta;
		this.titular = titular;
		efetuarDeposito(depInicial);
	}
	

	public int getNumConta() {
		return numConta;
	}

	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getSaldo() {
		return saldo;
	}

	public void efetuarSaque(double saque) {
		this.saldo -= (saque + 5.00);
	}
	
	public void efetuarDeposito(double deposito) {
		this.saldo += deposito;
	}
	

	public String toString() {
		return "Conta: "
				+numConta
				+ ", Titular: "
				+ titular
				+ ", Saldo: R$"
				+ String.format("%.2f", saldo);
	}
}
