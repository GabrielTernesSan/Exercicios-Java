package tests;

public class LampadaTeste {

	private String tipo;
	private int voltagem;
	private String cor;
	private String marca;
	private double preco;
	private int potencia;
	private boolean status;
	
	public LampadaTeste(String tipo, int voltagem, String cor, String marca, double preco, int potencia) {
		super();
		this.tipo = tipo;
		this.voltagem = voltagem;
		this.cor = cor;
		this.marca = marca;
		this.preco = preco;
		this.potencia = potencia;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public boolean getStatus() {
		return status;
	}
	public void apagar() {
		this.status = false;
	}
	public void ascender() {
		this.status = true;
	}
}
