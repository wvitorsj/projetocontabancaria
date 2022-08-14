package core;

public class ContaBancaria {
	
	private int numeroConta;
	private int digitoVerificador;
	private String nomeTitular;
	private String cpfTitular;
	private double saldo;
	
	
	public ContaBancaria(int numeroConta, int digitoVerificador, String nomeTitular, String cpfTitular, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.digitoVerificador = digitoVerificador;
		this.nomeTitular = nomeTitular;
		this.cpfTitular = cpfTitular;
		this.saldo = saldo;
	}
	
	//MÉTODOS ESPECÍFICOS DA CONTA BANCÁRIA
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		} 
		return false;
	}
	
	public String exibirDados() {
		return "Nº da Conta: " + numeroConta + "digito Verificador: " + digitoVerificador + "\n" 
					+ "Nome do Titular: " + nomeTitular + " " + "CPF do Titular: " + cpfTitular +"\n" 
				       + "Saldo Atualizado: " + String.format("%.2f", saldo);
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getDigitoVerificador() {
		return digitoVerificador;
	}
	public void setDigitoVerificador(int digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getCpfTitular() {
		return cpfTitular;
	}
	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	
	
	

}
