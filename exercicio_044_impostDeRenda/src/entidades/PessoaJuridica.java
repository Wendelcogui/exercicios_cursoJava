package entidades;

public class PessoaJuridica extends Pessoa{
	
	private Integer numeroDeFuncionario;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionario) {
		super(nome, rendaAnual);
		this.numeroDeFuncionario = numeroDeFuncionario;
	}

	public Integer getNumeroDeFuncionario() {
		return numeroDeFuncionario;
	}

	public void setNumeroDeFuncionario(Integer numeroDeFuncionario) {
		this.numeroDeFuncionario = numeroDeFuncionario;
	}
	
	public double impostoJuridico() {
		
		double imposto;
		
		if (numeroDeFuncionario > 10 ) {
			
			imposto = getRendaAnual() * 14 / 100;
		}
		else {
			imposto = getRendaAnual() * 16 / 100;
		}
		return imposto;
	}

	@Override
	public Double tax() {
		return impostoJuridico();
	}
}
