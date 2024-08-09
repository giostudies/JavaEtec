package br.com.montadora.teste;

import javax.swing.JOptionPane;

import br.com.montadora.model.Moto;

public class TesteMoto {
	public static void main(String[] args) {
		
		Moto moto = new Moto();
		
		System.out.println(JOptionPane.showInputDialog("Digite a montadora da moto"));
		
		System.out.println("A montadora da moto é:" + moto.getMontadora());
		
	}

}
