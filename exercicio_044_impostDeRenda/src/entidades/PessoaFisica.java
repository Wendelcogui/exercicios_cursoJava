package entidades;

public class PessoaFisica extends Pessoa{
	
	private Double gastoComSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastoComSaude) {
		super(nome, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}

	public Double getGastoComSaude() {
		return gastoComSaude;
	}

	public void setGastoComSaude(Double gastoComSaude) {
		this.gastoComSaude = gastoComSaude;
	}
	
	public Double impostoRendaFisico() {
		
		double imposto;
		
		if (getRendaAnual() <= 20000.00) {
			  imposto = (getRendaAnual() * 15 / 100) - (gastoComSaude * 50 / 100);
		}
		else {
			  imposto = (getRendaAnual() * 25 / 100) - (gastoComSaude * 50 / 100);
		}
			return imposto;	
			
	}

	@Override
	public Double tax() {
		return impostoRendaFisico();
	}
			
}
