package br.com.teste.eletronico;

import javax.swing.JOptionPane;

import br.com.model.eletronico.Monitor;

public class MonitorTeste {
	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		
		monitor.setNome(JOptionPane.showInputDialog("Digite o nome do monitor"));
		monitor.setPolegadas(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de polegadas")));
		
		System.out.println("O nome do monitor: " + monitor.getNome() + " A Quantidade de polegadas: " + 
		monitor.getPolegadas());
	}

}
