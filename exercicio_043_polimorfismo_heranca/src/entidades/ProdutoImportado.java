package entidades;

public class ProdutoImportado extends Produto{
	
	private Double taxaAlfandegaria;

	public ProdutoImportado(String nome, Double preco, Double taxaAlfandegaria) {
		super(nome, preco);
		this.taxaAlfandegaria = taxaAlfandegaria;
	}

	public Double getTaxaAlfandegaria() {
		return taxaAlfandegaria;
	}

	public void setTaxaAlfandegaria(Double taxaAlfandegaria) {
		this.taxaAlfandegaria = taxaAlfandegaria;
	}
	
	public Double precoTotal() {
		return getPreco() + taxaAlfandegaria; 
	}
	
	@Override
	public String etiquetaDePreco() {
		return super.getName()  
				+ " $ " 
				+ String.format("%.2f", precoTotal())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", taxaAlfandegaria)
				+ ")";
	}
	
}
