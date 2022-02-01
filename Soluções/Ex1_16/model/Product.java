package model;

public class Product {
	private String nome;
	private double price;
	
	public Product(String nome, double price) {
		super();
		this.nome = nome;
		this.price = price;
	}
	public String getNome() {
		return nome;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
