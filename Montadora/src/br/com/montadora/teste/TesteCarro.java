package br.com.montadora.teste;

import javax.swing.JOptionPane;

import br.com.montadora.model.Carro;

public class TesteCarro {
public static void main(String[] args) {
	
	Carro carro = new Carro();
	
	carro.setMontadora(JOptionPane.showInputDialog("Digite a montadora do carro:"));
	System.out.println("A montadora do carro é: " + carro.getMontadora());
	carro.setQntJanela(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de janelas")));
	System.out.println("A montadora do carro é: " + carro.getQntJanela());
	
}
}
