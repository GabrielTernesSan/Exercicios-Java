package tests;

public class CanetaTeste {

	private String marca;
	private String cor;
	private String tamanho;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public String toString() {
		return "A caneta da cor " + this.cor + " da marca " + this.marca + " tem um tamanho " + this.tamanho;
	}
	
}
