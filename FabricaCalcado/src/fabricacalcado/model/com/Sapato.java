package fabricacalcado.model.com;

public class Sapato extends Calcado {
	private String tipoTecido;

	private int pesoSapato;

	public String getTipoTecido() {
		return tipoTecido;
	}

	public void setTipoTecido(String tipoTecido) {
		this.tipoTecido = tipoTecido;
	}

	public int getPesoSapato() {
		return pesoSapato;
	}

	public void setPesoSapato(int pesoSapato) {
		this.pesoSapato = pesoSapato;
	}
	
	public int calcularPeso (int pesoChuva) {
		pesoChuva = pesoChuva + pesoSapato;
		return pesoChuva;
	}
	

}
