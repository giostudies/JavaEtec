package fabricacalcado.teste.com;

import javax.swing.JOptionPane;

import fabricacalcado.model.com.Sapato;

public class TesteSapato {
	public static void main(String[] args) {
		
		Sapato sapato = new Sapato();
		sapato.setTipoTecido(JOptionPane.showInputDialog("Digite o tipo de tecido do sapato:"));
		sapato.setNomeCalcado(JOptionPane.showInputDialog("Digite o nome do calçado"));
		sapato.setTamanhoCalcado(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do calçado")));
		sapato.setPesoSapato(Integer.parseInt(JOptionPane.showInputDialog("Digite o peso do calçado")));
		
		
		System.out.println("O tipo de tecido do calçado:" + sapato.getTipoTecido() + "\n Nome do calçado: " +
		sapato.getNomeCalcado() + "\n  A numeração: " + sapato.getTamanhoCalcado() + "\n Peso: " + sapato.getPesoSapato());
		
		//Recebendo um valor adicional no peso da chuva para calcular:
		
		int valorAdicional = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do calçado"));

		System.out.println("Peso do sapato na chuva: " + sapato.calcularPeso(valorAdicional));
		
	}

}
