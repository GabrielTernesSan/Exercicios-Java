package tests;

public class ApoliceTeste {

	private String nome;
	private int idade;
	private double valorPremio;
	
	public ApoliceTeste(String nome, int idade, double valorPremio) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.valorPremio = valorPremio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getValorPremio() {
		return valorPremio;
	}
	public void setValorPremio(double valorPremio) {
		this.valorPremio = valorPremio;
	}
	
	@Override
	public String toString() {
		return "O nome do segurado é " + nome + " ele tem " + idade + " anos, o prêmio da apólice é de " + valorPremio;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if("Curitiba" == obj) {
			return true;
		}else if("Rio de Janeiro" == obj) {
			return true;
		}else if("São Paulo" == obj) {
			return true;
		}else if("Belo Horizonte" == obj) {
			return true;
		}
		return false;
	}
}
