package fabricacalcado.teste.com;

import javax.swing.JOptionPane;

import fabricacalcado.model.com.Chinelo;

public class TesteChinelo {
	public static void main(String[] args) {
		
		Chinelo chinelo = new Chinelo();
		
		chinelo.setNomeCalcado(JOptionPane.showInputDialog("Digite o nome do chinelo"));
		chinelo.setTamanhoCalcado(Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do calçado")));
		chinelo.setTipoBorracha(JOptionPane.showInputDialog("Digite o tipo de borracha do chinelo"));
		
		System.out.println("O chinelo é " + chinelo.getNomeCalcado() + " O tamaho do chinelo: " + chinelo.getTamanhoCalcado()
		+ " O tipo de borracha do chinelo: " + chinelo.getTipoBorracha());
		
	}

}
