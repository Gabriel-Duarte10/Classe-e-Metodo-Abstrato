package entities;

public class PeopleJuridica extends People {

	protected Integer numFuncionarios;
	
	public PeopleJuridica() {
		
	}
	
	public PeopleJuridica(String name, Double rendaAnual, Integer numFuncionarios) {
		super(name, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}
	
	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public Double calculoImp() {
		
		if(numFuncionarios < 10) {
			return rendaAnual * 16 / 100;
		}
		else {
			return rendaAnual * 14 / 100;
		}
	}
	
	
	
}
