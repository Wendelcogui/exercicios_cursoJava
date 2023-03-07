package entidades;

public class Produto {
	private String nome;
	private Double preco;
	
	public Produto() {
	}

	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String etiquetaDePreco() {
		return nome 
				+ " $ " 
				+ String.format("%.2f", preco);
	}

}
