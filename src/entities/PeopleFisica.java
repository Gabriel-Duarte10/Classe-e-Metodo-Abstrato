package entities;

public class PeopleFisica extends People {

	private Double GastosSaude;
	
	public PeopleFisica() {
		
	}
	
	public PeopleFisica(String name, Double rendaAnual, Double gastosSaude) {
		super(name, rendaAnual);
		GastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return GastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		GastosSaude = gastosSaude;
	}

	@Override
	public Double calculoImp() {
		if(rendaAnual < 20000){
			return rendaAnual*15/100 - (GastosSaude/2);
		}else {
			
			return rendaAnual *25/100 - (GastosSaude/2);
		}
	}

}
