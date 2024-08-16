package br.com.teste.eletronico;

import javax.swing.JOptionPane;

import br.com.model.eletronico.Computador;

public class ComputadorTeste {
public static void main(String[] args) {
	Computador computador = new Computador();
	
	computador.setNome(JOptionPane.showInputDialog("Digite o nome do computador"));
	computador.setConfiguracao(JOptionPane.showInputDialog("Digite as configurações do computador"));
	
	System.out.println("O nome do computador é: " + computador.getNome());
	
	computador.setPrecoOrcamento(Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do orçamento")));
	
	computador.calcularPrecoFinal(700);
	System.out.println("o preço final é: " + computador.getPrecoFinal());
}
}
